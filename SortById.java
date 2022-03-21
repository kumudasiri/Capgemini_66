package com.capgemini.application;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId() > o2.getId()) {
			return 1;
		}else if(o1.getId() < o2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	/*public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId() > o2.getId()) {
			return -1;
		}else if(o1.getId() < o2.getId()) {
			return 1;
		}
		else {
			return 0;
		}
	}*///for descending order 
	
	

}
