package nareshit.assigenment.com;

import java.util.Scanner;

public class OtherClasses {
	// this function will decide if the program terminate or not
	void continuationConformer(){
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Do you want to continue ? yes or no ?");
		//Scanner scanner2 = new Scanner(System.in);
		String inputString = scanner2.next();
		scanner2.close();
		if (inputString=="yes"||inputString=="Yes"|| inputString =="YES"||inputString =="Y") {
			new Main().mainListofProduct();
		}
		else {
			scanner2.close();
			return;
		}
		
	}
}
