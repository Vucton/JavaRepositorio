package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class frmTelaPrincipalVIEW extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTelaPrincipalVIEW frame = new frmTelaPrincipalVIEW();
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
	public frmTelaPrincipalVIEW() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TELA PRINCIPAL");
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 29));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(96, 24, 265, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seja Bem Vindo");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		lblNewLabel_1.setBounds(154, 139, 153, 14);
		contentPane.add(lblNewLabel_1);
	}
}
