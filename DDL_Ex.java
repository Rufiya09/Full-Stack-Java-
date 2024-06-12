import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL_Ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/odigos", "root", "rpsconsulting");
		// create the statement Statement/PreparedStatement/CallableStataement
		Statement stmt = conn.createStatement();
		// execute query DDL-->execute(),DML--->executeUpdate(),DRL-->executeQuery()
		boolean result=stmt.execute("create table odigos_emps(eid int,ename varchar(10))");
		// close the connection
		conn.close();
		System.out.println("table created");
	}
}
