package nareshit.assigenment.com;

import java.util.Scanner;

public class Main {
	
	static float totalPrice = 0.0f;
	
	void mainListofProduct() {
		
		System.out.println("  ========Welcome To Our Store========");
		System.out.println("----------------------------------------");
		System.out.println("    Available products in the store");
		System.out.println("            1) Fruits ");
		System.out.println("            2) Vegetables");
		System.out.println("            3) Cosmetics");
		
		System.out.println("Please Enter Your Choice :  1 or 2 or 3 or 4");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		
		switch(option) {
		
		case 1:
			totalPrice = totalPrice + new Fruit().fruitMethod();
			new OtherClasses().continuationConformer();
			break;
		
		case 2:
			totalPrice = totalPrice + new Vegetables().vegetablesMethod();
			new OtherClasses().continuationConformer();
			break;	
        
		case 3:
			totalPrice = totalPrice + new Cosmetics().cosmeticsMethod();
			new OtherClasses().continuationConformer();
			break;
			
        default:
        	System.out.println("Opps !!! wrong choice");
        	new OtherClasses().continuationConformer();
			break;
		}
		
		scanner.close(); // scanner class closed to avoid resource leak
	}

	public static void main(String[] args) {
		Main mainF = new Main();
		mainF.mainListofProduct(); //All Types of Item will be listed by this method call
		System.out.println(totalPrice);
	}
	

}
