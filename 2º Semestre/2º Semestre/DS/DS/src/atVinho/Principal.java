package atVinho;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int resp =1, safraVinho;
		double precoVinho=0;
		String nomeVinho,tipoVinho;
		int selecionado=0;
		
		Vinho meuVinho = new Vinho();
		Vinho verificarPreco = new Vinho();
		Vinho mostrarPreco = new Vinho();
		
		while(selecionado != 3) {
		String opcoes[] = {"1- Cadastrar","2- Verificar Precos","3- Mostrar Vinhos", "FECHAR"};
		 selecionado = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Escolha", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes,opcoes[0]);
		
		if (selecionado == 0){
		
			 nomeVinho = JOptionPane.showInputDialog(null, "Digite o nome do vinho", "Nome do Vinho", JOptionPane.QUESTION_MESSAGE);
		
			 tipoVinho =	JOptionPane.showInputDialog(null, "Digite o tipo do vinho", "Tipo do Vinho", JOptionPane.QUESTION_MESSAGE);
		
			 precoVinho =	Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco do vinho", "Preco do Vinho", JOptionPane.QUESTION_MESSAGE));
			 
			 safraVinho =	Integer.parseInt    (JOptionPane.showInputDialog(null, "Digite o safra do vinho", "Safra do Vinho", JOptionPane.QUESTION_MESSAGE));
			 
			 meuVinho = new Vinho (nomeVinho, tipoVinho, precoVinho, safraVinho);
		}
		
		if (selecionado == 1) {
		 if(verificarPreco.verificarPreco(precoVinho) == true) {
			JOptionPane.showMessageDialog(null,
											"Produto em oferta",
											"True",
											JOptionPane.INFORMATION_MESSAGE);
		}
		if(verificarPreco.verificarPreco(precoVinho) == false) {
			JOptionPane.showMessageDialog(null,
											"Produto com preço normal",
											"False",
											JOptionPane.INFORMATION_MESSAGE);
		}
			}
		 
		if (selecionado == 2) {
			JOptionPane.showMessageDialog(null, mostrarPreco.mostrarVinho(), "Sério", JOptionPane.INFORMATION_MESSAGE); 
			
		}
		}
		 
	
		
	}//fim metodo

}