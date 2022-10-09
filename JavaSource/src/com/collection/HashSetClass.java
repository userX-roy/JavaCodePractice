package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	void meth1(){
		HashSet<Object> hs = new HashSet<>();
		hs.add("Saikat");//Insertion order is not maintained
		hs.add(null);//null is allowed
		hs.add("Kolkata");//heterogeneous data is allowed
		hs.add(67.7);//duplicate is not allowed
		hs.add(890);//default capacity is 16 [size increases by double]
		hs.add(56.5f);//it available from Java 1.2v
		hs.add(5);// is not synchronized.
		hs.add(45);//Load Factor 0.75
		
		System.out.println("The HashSet Elements are : "+hs);
		//Extracting elements using Iterator interface
		System.out.println("Extracting element using iterator interface : ");
		
		Iterator<Object> i = hs.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println(" ");
	}
	
	void meth2(){
		//passing user-defined object in HashSet
		HashSet<CommonClass> hs = new HashSet<>();
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
	
	void hashSetMethods(){
		HashSet<Object> hs = new HashSet<>();
		hs.add("Saikat");
		hs.add(null);
		hs.add("Kolkata");
		hs.add(67.7);
		hs.add(890);
		hs.add(56.5f);
		hs.add(5);
		
		System.out.println("Size of hs is : "+hs.size());
	}
	
	public static void main(String[] args) {
		HashSetClass hsc = new HashSetClass();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("-------Method 1--------");
		System.out.println("++++++++++++++++++++++++++");
		hsc.meth1();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("--------Method 2---------");
		System.out.println("++++++++++++++++++++++++++");
		hsc.meth2();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("----HashSet Methods-----");
		System.out.println("++++++++++++++++++++++++++");
		hsc.hashSetMethods();
	}
}