package com.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedByteSTream{
	
	void reading() throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/sr/WorkSpace/TestingFileDir/file5"));
		
		int i;
		while ((i=bis.read())!=-1) {
			System.out.print((char)i);
		}
		
		bis.close();
		
		System.out.println();
	}
	
	
	void writting() throws Exception{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/sr/WorkSpace/TestingFileDir/file6"));
		String data = "Learning Java.......";
		byte[] arr = data.getBytes();
		bos.write(arr);
		
		bos.close();
	}
	
	void copying() throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/home/sr/WorkSpace/TestingFileDir/file5"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/sr/WorkSpace/TestingFileDir/file6" , true));
		
		int i;
		while((i=bis.read())!=-1) {
			bos.write(i);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("Program Ended.");
	}
	
	public static void main(String[] args) throws Exception{
		BufferedByteSTream obj1 = new BufferedByteSTream();
		
		obj1.reading();
		
		obj1.writting();
		
		obj1.copying();
	}
}
