package roy.learn.java;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		 List<String> nameList = new ArrayList<String>();
		 
		 nameList.add("Saikat");
		 nameList.add("Sunil");
		 nameList.add("Soumojit");
		 nameList.add("Saikat");
		 nameList.add("Akash");
		 
		// System.out.println(nameList.get(2));
		 
		 nameList.remove(1);
		 
		 nameList.add(1, "Rahul"); //will add Rahul at index 1
		 
		 nameList.set(1, "Rupankar");
		 
		 for (String string : nameList) {
			System.out.println(string);
		}
		 
		System.out.println();
		 
		 //Any object can be inside collection framework
		
		 //Objects of employeee class is created
		 Employeee e1 = new Employeee("Sudip");
		 Employeee e2 = new Employeee("Rittik");
		 Employeee e3 = new Employeee("Petter");
		 Employeee e4 = new Employeee("Krishna");
		 
		 Employeee e5 = new Employeee();
		 
		 //Employee type ArrayList is created
		 List<Employeee> employeees = new ArrayList<Employeee>();
		 
		 //Adding Employeee class object in Employee ArrayList
		 employeees.add(e1);
		 employeees.add(e2);
		 employeees.add(e3);
		 employeees.add(e4);
		 employeees.add(e5); //will print null
		 
		 for (Employeee employeee : employeees) {
			System.out.println(employeee.name);
		}

	}

}

class Employeee {
	String name;
	//Default constractor
	public Employeee() {
	}
	//parametarized constractor , for taking the employee name as input
	public Employeee(String name) {
		this.name = name;
	}
}
