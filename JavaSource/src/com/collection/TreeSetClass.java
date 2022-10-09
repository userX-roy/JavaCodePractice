package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	void meth1(){
		TreeSet<Object> ts = new TreeSet<>();
		//ts.add("Saikat");
		//ts.add(45);//Insertion order is not maintained but data store in assending order
		//ts.add(null);//null is not allowed
		//ts.add(67);//heterogeneous data is not allowed
		//ts.add(67.7);//duplicate is not allowed
//		ts.add("Kolkata");//default capacity is 16 [size increases by double]
//		ts.add("dELTA");//it available from Java 1.4v
//		ts.add("Hello");// is not synchronized.
//		ts.add("World");//Load Factor 0.75
//		ts.add("Bharat");
		
		ts.add(677);
		ts.add(890);
		ts.add(556);
		ts.add(5);
		ts.add(333);
		
		System.out.println("The TreeSet Elements are : "+ts);
		//Extracting elements using Iterator interface
		System.out.println("Extracting element using iterator interface : ");
		
		Iterator<Object> iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.print(" "+iterator.next());
		}
		
		System.out.println(" ");
        
		System.out.println("Extracting element using iterator interface in disending manner : ");
		
		Iterator<Object> i2 = ts.descendingIterator();
		while (i2.hasNext()) {
			System.out.print(" "+i2.next());
		}
		
		System.out.println(" ");
		
	}
	
	/*void meth2(){
		//passing user-defined object in HashSet
		TreeSet<Object> ts = new TreeSet<>();
		CommonClass cc = new CommonClass(67, "Sukhen Dutta");
    	CommonClass cc2 = new CommonClass(97, "Ashis Dutta");
    	CommonClass cc3 = new CommonClass(7, "Kali Dutta");
    	CommonClass cc4 = new CommonClass(01, "Narendra Nath Dutta");
    	CommonClass cc5 = new CommonClass(02, "Subhas Chandra Bose");
    	
    	ts.add(cc);
    	ts.add(cc2);
    	ts.add(cc3);
    	ts.add(cc4);
    	ts.add(cc5);
    	
    	
    	System.out.println(" ");
	}*/
	
	void linkedHashSetMethods(){
		TreeSet<Object> ts = new TreeSet<>();
		//ts.add("Saikat");
		//ts.add(null);
		//ts.add("Kolkata");
		ts.add(677);
		ts.add(890);
		ts.add(556);
		ts.add(5);
		ts.add(333);
		
		System.out.println(ts);
		
		System.out.println("Size of hs is : "+ts.size());
		
		System.out.println("Extracting Data in Disending order :");
		System.out.println(ts.descendingSet());
		
		//will print less than values
		System.out.println("headSet() : "+ts.headSet(556));
		
		//will print greater than eqal to values
		System.out.println("tailSet() : "+ts.tailSet(556));
	}
	
	public static void main(String[] args) {
		TreeSetClass tsc = new TreeSetClass();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("-------Method 1--------");
		System.out.println("++++++++++++++++++++++++++");
		tsc.meth1();
//		System.out.println("++++++++++++++++++++++++++");
//		System.out.println("--------Method 2---------");
//		System.out.println("++++++++++++++++++++++++++");
//		tsc.meth2();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("----TreeSet Methods-----");
		System.out.println("++++++++++++++++++++++++++");
		tsc.linkedHashSetMethods();
	}
}
