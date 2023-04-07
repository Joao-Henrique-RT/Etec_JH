package thro;

import javax.swing.JOptionPane;

public class MovimentoNegativo extends Exception{
	
	public String toString() {
		return "Valor nao pode ser negativo";
	}
	
}
