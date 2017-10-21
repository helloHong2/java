package ch6.ex01;

import java.util.ArrayList;

public class Stack<E> {
	private ArrayList<E> entry;
	
	public Stack() {
		entry = new ArrayList<E>();
	}
	
	public void push(E data) {
		entry.add(data);		
	}
	
	public void pop(E data) {
		entry.remove(data);
	}
	
	public void isEmpty() {
		entry.clear();
	}
}
