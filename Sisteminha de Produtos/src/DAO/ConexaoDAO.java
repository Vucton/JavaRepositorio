package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	private static final String url ="jdbc:mysql://localhost:3306/Produtos";
	private static final String user ="root";
	private static final String password ="1234";
	
	private static Connection conn;
	
	public static Connection getConexao() {
		try {
			if(conn == null) {
				conn=DriverManager.getConnection(url,user,password);
				return conn;
			}else {
				return conn;
			}
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null,"ConexaoDAO: "+ erro);
			return null;
		}
	}

}
