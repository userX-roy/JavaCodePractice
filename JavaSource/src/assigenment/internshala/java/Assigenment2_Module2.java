package assigenment.internshala.java;

import java.util.Scanner;

public class Assigenment2_Module2 {
	public static void main(String[] args) {
		System.out.println("Tax Calculator App");
		System.out.println("----- WELCOME ------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total person count: ");
		int personCount = scanner.nextInt();
		
		String[] name = new String[personCount];
		long[] amount = new long[personCount];
		
		for (int i= 0;  i<personCount; i++) {
			System.out.println("Enter Person "+(i+1)+" name :");
			name[i] = scanner.next();
			System.out.println("Enter Person "+name[i]+"'s Income :");
			amount[i] = scanner.nextLong();
		}
		scanner.close();
		
		calculateTax(name, amount);
		
	}
	
	public static void calculateTax(String[] name , long[] amount) {
		double[] tax = new double[amount.length];
		for (int i = 0; i < amount.length; i++) {
			if (amount[i]>=300000) {
				tax[i] =(double) amount[i] * (20.0d/100.0d);
			}
			else if (amount[i]>=100000 && amount[i]<300000) {
				tax[i] =(double) amount[i] * (10.0d/100.0d);
			}
			else if (amount[i]<100000) {
				tax[i] = 0.0d;
			}
		}
		System.out.printf("\n");
		System.out.println("—————————————---------------");
		System.out.println("Names with liable taxes");
		System.out.println("—————————————---------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+ " : ₹ "+tax[i]);
		}
	}

}