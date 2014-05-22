package com.corejava.collections;

import java.util.Iterator;

public class Exmple_1 {

	public static class Count implements Iterable<Integer> {
		private int count;

		public Count(int cnt) {
			this.count = cnt;
		}

		@Override
		public Iterator<Integer> iterator() {
			return new Iterator<Integer>() {
				private int i = 0;

				public boolean hasNext() {
					return i < count;
				}

				public Integer next() {
					i++;
					return i;
				}

				public void remove() {
					throw new UnsupportedOperationException();
				}
			};

		}

		public static void main(String[] args) {
			int total = 0;
			for (int i : new Count(3)) {
			total += i;
			}
			System.out.println(total);
			
		}

	}
}
