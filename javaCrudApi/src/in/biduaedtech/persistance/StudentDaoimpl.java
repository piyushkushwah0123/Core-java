package in.biduaedtech.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoimpl implements RStudentDao {

    private static final String DBURL = "jdbc:mysql://localhost:3306/sqldb";
    private static final String DBUSERNAME = "root";
    private static final String DBPASSWORD = "root";

    @Override
    public String addStudent(String sname, Integer sage, String saddress)
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);

        String sql = "insert into student(sname,sage,saddress) values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, sname);
        ps.setInt(2, sage);
        ps.setString(3, saddress);

        int row = ps.executeUpdate();

        if (row == 1)
            return "success";
        else
            return "fail";
    }

    @Override
    public String searchStudent(Integer sid) throws SQLException, ClassNotFoundException {
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
    	
    	String sql = "select * from student where sid=?";
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, sid);

        ResultSet rs = ps.executeQuery();

        return null;
    }

    @Override
    public String updateStudent(String sname, Integer sage, String saddress) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String deleteStudent(Integer sid) throws SQLException, ClassNotFoundException {
        return null;
    }
}