package abstraction;

public class Fourwheeler extends Car{
	public static void main(String[] args) {
		 
		/*can't create object of interface 
		  new Animal(); -> INVALID
		  but can create referance variable of that interface , i.e. "Car car" is valid
		  But we can create child class object and assign to interface ref variable
		  i.e., "Car car = new Fourwheeler();" is valid
		 */
		
		Car car = new Fourwheeler(); 
		
		car.start();
		
		//child class is inheriting some behaviour of parent class
		car.stop();
		
	}

	/*it's mandatory to implement abstract methods in child class 
	 But normal methods implementation are optional*/
	
	@Override
	void start() {
		System.out.println("Insert the key to start the veichle ");
	}
	
}
