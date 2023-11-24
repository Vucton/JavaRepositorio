package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class frmLoginVIEW extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenhaUsuario;
	private JTextField txtNomeUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginVIEW frame = new frmLoginVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmLoginVIEW() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel user = new JLabel("Usuario");
		user.setBounds(102, 66, 46, 14);
		contentPane.add(user);

		JLabel password = new JLabel("Senha");
		password.setBounds(102, 128, 46, 14);
		contentPane.add(password);

		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setBounds(102, 147, 240, 20);
		contentPane.add(txtSenhaUsuario);

		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(102, 83, 240, 20);
		contentPane.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);

		JButton btnEntrarSistema = new JButton("Entrar");
		btnEntrarSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLoginView();

			}

			public void telaLoginView() {
				try {
					
					UsuarioDTO objusuariodto = new UsuarioDTO();
					
					objusuariodto.setNome(txtNomeUsuario.getText());
					objusuariodto.setSenha(txtSenhaUsuario.getText());
					

					UsuarioDAO objusuariodao = new UsuarioDAO();
					ResultSet rsusuariodao = objusuariodao.autenticacaousuario(objusuariodto);

					if (rsusuariodao.next()) {

						frmTelaPrincipalVIEW objfrmprincipalview = new frmTelaPrincipalVIEW();
						objfrmprincipalview.setVisible(true);

						dispose();
					} else {
						JOptionPane.showInternalMessageDialog(null, "Usuario ou Senha estão incorretos");
					}

				} catch (SQLException erro) {
					JOptionPane.showMessageDialog(null, "FRMLOGINVIEW: " + erro);
				}
			}

		});
		btnEntrarSistema.setBounds(172, 199, 89, 23);
		contentPane.add(btnEntrarSistema);
	}
}
