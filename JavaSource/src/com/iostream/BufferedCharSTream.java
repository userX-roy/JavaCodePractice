package com.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedCharSTream {

	void reading() throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("/home/sr/WorkSpace/TestingFileDir/file6"));
		int i;
		while ((i=br.read())!=-1) {
			System.out.print((char)i);
		}
		br.close();
	}
	
	void writting() throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sr/WorkSpace/TestingFileDir/file7" , true));
		String data = "Data has been written";
		bw.write(data);
		bw.close();
	}
	
	void copping() throws Exception{
	
		BufferedReader br = new BufferedReader(new FileReader("/home/sr/WorkSpace/TestingFileDir/file6"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/sr/WorkSpace/TestingFileDir/file7" , true));
		
		int i;
		while ((i=br.read())!=-1) {
			bw.write(i);
		}
		br.close();
		bw.close();
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedCharSTream obj1 = new BufferedCharSTream();
		obj1.reading();
		obj1.writting();
	}

}
