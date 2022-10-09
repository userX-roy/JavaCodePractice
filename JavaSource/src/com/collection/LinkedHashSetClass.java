package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	void meth1(){
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("Saikat");//Insertion order is maintained
		lhs.add(null);//null is allowed
		lhs.add("Kolkata");//heterogeneous data is allowed
		lhs.add(67.7);//duplicate is not allowed
		lhs.add(890);//default capacity is 16 [size increases by double]
		lhs.add(56.5f);//it available from Java 1.4v
		lhs.add(5);// is not synchronized.
		lhs.add(45);//Load Factor 0.75
		
		System.out.println("The HashSet Elements are : "+lhs);
		//Extracting elements using Iterator interface
		System.out.println("Extracting element using iterator interface : ");
		
		Iterator<Object> i = lhs.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println(" ");
	}
	
	void meth2(){
		//passing user-defined object in HashSet
		LinkedHashSet<CommonClass> hs = new LinkedHashSet<>();
		CommonClass cc = new CommonClass(67, "Sukhen Dutta");
    	CommonClass cc2 = new CommonClass(97, "Ashis Dutta");
    	CommonClass cc3 = new CommonClass(7, "Kali Dutta");
    	CommonClass cc4 = new CommonClass(01, "Narendra Nath Dutta");
    	CommonClass cc5 = new CommonClass(02, "Subhas Chandra Bose");
    	
    	hs.add(cc);
    	hs.add(cc2);
    	hs.add(cc3);
    	hs.add(cc4);
    	hs.add(cc5);
    	
    	Iterator<CommonClass> iterator = hs.iterator();
    	while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
    	
    	System.out.println(" ");
	}
	
	void linkedHashSetMethods(){
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("Saikat");
		lhs.add(null);
		lhs.add("Kolkata");
		lhs.add(67.7);
		lhs.add(890);
		lhs.add(56.5f);
		lhs.add(5);
		
		System.out.println("Size of hs is : "+lhs.size());
	}
	
	public static void main(String[] args) {
		LinkedHashSetClass lhsc = new LinkedHashSetClass();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("-------Method 1--------");
		System.out.println("++++++++++++++++++++++++++");
		lhsc.meth1();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("--------Method 2---------");
		System.out.println("++++++++++++++++++++++++++");
		lhsc.meth2();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("----LinkedHashSet Methods-----");
		System.out.println("++++++++++++++++++++++++++");
		lhsc.linkedHashSetMethods();
	}
}