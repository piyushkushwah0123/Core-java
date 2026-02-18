package in.biduaedtech.service;
import in.biduaedtech.dto.Student;
import in.biduaedtech.servicefactory.StudentServiceFactory;
public class StudentSeriveImpl implements RStudentService{

	RStudentService stdService;
	
	public String addStudent(String sname, Integer sage, String saddress) {
		stdService = StudentServiceFactory.getStudentService();
		return stdService.addStudent(sname, sage, saddress);
	}

	@Override
	public String searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(String sname, Integer sage, String saddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}	
}
