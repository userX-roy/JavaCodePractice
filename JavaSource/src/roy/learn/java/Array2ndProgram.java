package roy.learn.java;

public class Array2ndProgram {
	public static void main(String[] args) {
		/*float[] arr;
		arr[0] = 4.0f;
		
		^^This type of initialization is not allowed^^
		*/
		float[] arr = new float[4];
		arr[0] = 34.0f;
		arr[1] = 56.9f;
		arr[3] = 78.56f;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
