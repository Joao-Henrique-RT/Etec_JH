package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calcSoma extends JFrame {
	JTextField txtN1 = new JTextField("                  ");
	JTextField txtN2 = new JTextField("                  ");
	JLabel lblVisor = new JLabel("Visor");
	JButton btnSomar = new JButton("OK");

	public calcSoma() {
		JFrame CalcSoma = new JFrame("Exemplo Janela");

		Container c = CalcSoma.getContentPane();
		c.setLayout(new GridLayout(1,2));
		c.add(txtN1);
		c.add(txtN2);
		c.add(lblVisor);
		c.add(btnSomar);
		
	

		CalcSoma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcSoma.setSize(300, 200);
		CalcSoma.setVisible(true);
	}

	public static void main(String[] args) {
		new calcSoma();
	}

}
