package core;

import java.util.ArrayList;

public class Stack<T> implements IStack {
	private ArrayList<T> s1;
	private int capacity;
	private int size;
	private int top;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		this.s1 = new ArrayList<>();
	}
	
	@Override
	public boolean isEmpty() {
		return s1.isEmpty();
	}
	
	@Override
	public boolean isFull() {
		return s1.size() == capacity;
	}

	@Override
	public T getTop() {
		if (!isEmpty()) {
			return s1.get(s1.size() - 1);
		} else {
			return null;
		}
	}
	
	@Override
	public int getSize() {
		return s1.size();
	}

	@Override
	public void push(Object elm)  {
		if(!isFull()) {
			s1.add((T) elm);
		} 
	}

	@Override
	public Object top() {
		return top >= size-1;
	}

}
