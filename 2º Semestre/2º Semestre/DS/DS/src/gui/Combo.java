package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.Check.OuvinteCheckBox;

public class Combo extends JFrame {
	JComboBox<String> combo;
	JLabel label;
	ImageIcon icone = new ImageIcon(getClass().getResource("Imagens/Selecione.png"));
	ImageIcon iconSeg = new ImageIcon(getClass().getResource("Imagens/Chuva.jpg"));
	ImageIcon iconTer = new ImageIcon(getClass().getResource("Imagens/Garoa.jpg"));
	ImageIcon iconQua = new ImageIcon(getClass().getResource("Imagens/Nublado.jpg"));
	ImageIcon iconQui = new ImageIcon(getClass().getResource("Imagens/Sol_Nuvens.jpg"));
	ImageIcon iconSex = new ImageIcon(getClass().getResource("Imagens/Sol_aberto.jpg"));
	ImageIcon iconSab = new ImageIcon(getClass().getResource("Imagens/Ceu.jpg"));
	ImageIcon iconDom = new ImageIcon(getClass().getResource("Imagens/Praia.jpg"));

	public Combo() {

		super("Exemplo ComboBox");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		combo = new JComboBox<String>();

		label = new JLabel(icone);
		combo.addItem("Selecione");
		combo.addItem("Segunda-feira");
		combo.addItem("Terça-feira");
		combo.addItem("Quarta-feira");
		combo.addItem("Quinta-feira");
		combo.addItem("Sexta-feira");
		combo.addItem("Sábado");
		combo.addItem("Domingo");
		combo.addItemListener(new OuvinteCheckBox());

		c.add(combo);
		c.add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}

	class OuvinteCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			label.setIcon(icone);
			if (combo.getSelectedItem() == ("Segunda-feira")) {
				label.setIcon(iconSeg);
				
			} else if (combo.getSelectedItem() == ("Terça-feira")) {
				label.setIcon(iconTer);

			} else if (combo.getSelectedItem() == ("Quarta-feira")) {
				label.setIcon(iconQua);

			} else if (combo.getSelectedItem() == ("Quinta-feira")) {
				label.setIcon(iconQui);

			} else if (combo.getSelectedItem() == ("Sexta-feira")) {
				label.setIcon(iconSex);

			} else if (combo.getSelectedItem() == ("Sábado")) {
				label.setIcon(iconSab);

			} else if (combo.getSelectedItem() == ("Domingo")) {
				label.setIcon(iconDom);

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Combo();
	}

}
