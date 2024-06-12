import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Ex {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// loading the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odigos", "root", "rpsconsulting");
			// create the statement Statement/PreparedStatement/CallableStataement
			Statement stmt = conn.createStatement();
			// execute query DDL-->execute(),DML--->executeUpdate(),DRL-->executeQuery()
			//int result=stmt.executeUpdate("insert into odigos_emps values(1,'sandeep')");
			int result=stmt.executeUpdate("update odigos_emps set ename='suresh' where eid=1");
			// close the connection
			conn.close();
			System.out.println(result+"records updated");
		}
	}