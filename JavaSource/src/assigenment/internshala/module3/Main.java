package assigenment.internshala.module3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//CAKE PART :
		Cacke cake1 = new Cacke();
		cake1.setNameString("Chocolate Brownie");
		cake1.setPrice(250.0f);
		
		Cacke cake2 = new Cacke();
		cake2.setNameString("Chocolate Maple");
		cake2.setPrice(300.0f);
		
		
		List<Cacke> cakeList = new ArrayList<>();
		
		cakeList.add(cake1);
		cakeList.add(cake2);
		
		
		
		//PASTRY PART :
		
		Pastry pastry1 = new Pastry();
		pastry1.setNameString("Black Forest");
		pastry1.setPrice(35.0f);
		
		Pastry pastry2 = new Pastry();
		pastry2.setNameString("Choco Truffle");
		pastry2.setPrice(40.0f);
		
		
		List<Pastry> pastries = new ArrayList<>();
		
		pastries.add(pastry1);
		pastries.add(pastry2);
		
		System.out.println("   Today's Special Menu");
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("Today's Special Cakes");
		System.out.println("-------------------------");
		
		for (Cacke cake : cakeList) {
			cake.display(cake.getNameString(), cake.getPrice());
		}
		
		
		System.out.println();
		System.out.println("Today's Special Pastries");
		System.out.println("-------------------------");
		
		for (Pastry pastry : pastries) {
			pastry.display(pastry.getNameString(), pastry.getPrice());
		}
		
	}

}
