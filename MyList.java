package com.util;

@SuppressWarnings("unchecked")
public class MyList<T> {

	private int capacity;

	private int size;

	private T[] array;

	public MyList() {

		this.capacity = 10;
		array = (T[]) new Object[capacity];

	}

	public MyList(int capacity) {

		this.capacity = capacity;
		array = (T[]) new Object[capacity];

	}

	public int size() {

		return this.size;

	}

	public int capacity() {

		return this.capacity;

	}

	public void add(T element) {

		if (size == capacity) {
			expandArray();
		}
		array[size] = element;
		size++;

	}

	private void expandArray() {

		T[] temp = array;

		array = (T[]) new Object[capacity * 2];

		for (int i = 0; i < temp.length; i++) {

			array[i] = temp[i];

		}

		this.capacity = capacity * 2;
	}

	public T get(int index) {
		if (index > size || index < 0) {
			return null;
		}
		return array[index];

	}

	public T remove(int index) {
		T result = array[index];

		if (index > size || index < 0) {
			return null;
		}

		for (int i = index; i < size; i++) {
			if (index + 1 >= size) {
				array[index + 1] = null;
			} else {
				array[index] = array[index + 1];
			}

		}
		return result;
	}

	public T set(int index, T data) {
		if (index > size || index < 0) {
			return null;
		}
		array[index] = data;
		return data;
	}

	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(array[i]).append(",");
		}
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append("]");
		return sb.toString();

	}

	public int indexOf(T data) {
		for (int i = 0; i < size; i++) {
			if (data == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(T data) {
		for (int i = size - 1; i >= 0; i--) {
			if (data == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {

		return size > 0 ? false : true;

	}

	public T[] toArray() {

		T[] result = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			result[i] = array[i];
		}
		return result;
	}

	public void clear() {
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
	}

	public MyList<T> subList(int start, int finish) {
		MyList<T> result = new MyList<>();
		if (start > size || finish > size || start < 0 || finish < 1) {
			return null;
		}
		for (int i = start; i < finish; i++) {
			result.add(array[i]);
		}
		return result;
	}

	public boolean contains(T data) {
		for (int i = 0; i < size; i++) {
			if (data == array[i]) {
				return true;
			}
		}
		return false;
	}
}// end of class
