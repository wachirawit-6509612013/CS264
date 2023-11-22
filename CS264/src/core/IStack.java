package core;
public interface IStack<T> {
	boolean isEmpty();
	int getSize();
	Object top();
	boolean isFull();
	T getTop();
	void push(T elm) throws Exception;
	
}