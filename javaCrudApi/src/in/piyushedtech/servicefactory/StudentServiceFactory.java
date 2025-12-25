package in.piyushedtech.servicefactory;

import in.piyushedtech.service.RStudentService;
import in.piyushedtech.service.StudentSeriveImpl;

public class StudentServiceFactory {
	
	private StudentServiceFactory() {
		
	}
	
	private static RStudentService studentService=null;
	
	public static RStudentService getStudentService() {
		if(studentService== null) {
			studentService=new StudentSeriveImpl();
			
		}
		return studentService;
	}

}
