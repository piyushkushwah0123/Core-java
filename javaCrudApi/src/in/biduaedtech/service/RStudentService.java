package in.biduaedtech.service;

import in.biduaedtech.dto.Student;

public interface RStudentService {

//	Operation to be implemented
	
	public String addStudent(String sname, Integer sage, String saddress);

	public String searchStudent(Integer sid);
	
	public String updateStudent(String sname, Integer sage, String saddress);
	
	public String deleteStudent(Integer sid);
	
}
