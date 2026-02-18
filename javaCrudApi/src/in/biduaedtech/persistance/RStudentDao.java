package in.biduaedtech.persistance;

import in.biduaedtech.dto.Student;

public interface RStudentDao {
	
//	Operation to be implemented
	
	public String addStudent(String sname, Integer sage, String saddress);

	public String searchStudent(Integer sid);
	
	public String updateStudent(String sname, Integer sage, String saddress);
	
	public String deleteStudent(Integer sid);
	
}
