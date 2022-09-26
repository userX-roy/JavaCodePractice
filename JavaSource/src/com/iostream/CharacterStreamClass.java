package com.iostream;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamClass {
	
	void reading() throws Exception{
		FileReader fr = new FileReader("/home/sr/WorkSpace/TestingFileDir/file3");
		
		int i;
		while ((i=fr.read())!=-1) {
			
			System.out.print((char)i);
		}
		
		fr.close();
		System.out.println();
	}
	
	
	void writting() throws Exception{
		FileWriter fw = new FileWriter("/home/sr/WorkSpace/TestingFileDir/file4");
		
		String str = "Hello Saikat Roy here";
		
		fw.write(str);
		
		fw.close();
		System.out.println("Data Written");
	}
	
	void coppyFile() throws Exception{
		FileReader fr = new FileReader("/home/sr/WorkSpace/TestingFileDir/file4");
		FileWriter fw = new FileWriter("/home/sr/WorkSpace/TestingFileDir/file5");
		
		int i;
		while ((i=fr.read())!=-1) {
			fw.write(i);
		}
		fw.close();
		fr.close();
		
		System.out.println("Program Ended.");
	}
	
	
	public static void main(String[] args) throws Exception{
		CharacterStreamClass csc = new CharacterStreamClass();
		csc.reading();
		csc.writting();
		csc.coppyFile();
	}
}