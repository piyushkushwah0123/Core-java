package com.piyush.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {

	public static void main(String[] args) throws FileNotFoundException {
        new FileReader("missing.txt");
    }
}
