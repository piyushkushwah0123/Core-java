package in.piyushedtech.daofactory;

import in.piyushedtech.persistance.RStudentDao;
import in.piyushedtech.persistance.StudentDaoimpl;

public class StudentDaoFactory {

	private StudentDaoFactory() {

	}

	private static RStudentDao studentDao = null;

	public static RStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoimpl();

		}
		return studentDao;
	}
}