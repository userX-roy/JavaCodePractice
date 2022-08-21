package nareshit.assigenment.com;

import java.util.Scanner;

class Cosmetics {
	float cosmeticsMethod(){
		float price = 0.0f; // to hold the Fruit price inTotal
		
		System.out.println("-----------------------------------------");
		System.out.println("   325 -----Kajal ------ Rs.31.50 / pc");
		System.out.println("   326-----Lip stick ------Rs.78.25 / pc");
		System.out.println("   327 -----Nail polish ------Rs.74.77 / pc");
		System.out.println("   328 -----Lotion ------Rs.290 / pc");
		System.out.println("-----------------------------------------");
		System.out.println("        Please Enter Fruit code : ");
		
		Scanner sc = new Scanner(System.in);
		int cCode = sc.nextInt();
		
		switch(cCode) {
		case 325:
			System.out.println("How many pc of Kajal kit you want ? ");
			int mangoAmount = sc.nextInt(); 
			/*I am Not changing this variables name to save time , though it is not advisable to do so , it makes program 
			 * hard to read 
			 */
			price = 31.50f*mangoAmount;
			break;
		
		case 326:
			System.out.println("How many pc of Lip Stick kit you want ? ");
			int appleAmount = sc.nextInt();
			price = 78.25f*appleAmount;
			break;

		case 327:
			System.out.println("How many pc of Nail Polish kit you want ? ");
			float bananansAmount = sc.nextFloat();
			price = 74.77f*bananansAmount;
			break;

		case 328:
			System.out.println("How many pc of Lotation kit you want ? ");
			float papayaAmount = sc.nextFloat();
			price = 290.0f*papayaAmount;
			break;

		default:
			System.out.println("Enter correct Cosmetic product code please ");
			cosmeticsMethod();
			break;
		}
		sc.close();
		return price;
	}
}
