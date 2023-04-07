package ouvintes;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SomaView extends JFrame implements ActionListener {

	JTextField txtN1, txtN2;
	JLabel lblRes;
	JButton btnSomar;

	public SomaView() {
		Container c = getContentPane();
		Font fonte = new Font("serif", Font.BOLD, 30);
		setTitle("SOMA VIEW");
		txtN1 = new JTextField();
		txtN2 = new JTextField();
		lblRes = new JLabel();
		lblRes.setFont(fonte);
		btnSomar = new JButton("Somar");
		btnSomar.addActionListener(this);
		setLayout(new GridLayout(4, 1));
		c.add(txtN1);
		c.add(txtN2);
		c.add(lblRes);
		c.add(btnSomar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SomaView();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		double n1, n2, res;
		n1 = Double.parseDouble(txtN1.getText());
		n2 = Double.parseDouble(txtN2.getText());
		res = (n1 + n2);
		txtN1.setText("");
		txtN2.setText("");
		lblRes.setText("" + res);
	}
}