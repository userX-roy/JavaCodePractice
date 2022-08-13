package assigenment.internshala.module3;

public class Pastry extends Cacke{
	@Override
	public void display(String nameString , float price) {
		System.out.println(nameString+ " : Rs. "+price+" per piece");
	}
}
