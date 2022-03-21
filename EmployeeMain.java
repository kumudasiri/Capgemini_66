package com.capgemini.application;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		// Array of object
		Employee list[] = new Employee[10];

		int counter = 0;

		// to take current date and time

		/*
		 * DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); Date
		 * date = new Date(); Employee e1 = new Employee(100, "Kumuda Siri",
		 * 1000,dateFormat.format(date)); System.out.println(e1.toString());
		 * 
		 * list[0] = e1;
		 * 
		 * System.out.println(list[0].toString());
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the Choice: ");
			System.out.println("------------------------------------------------------------");
			System.out.println("Press 1 for Adding Employee ");
			System.out.println("Press 2 for Editing Employee ");
			System.out.println("Press 3 for Printing maximum Salary of Employee ");
			System.out.println("Press 4 for Printing minimum Salary of Employee ");
			System.out.println("Press 5 for Printing Sorted  Salaries of Employee ");
			System.out.println("Press 6 for Printing Sorted  Names of Employee ");
			System.out.println("Press 7 for Display the List");
			System.out.println("Press 8 exit");
			System.out.println("------------------------------------------------------------");

			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee name");
				String name = sc.next();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				// taking the current date automatically starts
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				// current date logic ends

				String newdate = dateFormat.format(date);
				// Now create an object of class employee and add it to list
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;

			} else if (choice == 2) {
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						System.out.println("Press" + " " + count + " " + "for" + e);
					}
					count = count + 1;
				}
				int editindex = sc.nextInt();// is for selecting the employee

				System.out.println("Press 1 for updating Name");
				System.out.println("Press 2 for updating salary");
				System.out.println("Press 3 for updating ID");

				int editoption = sc.nextInt();// this is for selecting the operation of update
				if (editoption == 1) {
					System.out.println("Enter the new name to update:");
					list[editindex].setName(sc.next());
				} else if (editoption == 2) {
					System.out.println("Enter the new salary to update:");
					list[editindex].setSalary(sc.nextInt());
				} else if (editoption == 3) {
					System.out.println("Enter the new ID to update:");
					list[editindex].setId(sc.nextInt());
				} else {
					System.err.println("Wrong option!Please enter valid option");
				}

			} else if (choice == 3) {
				double maxSalary = 0.0;
				for (int j = 0; j < list.length; j++) {
					// System.out.println(list[j]);
					if (list[j] != null) {
						if (list[j].getSalary() > maxSalary) {
							maxSalary = list[j].getSalary();
						}

					}
				}
				System.out.println("The Maximum salary is:" + maxSalary);

			} else if (choice == 4) {
				double minSalary = 99999.99;
				for (int j = 0; j < list.length; j++) {
					if (list[j] != null) {// as list is not completely filled it will point to null
						// hence perform operation only on the objects that are filled in the list
						if (list[j].getSalary() < minSalary) {
							minSalary = list[j].getSalary();
						}

					}
				}
				System.out.println("The Minimum salary is:" + minSalary);

			} else if (choice == 5) {
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						for (int j = 0; j < list.length; j++) {
							if (list[j] != null) {
								if (list[i].getSalary() < list[j].getSalary()) {// ascending order sorting using bubble
																				// sort
									double temp = list[i].salary;
									list[i].salary = list[j].salary;
									list[j].salary = temp;
								}
							}
						}
					}
				}
				for (Employee e : list) {
					if (e != null) {
						System.out.println(e.salary);
					}
				}

			} else if (choice == 6) {
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null) {
						for (int j = 0; j < list.length; j++) {
							if (list[j] != null) {
								if ((list[i]).compareTo(list[j]) < 0) {
									/*String temp = list[i].name;
									list[i].name = list[j].name;
									list[j].name = temp;*///descending order
									String temp = list[j].name;
									list[j].name = list[i].name;
									list[i].name = temp;//Ascending order 
								}
							}
						}
					}
				}
				for (Employee e : list) {
					if (e != null) {
						System.out.println(e.name);
					}
				}

			} else if (choice == 8) {
				break;
			} else if (choice == 7) {
				for (Employee e : list) {
					if (e != null) {
						System.out.println(e);
					}
				}

			} else {
				System.err.println("Wrong choice,try again!");
			}

		}
		sc.close();

	}

}
