package com.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ByteStreamClass {

	void fileInput() throws Exception{
		FileInputStream fi = new FileInputStream("/home/sr/WorkSpace/TestingFileDir/file1");
		int i;
		while ((i=fi.read())!=-1) {
			System.out.print((char)i);
		}
		fi.close();
	}
	
	void fileOutput() throws Exception{
		FileOutputStream fo = new FileOutputStream("/home/sr/WorkSpace/TestingFileDir/file2" , true);
		//Passing true will append the data after the existing text in the file. 
		//without true old text will replace new text
		System.out.println("Write Data as you want : ");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		byte[] arr = data.getBytes();
		
		fo.write(arr);
		
		fo.close();
		sc.close();
	}
	
	void coppyFile() throws Exception{
		FileInputStream fi = new FileInputStream("/home/sr/WorkSpace/TestingFileDir/file2");
		FileOutputStream fo = new FileOutputStream("/home/sr/WorkSpace/TestingFileDir/file3");
		
		int i;
		while ((i=fi.read())!=-1) {
			fo.write(i);
		}
		fi.close();
		fo.close();
		
		System.out.println("Program Ended.");
	}
	
	public static void main(String[] args) throws Exception{
		
		ByteStreamClass aobj=new ByteStreamClass();
		
		aobj.fileInput();
		aobj.fileOutput();
		aobj.coppyFile();

	}

}
