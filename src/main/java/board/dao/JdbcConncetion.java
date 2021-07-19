package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcConncetion {
Connection conn;

public Connection getConn() {
	return conn;
}

public void setConn(Connection conn) {
	this.conn = conn;
}

public JdbcConncetion() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:xe","system","1111");

		if(conn==null) {System.out.println("DB���ӿ� ����");}
		System.out.println("DB���� ����");
		
		}catch(Exception e) { }
}

public void jdbcClose() {
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
