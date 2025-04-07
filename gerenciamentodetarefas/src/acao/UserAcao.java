package acao;
import classes.ConnectionMysql;
import classes.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class UserAcao {
	private ConnectionMysql connection = new ConnectionMysql();
	
	public UserAcao(){
		System.out.println("Dao do usuário criado com sucesso!");
	}
	
	//Listagem de usuários
	
	public void listar() throws Exception{
		String query = "select * from users";
		Connection conn = this.connection.connect();
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet result = ps.executeQuery();
		String usuarios[] = null;
		while (result.next()){
			System.out.println("Nome do Usuário = "+result.getString("name")+"\n E-mail = "+result.getString("email")+"\n");
		}
		
	}
	
	public void cadastrar(User user) throws Exception{
		try {
			String query = "insert into users(name, email) values(?, ?)";
			Connection conn = this.connection.connect();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.execute();
			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
}
