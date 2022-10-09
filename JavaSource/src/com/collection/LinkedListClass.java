package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	void meth1(){
		LinkedList<Object> ll = new LinkedList<>();
		ll.add("Saikat");//Insertion Order is maintained
		ll.add(34);//Heterogeneous data is allowed
		ll.add("Kolkata");//null is allowed
		ll.add("BHARAT");//Duplicates are allowed
		ll.add("Hello");//It is available from Java 1.2 Version
		ll.add(34.78);//Default Capacity is 0 [size increases by Double]
		ll.add(67.9f);// elements are stored in form of nodes
		ll.add(null);//linked-list is not Synchronized
		System.out.println("Element in the LinkedList : ");
		System.out.println(ll);
		
		//extracting using for loop
		System.out.println("--Extracting element using For Loop--");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//extracting using for-each loop
		System.out.println("--Extracting element using For Loop--");
		for (Object object : ll) {
			System.out.println(object);
		}
		
		//extracting using ListIterator Interface
		System.out.println("--ListIterator Interface--");
		ListIterator<Object> i = ll.listIterator();
		System.out.println("Extracting from first index");
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println(" ");
		System.out.println("----------");
		System.out.println("Extracting from last index");
		while(i.hasPrevious()){
			System.out.print(i.previous()+" ");
		}
		System.out.println(" ");
		
	}
	
	void meth2(){
		//passing user-defined object to linked-list
		
		LinkedList<CommonClass> ll = new LinkedList<>();
		CommonClass cc = new CommonClass(67, "Sukhen Dutta");
    	CommonClass cc2 = new CommonClass(97, "Ashis Dutta");
    	CommonClass cc3 = new CommonClass(7, "Kali Dutta");
    	CommonClass cc4 = new CommonClass(01, "Narendra Nath Dutta");
    	CommonClass cc5 = new CommonClass(02, "Subhas Chandra Bose");
    	
    	ll.add(cc);
    	ll.add(cc3);
    	ll.add(cc2);
    	ll.add(cc4);
    	ll.add(cc5);
    	
    	ListIterator<CommonClass> le = ll.listIterator();
    	while (le.hasNext()) {
			System.out.println(le.next());
			
		}
    	
	}
	
	void linkedListMethod(){
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add("Hello");
		linkedList.add("Kolkata");
		linkedList.add(45);
		linkedList.addFirst(67.9f);
		
		System.out.println("LinkedList is : "+linkedList);

		//add(index , element) : will add element in some specific position
		
		linkedList.add(1, "Forcefully Inserted");
		/*
		 * getLast() , getFirst() , removeFirst() , removeLast(),
		 * addLast() , addFirst()
		 */
		System.out.println("--------");
		System.out.println(linkedList);
		System.out.println("--------");
		
		System.out.println("getLast() : "+linkedList.getLast()+" getFirst() : "+linkedList.getFirst()+" removeLast() : "+linkedList.removeLast());
		
		System.out.println(linkedList);
		
		System.out.println("This LinkedList contains 'Kolkata' , is : "+linkedList.contains("Kolkata"));
	}
	
	public static void main(String[] args) {
		LinkedListClass lc = new LinkedListClass();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("-------Method 1--------");
		System.out.println("++++++++++++++++++++++++++");
		
		lc.meth1();
		
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("--------Method 2---------");
		System.out.println("++++++++++++++++++++++++++");
		
		lc.meth2();
		
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("----LinkedList Methods-----");
		System.out.println("++++++++++++++++++++++++++");
		
		lc.linkedListMethod();
	}
}