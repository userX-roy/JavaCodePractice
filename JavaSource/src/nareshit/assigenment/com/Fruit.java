package nareshit.assigenment.com;

import java.util.Scanner;

class Fruit {
	
	static float priceF = 0.0f; // to hold the Fruit price inTotal
	
	Scanner sc = new Scanner(System.in);
	
	float fruitMethod(){
		
		System.out.println("-----------------------------------------");
		System.out.println("   11 -----Mangoes ------1 kg is 50");
		System.out.println("   12-----Apples ------1 kg is 100");
		System.out.println("   13 -----Bananans ------1 kg is 25");
		System.out.println("   14 -----Papaya ------1 kg is 44");
		System.out.println("-----------------------------------------");
		System.out.println("        Please Enter Fruit code :");
		int fCode = sc.nextInt();
		
		switch(fCode) {
		case 11:
			System.out.println("How much KG Mango you want ? ");
			float mangoAmount = sc.nextFloat();
			priceF = 50.0f*mangoAmount;
			break;
		
		case 12:
			System.out.println("How much KG Apples you want ? ");
			float appleAmount = sc.nextFloat();
			priceF = 100.0f*appleAmount;
			break;

		case 13:
			System.out.println("How much KG Bananans you want ? ");
			float bananansAmount = sc.nextFloat();
			priceF = 25.0f*bananansAmount;
			break;

		case 14:
			System.out.println("How much KG Bananans you want ? ");
			float papayaAmount = sc.nextFloat();
			priceF = 44.0f*papayaAmount;
			break;

		default:
			System.out.println("Enter correct fruit code please ");
			new Fruit().fruitMethod();
			break;
		}
		return priceF;
	}
	
	

}
