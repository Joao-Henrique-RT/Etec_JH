package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fanPage {

	public fanPage() {
		JFrame meuFrame = new JFrame("FanPage");

		JButton btnOK = new JButton("OK");
		JButton btnCancel = new JButton("Cancelar");

		Container c = meuFrame.getContentPane();
		c.setLayout(new GridLayout(4,1));
		c.add(btnOK);
		c.add(btnCancel);
		
		JButton btnLike = new JButton("Curtiu");
		JButton btnShare = new JButton("Compartilhar");
		JButton btnDontLike = new JButton("Não curtiu");
		JButton btnReport = new JButton("Denunciar");
		
		
		c.add (btnLike);
		c.add(btnShare);
		c.add(btnDontLike);
		c.add (btnReport);

		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meuFrame.setSize(400, 800);
		meuFrame.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new fanPage();

	}

}
