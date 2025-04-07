package classes;
import java.sql.*;

public class ConnectionMysql {
	private String database;
	private String user;
	private String password;
	
	public ConnectionMysql(){
		this.database = "tasks";
		this.user = "root";
		this.password = "g3d1te2016";
	}
	
	public ConnectionMysql(String database, String user, String password){
		this.database = database;
		this.user = user;
		this.password = password;

	}
	public Connection connect() throws SQLException{
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/"+this.database, this.user, this.password);
			System.out.println("Conexão realizada com sucesso!");
			return connection;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
