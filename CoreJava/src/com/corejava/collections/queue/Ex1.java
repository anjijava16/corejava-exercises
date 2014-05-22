package com.corejava.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;
/*
 * To describe basic Queue<E> interface methods
 * 
 * 
 * */

public class Ex1 {

	private class Task {
		private Long id;
		private String name;
		private Long priority;
		
		public Task(Long id,String name, Long priority){
			this.id = id;
			this.name = name;
			this.priority = priority;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPriority() {
			return priority;
		}
		public void setPriority(Long priority) {
			this.priority = priority;
		}
		
	}
	public static void main(String[] args) {
		Ex1 eg = new Ex1();
		Queue<Task> taskQueueBasic = new ArrayDeque<Task>();
		taskQueueBasic.offer(eg.new Task(1L,"Designing",1L));
		taskQueueBasic.offer(eg.new Task(2L,"Coding",2L));
		taskQueueBasic.offer(eg.new Task(3L,"Testing",3L));
		
		//peek method
		//Task head = taskQueueBasic.peek();
		//System.out.println(head.getName());
		
		//poll method
		//Task head = taskQueueBasic.poll();
		//Task newHead = taskQueueBasic.peek();
		//System.out.println(newHead.getName());
		
		//element method
		//Task head = taskQueueBasic.element();
		//System.out.println(head.getName());
		
		//remove method
		//Task head = taskQueueBasic.remove();
		//Task newHead = taskQueueBasic.element();
		//System.out.println(newHead.getName());

	}

}
