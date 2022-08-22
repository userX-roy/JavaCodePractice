package nareshit.assigenment.com;

import java.util.Scanner;

class Vegetables {
	
	static float priceV = 0.0f;
	
	Scanner sc = new Scanner(System.in);
	
	float vegetablesMethod(){
		
		System.out.println("-----------------------------------------");
		System.out.println("   21 -----Potato ------1 kg is 41");
		System.out.println("   22-----Brinjal ------1 kg is 35");
		System.out.println("   23 -----Carrots ------1 kg is 60");
		System.out.println("   24 -----Beetroot ------1 kg is 44");
		System.out.println("-----------------------------------------");
		System.out.println("        Please Enter Fruit code : ");
		
		int vCode = sc.nextInt();
		
		switch(vCode) {
		case 21:
			System.out.println("How much KG Potato you want ? ");
			float mangoAmount = sc.nextFloat(); 
			/*I am Not changing this variables name to save time , though it is not advisable to do so , it makes program 
			 * hard to read 
			 */
			priceV = 41.0f*mangoAmount;
			break;
		
		case 22:
			System.out.println("How much KG Brinjal you want ? ");
			float appleAmount = sc.nextFloat();
			priceV = 35.0f*appleAmount;
			break;

		case 23:
			System.out.println("How much KG Carrots you want ? ");
			float bananansAmount = sc.nextFloat();
			priceV = 60.0f*bananansAmount;
			break;

		case 24:
			System.out.println("How much KG Beetroot you want ? ");
			float papayaAmount = sc.nextFloat();
			priceV = 44.0f*papayaAmount;
			break;

		default:
			System.out.println("Enter correct Vegetable code please ");
			vegetablesMethod();
			break;
		}
		
		return priceV;
	}
}
