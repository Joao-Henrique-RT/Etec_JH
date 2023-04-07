package gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

	JTextField txtUsuario, txtSenha;
	JLabel lblUsuario, lblSenha, lblRes;
	JButton btnOk, btnCancel;

	String usuario, senha;

	public Login() {
		usuario = JOptionPane.showInputDialog(null, "Cadastre seu usuário", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
		senha = JOptionPane.showInputDialog(null, "Cadastre sua senha", "CADASTRO", JOptionPane.QUESTION_MESSAGE);

		Container c = getContentPane();
		Font fonte = new Font("serif", Font.BOLD, 30);

		setTitle("LOGIN");
		lblUsuario = new JLabel("Usuário");
		txtUsuario = new JTextField();
		lblSenha = new JLabel("Senha");
		txtSenha = new JPasswordField();
		btnOk = new JButton("OK");
		lblRes = new JLabel();
		btnCancel = new JButton("Cancelar");
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);

		setLayout(new GridLayout(4, 2));
		c.add(lblUsuario);
		c.add(txtUsuario);
		c.add(lblSenha);
		c.add(txtSenha);
		c.add(btnOk);
		c.add(btnCancel);
		c.add(lblRes);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String Login, Senha, LogEf = "Login efetuado", LogInc = "Login incorreto";
		Login = (txtUsuario.getText());
		Senha = (txtSenha.getText());
		if(e.getSource()==btnCancel) {
			System.exit(1);
		}
		if (e.getSource() == btnOk) {
			if (Login.equals(usuario) && Senha.equals(senha)) {
				lblRes.setText("");
				lblRes.setText("");
				JOptionPane.showMessageDialog(null, LogEf);
				JOptionPane.showMessageDialog(null, "Seja bem vindo " + usuario + "!");
				System.exit(0);

			} else {
				lblRes.setText("");
				JOptionPane.showMessageDialog(null, LogInc);
			}
		}
	}

}// fim class
