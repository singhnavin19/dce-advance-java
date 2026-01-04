package jdbccc;

import javax.sql.DataSource;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.sql.*;

public class BasicConnectionJavaSql implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","root");
        Statement statement=con.createStatement();
        int rollNo=10;
        PreparedStatement preparedStatement=con.prepareStatement("insert into student_details values (?,?,?)");
        preparedStatement.setInt(1,rollNo);
        preparedStatement.setString(2,"Navin1");
        preparedStatement.setString(3,"SubjectX");
        preparedStatement.execute();


//        statement.execute("insert into student_details values (?,?,?)");
//        statement.execute("delete from student_details where id=1");

        ResultSet resultSet=statement.executeQuery("select * from student_details");
        while (resultSet.next()){
            System.out.print(resultSet.getString("id"));
            System.out.println(resultSet.getString("name"));
        }

        con.close();
    }
}
