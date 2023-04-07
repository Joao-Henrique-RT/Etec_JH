package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tarefaRecuperacaoFanPage extends JFrame{
	public tarefaRecuperacaoFanPage(){
		super("Tarefa FanPage (RECUPERAÇÃO)");
		Container c = getContentPane();
		c.setLayout(new BorderLayout(3,3));
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 0, 0, 0));
		c2.add(new JButton("CURTIU"));
		c2.add(new JButton("COMPARTILHAR"));
		c2.add(new JButton("NÃO CURTIU"));
		c2.add(new JButton("DENUNCIAR"));
		
		Container c3 = new JPanel();
		c3.setLayout(new GridLayout(2, 0, 0, 0));
		c3.add(new JButton("OK"));
		c3.add(new JButton("CANCELAR"));
		c.add(BorderLayout.EAST, c2);
		c.add(BorderLayout.CENTER, c3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		new tarefaRecuperacaoFanPage();
	}
}
