package gerenciamentodetarefas.testes;

import classes.User;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import acao.UserAcao;
import classes.ConnectionMysql;

public class Main {
	public static void main(String args[]) throws Exception{
		UserAcao user = new UserAcao();
		user.listar();
		
		String name = JOptionPane.showInputDialog("Digite seu nome");
		String email = JOptionPane.showInputDialog("Digite seu e-mail");
		User vanessa = new User(name, email);
		user.cadastrar(vanessa);
	}
}
