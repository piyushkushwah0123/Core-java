package in.piyushedtech.service;

public interface RStudentService {

//	Operation to be implemented
	
	public String addStudent(String snsme, Integer sage, String saddress);

	public String searchStudent(Integer sid);
	
	public String updateStudent(String snsme, Integer sage, String saddress);
	
	public String deleteStudent(Integer sid);
}
