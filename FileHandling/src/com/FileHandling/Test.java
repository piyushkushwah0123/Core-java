package com.FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args)throws IOException {
		
//		File file=new File("java2batch.txt");
//		file.createNewFile();
//		
//		System.out.println("File created........");
		
		// Folder create

//		File file=new File("javaA4");
//		file.mkdir();
//		
//		System.out.println("File created.....");
		
	/*	FileWriter fw = new FileWriter("javaA4/myfile.txt");
		fw.write("Hello Piyush");
		
		System.out.println("Data Written in file..........");
		
		fw.close();
	*/
		

		// Word count ---> Space Count 
	/*	FileReader fr = new FileReader("javaA4/myfile.txt");
		
		int i = fr.read();   // char --> unicode [ Hello Piyush ]
		
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();			
		}	
	*/
		
		FileReader fr = new FileReader("javaA4/myfile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String statement = br.readLine();
		System.out.println(statement);
		
	}

}
