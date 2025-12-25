package in.piyushedtech.controller;

import in.piyushedtech.service.RStudentService;
import in.piyushedtech.servicefactory.StudentServiceFactory;

//Controller Layer
public class TestApp {
	public static void main(String[] args) {
		
		// Connection con=DriverManager.getConnection(url,username,passsword();
		RStudentService studentService = StudentServiceFactory.getStudentService();
		
	}
	
}
