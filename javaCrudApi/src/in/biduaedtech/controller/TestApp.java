package in.biduaedtech.controller;
import java.sql.DriverManager;
import in.biduaedtech.service.RStudentService;
import in.biduaedtech.servicefactory.StudentServiceFactory;

//Controller Layer
public class TestApp {
	public static void main(String[] args) {
		
		// Connection con=DriverManager.getConnection(url,username,passsword();
		RStudentService studentService = StudentServiceFactory.getStudentService();
			
	}
	
}
