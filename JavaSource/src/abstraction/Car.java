package abstraction;

public abstract class Car {
	
	abstract void start();
	
	//an abstract class may or may not contain a normal method or an abstract method
	
	public void stop() {
		System.out.println("Push the break saddle");
	}

}

