package com.capgemini.application;

import java.util.*;

public class MyCollection_1 {

	public static void main(String[] args) {
		// creating a stack

		Stack<Integer> s = new Stack<Integer>();

		s.push(10);// to push element into the stack
		s.push(20);
		s.push(30);
		s.push(40);

		s.pop();// to pop the element

		System.out.println("Stack");
		System.out.println();

		System.out.println("Stack size is " + s.size());// size of the stack

		System.out.println(s.isEmpty());// returns true-if stack is empty

		System.out.println(s.search(10));// to search the element and returns the index

		Iterator<Integer> it = s.iterator();

		while (it.hasNext()) {
			System.out.println("The value in stack is:" + it.next());
		}

		System.out.println("-------------------------------");

		System.out.println("Vector");
		System.out.println();

		Vector<Integer> v = new Vector<Integer>(5);

		v.add(10);
		v.add(90);
		v.add(50);
		v.add(60);
		v.addElement(20);

		v.remove(0);

		Iterator<Integer> vit = v.iterator();
		while (vit.hasNext()) {
			System.out.println("Vector values before sorting are " + vit.next());
		}

		Collections.sort(v);

		System.out.println("-------------------------------");

		for (int value : v) {
			System.out.println("Vector values after sorting are " + value);
		}

		System.out.println("Vector Size is: " + v.size());

		System.out.println("-------------------------------");

		System.out.println("Hashed Set");
		System.out.println();

		HashSet<Integer> hset = new HashSet<Integer>();
		HashSet<Integer> hset1 = new HashSet<Integer>();

		hset.add(100);
		hset.add(200);
		hset.add(300);
		hset.add(300);// duplicate value addition
		hset1.add(400);
		hset1.add(500);

		hset.addAll(hset1);// merge two sets

		System.out.println(hset);

		System.out.println("The size of Hashset " + hset.size());

		// convert to array using .toArray()
		Integer harray[] = new Integer[hset.size()];
		hset.toArray(harray);

		for (int e : harray) {
			System.out.println(e);
		}

		System.out.println("-------------------------------");
		

		System.out.println("LinkedHashSet");
		System.out.println();
		

		LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();

		// Adding elements to linkedhashset
		lhset.add(99);
		lhset.add(7);
		lhset.add(0);
		lhset.add(67);
		lhset.add(89);
		lhset.add(66);

		lhset.remove(67);
		System.out.println("The size of linked hash set :" + lhset.size());
		System.out.println("The elemnts of LinkedHash set :" + lhset);

		System.out.println(lhset.contains(67));

		System.out.println("-------------------------------");
		

		System.out.println("TreeHashSet");
		System.out.println();
		

		TreeSet<Integer> tset = new TreeSet<Integer>();

		// Adding elements to TreeSet
		tset.add(88);
		tset.add(7);
		tset.add(101);
		tset.add(0);
		tset.add(3);
		tset.add(222);

		tset.remove(7);
		System.out.println("The size of tree hash set :" + tset.size());
		System.out.println("The elements of TreeSet:" + tset);

		System.out.println("First Value: " + tset.pollFirst());
		System.out.println("Last Value: " + tset.pollLast());

		System.out.println("SubSet: " + tset.subSet(3, 222)); // from element,to element(exclusive)
		System.out.println("HeadSet: " + tset.headSet(101));

		Iterator<Integer> titr = tset.descendingIterator();// only for treeset
		while (titr.hasNext()) {
			System.out.println(titr.next());
		}

	}

}
