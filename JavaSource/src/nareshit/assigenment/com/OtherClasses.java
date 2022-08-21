package nareshit.assigenment.com;

import java.util.Scanner;

public class OtherClasses {
	
	// this function will decide if the program terminate or not
	void continuationConformer(){
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Do you want to continue ? yes or no ?");
		String inputString = scanner2.next();
		
		if (inputString=="yes"||inputString=="Yes"|| inputString =="YES"||inputString =="Y") {
			scanner2.close();
			new Main().mainListofProduct();
		}
		
		else {
			scanner2.close();
			return;
		}
		System.out.println("Hello");
	}
}