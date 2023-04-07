package gui;
//GRAPHIC USER INTERFACE

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela {

	public Janela() {
		JFrame meuFrame = new JFrame("Exemplo Janela");
		// meuFrame.setTitle("Exemplo Janela"); OUTRA OPÇÃO PARA TÍTULO

		JButton btnOK = new JButton();
		btnOK.setText("Ok");

		JButton btnCancel = new JButton("Cancel");

		Container c = meuFrame.getContentPane(); // Tem o controle/conteudo dos componentes do meuFrame
		c.setLayout(new BorderLayout());
		c.add(btnOK, BorderLayout.NORTH);
		c.add(btnCancel, BorderLayout.SOUTH);
		// c.setLayout(new FlowLayout());
		// c.setLayout(new GridLayout(1, 2));// 1 linha e 2 colunas

		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meuFrame.setSize(300, 200);
		meuFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new Janela(); // INSTANCIAMENTO DA CLASSE PARA EXECUTÁ-LA
	}

}
