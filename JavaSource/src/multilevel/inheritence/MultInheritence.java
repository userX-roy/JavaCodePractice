package multilevel.inheritence;

public class MultInheritence {
	public static void main(String[] args) {
		Puppy puppy = new Puppy(); 
		puppy.run();
		
		puppy.setAge(6);
		puppy.setSize(12);
		System.out.println(puppy.getAge());
		System.out.println(puppy.getSize());
		
		Animal animal = new Cow(); //UPCASTING
		/*
		 In case of up casting we can create a parent class ref variable pointing to Child class object
		 */
		animal.run();
	}
	
}
	
    class Animal{
    	String name;
    	public void run(){
    		System.out.println("Animl running");
    	}
    }
    
    class Cow extends Animal{
    	public void run() {
			System.out.println("Cow is running");
			super.run();
		}
    	
    }
    
    class Dog extends Animal{
    	String breed;
    	
    	public void bark() {
			System.out.println("Wohh! wooh!");
		}
    }
    	
    class Puppy extends Dog{
    	int age , size;
    	
    	public void run() {
			System.out.println("Puppy is running");
		}
    	

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}	
    	
    }
    
    