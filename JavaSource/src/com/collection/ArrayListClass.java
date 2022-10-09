package com.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListClass {

	void meth1(){
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(15);
		al.add(98);
		al.add(56);
		al.add(9888);
		al.add("Saikat");
		al.add(true);
		al.add(null);
		al.add(78);
		al.add(45);
		
		//Extracting Elements using for loop
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("------------------------------------------");
		
		//extracting using for each loop
		
		for (Object o: al) {
			System.out.print(o+ " ");
		}
		
		System.out.println(" ");
		
		System.out.println("------=======----------=======----------");
		
		//extracting using iterator interface
		
		Iterator<Object> i = al.iterator();
			
		while (i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		
		System.out.println("");
		
	}
	
	void arrayListMethods(){
        ArrayList<Object> al = new ArrayList<Object>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
        
		al.add(15);//Insertion order is maintained
		al.add(98);//Duplicates are allowed
		al.add(56);//Default capacity is 10 [After that increased by half]
		al.add(9888);//It is available from Java 1.7 version
		al.add("Saikat");//Heterogeneous data is allowed
		al.add(true);//Array list is not Synchronized by default
		al.add(null);//null is allowed
		al.add(78);
		al.add(45);
		al.add(98);
		
		
		al2.add(15);
		al2.add(56);
		al2.add(78);
		al2.add(45);
		//al2.add(34);
		
		
		//size() : returns the size of arraylist
		System.out.println("al size : "+al.size());
		
		//get() : to get an element of a particular index position
		System.out.println("Element at Index Position 2 is : "+al.get(2));
		
		//contain() : will return true if the collection contain that particular data otherwise return false
		System.out.println("al colection contain value 'Saikat' is : "+al.contains("Saikat"));
		
		//containAll() : will return true if a collection contain all the elements of another collection
		System.out.println("al contains all the object of al2 is : "+al.containsAll(al2));
		
		//remove(index value) : will remove the element available on that particular index 
		System.out.println("Before removing : ");
		System.out.println(al);
		al.remove(2);
		System.out.println("After removing : ");
		System.out.println(al);
		
		//remove(Object) : will remove that object if available 
		System.out.println("Before removing : ");
		System.out.println(al2);
		al2.remove((Object)78);
		System.out.println("After removing : ");
		System.out.println(al2);
		
		//clear() : clear method will clear all the elements of the arrayList
		al.clear();
		System.out.println("al list is cleared");
		//isEmpty() : return true if the arraylist is empty 
		System.out.println("al list is empty : "+al.isEmpty());
		System.out.println("al2 list is empty : "+al2.isEmpty());
	}
	
	
	void meth2(){
		
		//passing user-defined object in arrayList
		
		ArrayList <CommonClass> al = new ArrayList<CommonClass>();
		
		CommonClass aobj1 = new CommonClass(1, "Saikat");
		CommonClass aobj2 = new CommonClass(2, "Sumit");
		CommonClass aobj3 = new CommonClass(3, "Akash");
		
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		
		System.out.println(al);
		
		System.out.println("======----------=======---------==========------------=========");
		
        //Extracting using Iterator interface:
		
		Iterator<CommonClass> i = al.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayListClass aobj = new ArrayListClass();
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("-------Method 1--------");
		System.out.println("++++++++++++++++++++++++++");
		
		aobj.meth1();
		
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("--------Method 2---------");
		System.out.println("++++++++++++++++++++++++++");
		
		aobj.meth2();
		
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("----ArrayList Methods-----");
		System.out.println("++++++++++++++++++++++++++");
		
		aobj.arrayListMethods();
		
	
	}

}