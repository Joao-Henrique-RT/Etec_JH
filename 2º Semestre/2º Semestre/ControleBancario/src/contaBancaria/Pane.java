package contaBancaria;

import javax.swing.JOptionPane;

public class Pane {
	
	public int option(String mesage, String titulo, Object[]valor) {
		return  JOptionPane.showOptionDialog(null, mesage, titulo, 0, 
				JOptionPane.QUESTION_MESSAGE, null, valor, valor);
	}
	
	public int yesNo(String mesage, String titulo) {
		return JOptionPane.showConfirmDialog(null, mesage, titulo,
		        JOptionPane.YES_NO_OPTION);
	}
	
	public int entradaNumInt(String mensagem, String titulo){
		return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem, titulo, 
				JOptionPane.QUESTION_MESSAGE));
	}
	
	public double entradaNumDouble(String mensagem, String titulo) {
		return Double.parseDouble(JOptionPane.showInputDialog(null, mensagem, titulo, 
				JOptionPane.QUESTION_MESSAGE));
	}
	
	public String entradaDeLetras(String mensagem, String titulo) {
		return JOptionPane.showInputDialog(null, mensagem, titulo, 
				JOptionPane.QUESTION_MESSAGE);
	}
	
	public void saidaDeDados(String mensagem, String titulo) {
		JOptionPane.showMessageDialog(null, mensagem, titulo, 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
