package roy.learn.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileINputOUtput {

	public static void main(String[] args) {

		String data = "I am Saikat Roy";
		
		/*Writting to a file :*/
		try {
		FileOutputStream fos = new FileOutputStream("myFile.txt");
		
		//converting input data into byte array
		byte[] byteData = data.getBytes();
		
		//writting byte array to the file
		fos.write(byteData);
		fos.close();
		} catch (IOException exception) {
			
			System.out.println(exception);
		}
		
		/*Reading from a file*/
		try {
		FileInputStream fis = new FileInputStream("myFile.txt");
		int readData;
		
		//data is present in form of byte data and terminated by -1
		//fis.read function read data from that file as integer
		//printing ecah char by typecasting
		while ((readData=fis.read()) != -1) {
			System.out.print((char)readData);
		}
		
		fis.close();
		
		} catch (IOException exception) {
			System.out.println(exception);
		}

	}

}
