package nareshit.assigenment.com;

import java.util.Scanner;

class Vegetables {
	float vegetablesMethod(){
		float price = 0.0f; // to hold the Fruit price inTotal
		
		System.out.println("-----------------------------------------");
		System.out.println("   225 -----Potato ------1 kg is 41");
		System.out.println("   226-----Brinjal ------1 kg is 35");
		System.out.println("   227 -----Carrots ------1 kg is 60");
		System.out.println("   228 -----Beetroot ------1 kg is 44");
		System.out.println("-----------------------------------------");
		System.out.println("        Please Enter Fruit code : ");
		
		Scanner sc = new Scanner(System.in);
		int vCode = sc.nextInt();
		
		switch(vCode) {
		case 225:
			System.out.println("How much KG Potato you want ? ");
			float mangoAmount = sc.nextFloat(); 
			/*I am Not changing this variables name to save time , though it is not advisable to do so , it makes program 
			 * hard to read 
			 */
			price = 41.0f*mangoAmount;
			break;
		
		case 226:
			System.out.println("How much KG Brinjal you want ? ");
			float appleAmount = sc.nextFloat();
			price = 35.0f*appleAmount;
			break;

		case 227:
			System.out.println("How much KG Carrots you want ? ");
			float bananansAmount = sc.nextFloat();
			price = 60.0f*bananansAmount;
			break;

		case 228:
			System.out.println("How much KG Beetroot you want ? ");
			float papayaAmount = sc.nextFloat();
			price = 44.0f*papayaAmount;
			break;

		default:
			System.out.println("Enter correct Vegetable code please ");
			vegetablesMethod();
			break;
		}
		sc.close();
		return price;
	}
}