package com.capgemini.application;

//generic works with wrapper class(int-Integer,float-Float,double-Double) and was introduced in java 5


class EmployeeGeneric<T> {
	
	
	//tight coupling
	
	//loose coupling-by passing datatype as parameter as in below:
	//class<T>-in this form
	
	private T id;

	public EmployeeGeneric(T id) {
		this.id = id;
		
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("Id is" + id);
	}

}

public class Generic {

	public static void main(String[] args) {
		EmployeeGeneric<Integer> e = new EmployeeGeneric<Integer>(1001);
		e.print();
	} 

}
