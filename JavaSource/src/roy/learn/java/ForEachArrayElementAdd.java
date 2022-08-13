package roy.learn.java;

public class ForEachArrayElementAdd {
	public static void main(String[] args) {
		double[] myArr = {45.00d , 745.00d , 10.00457d , 789.458624d};
		
		double sum = 0;
		//this for-each loop will select every element of myArr and put it on selectionVar variable
		for (double selectionVar: myArr) {
			sum+=selectionVar;
		}
		
		System.out.println("Sum of the array elements is : "+sum);
	}

}
