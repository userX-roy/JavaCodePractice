package nareshit.assigenment.com;

import java.util.Scanner;

class OtherClasses {
	
	Scanner scanner2 = new Scanner(System.in);
	
	private String addrString;
	
	// this function will decide if the program terminate or not
	void continuationConformer(){
		
		System.out.println("Do you want to continue shopping ? 'Y' for yes and 'N' for no ");

			char inputString = scanner2.next().charAt(0);
			
			if (inputString == 'y' || inputString =='Y') {
				new Main().mainListofProduct();
			}
			
			else {
				if(inputString == 'n' || inputString =='N') {
					    return;
				}
				else {
				System.out.println("Please choose from valid options  ");
				continuationConformer();
				}
			}			
	
	}
	
	void eachProductCount() {
		System.out.println("++++++++++Your Each Product Summary++++++++++");
		System.out.println("You buy Fruit amount of Rs. "+Fruit.priceF);
		System.out.println("You buy Vegitable amount of Rs. "+Vegetables.priceV);
		System.out.println("You buy Cosmatics amount of Rs. "+Cosmetics.priceC);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
	
	//will take address from user
	void addressInput() {
		System.out.println("Please Provide your address , so that we can ship the peoducts");
		addrString = scanner2.nextLine();
	}
	
	//will show address from user
	void addressShow() {
		System.out.println("We will ship the Product to the following address :");
		System.out.println(addrString);
	}
	
	//will calculate if eligible for discount or not
	float discountCalculator(float totalPrice) {
		float amountAfterDiscount = totalPrice;
		
		if (totalPrice >= 500.0f) {
			amountAfterDiscount = totalPrice - ((5/(float)100)*totalPrice);
			return amountAfterDiscount;
		}
		
		else {
			return amountAfterDiscount;
		}
	}
	
	// responsible for printing the buying summary
	void afterCompletionBuy() {
		addressInput(); // will input customer address
		
		System.out.println(" ");
		System.out.println(" ");//To beautify output
		
		System.out.println("=======================================================");
		
		System.out.println("-------------Your Buying Summary------------------------");
		System.out.println(" ");
		eachProductCount(); // will list down each types of products price individually
		System.out.println("Your Total Amount is : "+Main.totalPrice);
		if (Main.totalPrice >= 500.0f) {
			
			System.out.println("You won a discount of 5% as you shop more than Rs.500 with us :)");
			System.out.println("You have to pay us Rs. "+discountCalculator(Main.totalPrice));
		
		} 
		else {
			System.out.println("You have to pay us Rs. "+discountCalculator(Main.totalPrice));
		}
		System.out.println(" ");
		System.out.println(" ");
		
		addressShow();
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Thanks , hope your needs are fullfilled , please visit again ");
		
		System.out.println("=======================================================");
		
	}
}