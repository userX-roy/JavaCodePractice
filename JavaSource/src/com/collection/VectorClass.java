package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClass {
    void meth1(){
	    Vector<Object> v = new Vector<>();
		v.add(34);//Insertion Order is maintained
		v.add(78);//Heterogeneous data is allowed
		v.add(56);//null is allowed
		v.add(70);//Duplicates are allowed
		v.add(93);//It is available from Java 1.0 version [Legacy Class]
		v.add(null);//Default Capacity : 10 [Size Increse by Double]
		v.add("Saikat");//It is Synchronized
		v.add(56.78);
		v.add(68.7f);
		
		System.out.println(v);
		System.out.println("---===---------=========----------======------=-----------");
		
		//extracting elements using for loop
		System.out.println("Extracting element using for loop : ");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		//extracting elements using for-each loop
		System.out.println("Extracting element using for-each loop : ");
		for (Object object : v) {
			System.out.println(object);
		}
		
		//extracting elements using iterator interface
		System.out.println("Extracting element using Iterator interface : ");
		Iterator<Object> i= v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		//extracting elements using iterator interface
		System.out.println("Extracting element using Enumaration interface : ");
		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		}
    
    void vectorMethods(){
    	Vector<Object> v = new Vector<>();
		
    	//addElemet() : add element in vector
    	v.addElement(34);
		v.addElement(78);
		v.addElement(56);
		v.addElement(70);
		v.addElement(93);
		v.addElement(56);
		v.addElement(null);
		v.addElement("Saikat");
		v.addElement(56.78);
		v.addElement(68.7f);
		//removeElement(Object o): Removes the first (lowest-indexed) occurrence of the argument from this vector.
		v.removeElement(56);
		System.out.println(v);
		
		//will remove at particular index position
		v.remove(6);
		System.out.println(v);
		
		//lastElement() & firstEelement : Returns last and first element of the vector.
		System.out.println("Last element : "+v.lastElement()+", First element : "+v.firstElement());
		
		//will return the current capacity (capacity() method only available for Vector)
		System.out.println("Capacity of the Vector is : "+v.capacity());
		
		//will remove all elements and set the size zero
		v.removeAllElements();
		
		System.out.println("V vector is empty : "+v.isEmpty());
		System.out.println("Size of V vector is : "+v.size());
    }
    
    void meth2(){
    	//passing user devined class-object into vector
    	
    	CommonClass cc = new CommonClass(67, "Sukhen Dutta");
    	CommonClass cc2 = new CommonClass(97, "Ashis Dutta");
    	CommonClass cc3 = new CommonClass(7, "Kali Dutta");
    	CommonClass cc4 = new CommonClass(01, "Narendra Nath Dutta");
    	CommonClass cc5 = new CommonClass(02, "Subhas Chandra Bose");
    	Vector<CommonClass> v = new Vector<>();
    	v.addElement(cc);
    	v.addElement(cc3);
    	v.addElement(cc2);
    	v.addElement(cc4);
    	v.addElement(cc5);
    	
    	Enumeration<CommonClass> enumeration = v.elements();
    	
    	while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
    }
		
		public static void main(String[] args) {
			VectorClass vc = new VectorClass();
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("-------Method 1--------");
			System.out.println("++++++++++++++++++++++++++");
			
			vc.meth1();
			
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("--------Method 2---------");
    		System.out.println("++++++++++++++++++++++++++");
			
			vc.meth2();
			
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("----Vector Methods-----");
			System.out.println("++++++++++++++++++++++++++");
			
			vc.vectorMethods();
		}
}