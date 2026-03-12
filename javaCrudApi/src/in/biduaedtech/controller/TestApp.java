package in.biduaedtech.controller;

import java.util.Scanner;

import in.biduaedtech.service.RStudentService;
import in.biduaedtech.servicefactory.StudentServiceFactory;

public class TestApp {

	public static void main(String[] args) throws Exception {

		RStudentService studentService = StudentServiceFactory.getStudentService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name:");
		String name = sc.next();

		System.out.println("Enter Student Age:");
		Integer age = sc.nextInt();

		System.out.println("Enter Student Address:");
		String address = sc.next();

		String s = studentService.addStudent(name, age, address);
		
		System.out.println(s);

//		String result = studentService.searchStudent(1);
//		System.out.println(result);
	}
}