package control;

import java.sql.SQLException;

import totalcross.db.sqlite.SQLiteUtil;
import totalcross.sql.PreparedStatement;
import totalcross.sql.ResultSet;
import totalcross.sql.Statement;
import totalcross.sys.Settings;
import totalcross.sys.Vm;
import totalcross.ui.dialog.MessageBox;

public class Controle {
	private static SQLiteUtil util;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	public static SQLiteUtil CriarConexao() {
		try {
			
			util = new SQLiteUtil(Settings.appPath, "Rest.db");
			Vm.debug(util.fullPath);
		
		}catch(Throwable t) {
			new MessageBox("Nao deu", "Nao criou o Banco").popup();
			throw new RuntimeException();
		}
		return util;
	}
	
	public static boolean CriarTabelas() {
		try {
			Statement st = util.con().createStatement();
			st.execute("CREATE TABLE IF NOT EXISTS APP_USER("
					+ "ID VARCHAR(40) DEFAULT NULL,"
					+ "NOME VARCHAR(40) DEFAULT NULL,"
					+ "CPF VARCHAR(20) DEFAULT NULL,"
					+ "LOGIN VARCHAR(40) DEFAULT NULL,"
					+ "SENHA VARCHAR(30) DEFAULT NULL);");
			
			return true;
			
		} catch (SQLException e) {
			new MessageBox("Nao deu", "Nao criou a tabela").popup();
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean AddUsuario(String nome, String cpf, String login, String senha) {
		try {
			ps = util.prepareStatement("INSERT INTO APP_USER(ID, NOME, CPF, LOGIN, SENHA) VALUES(?,?,?,?,?)");
			ps.setString(1, cpf);
			ps.setString(2, nome);
			ps.setString(3, cpf);
			ps.setString(4, login);
			ps.setString(5, senha);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				return true;
			}
		
		}catch(Exception e) {
			new MessageBox("Não inserido", "nao foi possivel inserir").popup();
		}
		
		return false;
	}
	
	public static String[] Logando(String login) {
		String[] user = new String[4];
		
		try {
			ps = util.prepareStatement("SELECT * FROM APP_USER WHERE LOGIN='"+ login +"'");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				user[0] = rs.getString(2);
				user[1] = rs.getString(3);
				user[2] = rs.getString(4);
				user[3] = rs.getString(5);
				return user;
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
