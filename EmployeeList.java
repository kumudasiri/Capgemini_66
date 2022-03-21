package com.capgemini.application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> ls = new ArrayList<Employee>();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		Employee e1 = new Employee(101, "Kumuda Siri", 45000, dateFormat.format(date));
		Employee e2 = new Employee(102, "Likitha", 50000, dateFormat.format(date));
		Employee e3 = new Employee(103, "Anusree", 60000, dateFormat.format(date));
		Employee e4 = new Employee(104, "Rakshith", 47000, dateFormat.format(date));
		
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		
		//System.out.println(ls);
		//Collections.sort(ls);//ascending order-using comparable
		//Collections.sort(ls,Collections.reverseOrder());//descending order-using comparable
		
		Collections.sort(ls,new SortById());//To sort by id using comparator
		Collections.sort(ls,new SortByName());//to sort by salary using comparator
		//Collections.sort(ls,new SortBySalary());
		
		
		/*for(Employee employeeObj : ls){
		      if("Rakshith".equalsIgnoreCase(employeeObj.getName())){
		        System.out.println(employeeObj.getId());
		      }
		    }*/
		
		/*double salary = employee.getSalary();
		String s = Double.toString(salary);*/
		
		
		for(Employee e:ls) {
			System.out.println(e);
		}
		

	}

}
