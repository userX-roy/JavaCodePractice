package assigenment.internshala.module3;

public class Cacke {
	
	private String nameString;
	private float price;
	
	public String getNameString() {
		return nameString;
	}
	
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public void display(String nameString , float price) {
		System.out.println(nameString+" : Rs. "+price+" per pound");
	}
}
