package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class IoStreamDemo {

	public static void main(String[] args) throws Exception {

//		FileWriter fw = new FileWriter("data.txt");
//		fw.write("Hello Piyush");
//		
//		fw.flush();
//		fw.close();

//		FileReader fr = new FileReader("data.txt");
//		int i = fr.read();
//		while (i != -1) {
//			System.out.print((char) i);
//			i = fr.read();                // read next character and reinitialization 
//
//		}

//		FileReader fr = new FileReader("data.txt");
//		BufferedReader br = new BufferedReader(fr);
//		
//	    String  line=br.readLine();  // If you want to read the file line data then readline() method
//	    
//	    System.out.println(line);

		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
}
