package com.capgemini.application;

//Collections is an interface and many classes implement them
//Collections can achieve all the operations performed on  data 
//such as searching, sorting, insertion, manipulation, and deletion
//Collection refers to group of objects
//interface-set,Queue,list
//class-ArrayList,LinkedList implement the interfaces

import java.util.ArrayList;
import java.util.*;

public class MyCollections {
	public static void main(String[] args) {
		// creating the list
		ArrayList<Integer> list = new ArrayList<Integer>();
		// can be String,Integer,Double etc
		list.add(1);// to add a value
		list.add(2);
		list.add(3);
		System.out.println("ArrayList:");
		System.out.println();
		//to get a value or access a value
		System.out.println("The element at index 0:  "+list.get(0));
		System.out.println("The size of arraylist  " + list.size());

		//list.clear();//for clearing the values

		boolean found = list.contains(3);// Search for given item
		// if found return true else false
		 System.out.println("The found status of element 3"+ found);

		list.remove(2);//for removing at a particular index

		System.out.println(list.indexOf(2));

		// System.out.println(list);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(78);
		list2.add(100);
		list.addAll(list2);// merging two lists
		// System.out.println(list.lastIndexOf(20));
		// System.out.println(list);

		// sorting
		Collections.sort(list);//ascending order
		System.out.println("The sorted list:" + list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("The Reverse order sorting is:" + list);
		
		list.stream();
		System.out.println("Stream method:"+ list);

		ArrayList<String> al = new ArrayList<String>();
		// Adding elements to the ArrayList
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Grapes");

		@SuppressWarnings("unchecked")
		ArrayList<String> al2 = (ArrayList<String>) al.clone();
		System.out.println("Copy of ArrayList: " + al2);

		/* ArrayList to Array Conversion */
		String array[] = new String[al.size()];
		for (int j = 0; j < al.size(); j++) {
			array[j] = al.get(j);
		}

		/* one more method is to use toArray */
		String strarray[] = al.toArray(new String[al.size()]);

		/* Displaying Array elements */
		
		 for(String k: strarray) { System.out.println(k); }
		 
		
		System.out.println("--------------------------------------");
		
		System.out.println("LinkedList:");
		System.out.println();

		LinkedList<Integer> llist = new LinkedList<Integer>();

		llist.add(10);
		llist.add(30);
		llist.add(20);
		llist.add(2);

		// adding the value at first location
		llist.addFirst(01);

		// adding the value at the last
		llist.addLast(100);

		System.out.println("The sublist:" +llist.subList(0, 3));//(from index,to index)

		// get the last element
		llist.getLast();

		// get using index
		//System.out.println("The element in 2nd index:" + list.get(2));

		// add the element at last tail
		llist.offer(10);

		llist.offerFirst(20);

		llist.offerLast(30);

		// return the index of value
		llist.indexOf(20);

		// check for list is empty or not
		llist.isEmpty();

		llist.poll();//will return head 

		llist.peekFirst();//will return the first element
		llist.peekLast();//will return last element

		llist.pollFirst();//will remove and return the head element
		llist.pollLast();//will remove and return the last element

		// for displaying linked list
		//llist.forEach(System.out::println);

		Iterator<Integer> it = llist.iterator();

		while (it.hasNext()) {
			// it will give the value
			System.out.println("Value: " + it.next());
		}

	}

}
