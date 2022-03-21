package com.capgemini.application;


public class Employee implements Comparable<Employee> {

	
	//local variables
	public String name;
	public double salary;
	public String doj;
	public int id;
	
	//constructor 
	public Employee(int id,String name, double salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		
	}
	
	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// toString method for printing
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
		}
		
		/*//sorting based on name
		public int compareTo(Employee e) {
			if(e!=null) {
			return getName().compareTo(e.getName());
			}
			return 0;
		}*/
	
		
		/*//for sorting based on Id
		public int compareTo(Employee o) {
			if(this.getId() > o.getId()) {
				return 1;
			}else if(this.getId() < o.getId()) {
				return -1;
			}
			else {
				return 0;
			}
		
		}*/
		
		//Sorting based on salary
		public int compareTo(Employee o) {
			if(this.getSalary() > o.getSalary()) {
				return 1;
			}else if(this.getSalary() < o.getSalary()) {
				return -1;
			}
			else {
				return 0;
			}
		
		}
		
}
