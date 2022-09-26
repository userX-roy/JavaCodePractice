package roy.learn.java;

public class patternPrinting{

	public static void main(String[] args) {
		//pattern();
		
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
	
	/*static void pattern() {
		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.println("* ");
			}
			
			System.out.println();
		}

}*/
}
