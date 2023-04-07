package bebidas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vinho vVinho = new Vinho("Nome do vinho",00.00 , 0000,"Tipo do vinho");//CRIANDO OBJETO vVinho
		Suco sSuco = new Suco ("Nome do suco", 00.0, "Sabor do suco");//CRIANDO O OBJETO sSuco
		Refrigerante rRefrigerante = new Refrigerante ("Nome do refrigerante",00.00, false);//CRIANDO O OBJETO rRefrigerante
		
	
		int resp = 1;
		int respCad = 0;
		boolean  rRetornavel;
		double precoVinho=0, precoSuco = 0, precoRefrigerante = 0;
		
		
		while (resp !=3) { //QUANDO "SAIR" FOR CLICADO ESTE LA�O PARA, INDO PARA O FINAL DO C�DIGO LINHA 133
		String opcoes[] = {"Cadastrar","Verificar Pre�o", "Mostrar bebida", "Sair"};
		 resp = JOptionPane.showOptionDialog(null,"Escolha uma op��o", "Enquete", 0,JOptionPane.QUESTION_MESSAGE,null, opcoes, opcoes[0]);
		 if(resp == 0) {
			 String cadastro[]= {"Vinho","Suco","Refrigerante", "Voltar"};
			respCad =  JOptionPane.showOptionDialog(null, "Escolha uma op��o", "Selecionar Bebida", 0, JOptionPane.QUESTION_MESSAGE, null, cadastro, cadastro);
			
			while(respCad != 3) {//VARI�VEL RESPCAD PEGA O VALOR PARA CADASTRAR UM PRODUTO
				
			if(respCad == 0) {
			 String vNome = JOptionPane.showInputDialog(null,"Digite o nome do vinho","Cadastro", JOptionPane.QUESTION_MESSAGE);
			 precoVinho = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o pre�o do vinho","Cadastro", JOptionPane.QUESTION_MESSAGE));
			 String vinSafra = JOptionPane.showInputDialog(null,"Digite a safra do vinho","Cadastro", JOptionPane.QUESTION_MESSAGE);
			 String vTipo = JOptionPane.showInputDialog(null,"Digite o tipo do vinho","Cadastro", JOptionPane.QUESTION_MESSAGE);
			
			int vSafra = Integer.parseInt(vinSafra);
			double vPreco = precoVinho;
			
			vVinho = new Vinho(vNome,vPreco,vSafra,vTipo);//PEGANDO OS VALORES E COLOCANDO NO OBJETVO vVinho
			
		 }
			else if(respCad == 1) {
				 String vNome = JOptionPane.showInputDialog(null,"Digite o nome do suco","Cadastro", JOptionPane.QUESTION_MESSAGE);
				 precoSuco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o pre�o do suco","Cadastro", JOptionPane.QUESTION_MESSAGE));
				 String vSabor = JOptionPane.showInputDialog(null,"Digite o sabor do suco","Cadastro", JOptionPane.QUESTION_MESSAGE);
				
				 double vPreco = precoSuco;
				  sSuco = new Suco(vNome,vPreco,vSabor);
				  
				
			 }
			
			
			else if(respCad == 2) {
				 String vNome = JOptionPane.showInputDialog(null,"Digite o nome do refrigerante","Cadastro", JOptionPane.QUESTION_MESSAGE);
				precoRefrigerante = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o pre�o do refrigerante","Cadastro", JOptionPane.QUESTION_MESSAGE));
				int vRetornavel = JOptionPane.showConfirmDialog(null,"O refrigerante � retorn�vel?","Cadastro", JOptionPane.YES_NO_OPTION);
				if(vRetornavel ==0) {
					rRetornavel = false;
				}else {
					rRetornavel = true;
				}
				double vPreco = precoRefrigerante;
				rRefrigerante = new Refrigerante(vNome, vPreco, rRetornavel);
		
				
			}
			respCad=3;
			}
			
		 }else if(resp == 1) {
			 respCad=0;//PARA N�O FICA EM UM LA�O INFINITO ZERAMOS A VARI�VEL RESPCAD, PARA IR PARA A SE��O DE VERIFICAR PRE�O
		 while(respCad != 3) {
		 
			 
			String cadastro1[]= {"Vinho","Suco","Refrigerante", "Voltar"};
			respCad =  JOptionPane.showOptionDialog(null, "Escolha uma op��o", "Selecionar Bebida", 0, JOptionPane.QUESTION_MESSAGE, null, cadastro1, cadastro1);
				
			if(respCad == 0) {
					
					if(vVinho.verificarPreco(precoVinho)) {
						  JOptionPane.showMessageDialog(null, "Produto em oferta", "True", JOptionPane.INFORMATION_MESSAGE);
					  }else {
						  JOptionPane.showMessageDialog(null, "Produto com pre�o normal","False", JOptionPane.INFORMATION_MESSAGE);
					  }
				}
				else if(respCad==1) {
				  if(sSuco.verificarPreco(precoSuco) ){
					  JOptionPane.showMessageDialog(null, "Produto em oferta", "True", JOptionPane.QUESTION_MESSAGE);
				  }else {
					  JOptionPane.showMessageDialog(null, "Produto com pre�o normal","False", JOptionPane.QUESTION_MESSAGE);
				  }
				  
			}else if(respCad==2) {
				 
				if(rRefrigerante.verificarPreco(precoRefrigerante)){
						JOptionPane.showMessageDialog(null,
														"Produto em oferta",
														"True",
														JOptionPane.INFORMATION_MESSAGE);
					}
				 else{
						JOptionPane.showMessageDialog(null,
														"Produto com pre�o normal",
														"False",
														JOptionPane.INFORMATION_MESSAGE);
					}
				 
			}
		}
		 respCad=3;//RESPCAD VALENDO 3 PARA SAIR DO LA�O
		 }
		 
			if(resp==2) {
				respCad=0;
				while(respCad !=3){
				
				
				String cadastro2[]= {"Vinho","Suco","Refrigerante", "Voltar"};
				respCad =  JOptionPane.showOptionDialog(null, "Escolha uma op��o", "Selecionar Bebida", 0, JOptionPane.QUESTION_MESSAGE, null, cadastro2, cadastro2);				
				if(respCad==0) {
					JOptionPane.showMessageDialog(null, vVinho.mostrarBebida(), "Saida", JOptionPane.INFORMATION_MESSAGE);
				}else if(respCad==1) {
					JOptionPane.showMessageDialog(null, sSuco.mostrarBebida(), "Saida", JOptionPane.INFORMATION_MESSAGE);
				}else if(respCad==2) {
					JOptionPane.showMessageDialog(null, rRefrigerante.mostrarBebida(), "Saida", JOptionPane.INFORMATION_MESSAGE);
				}
				resp=0;
			}
			}
			if(resp==3) {
				JOptionPane.showMessageDialog(null,"Obrigado");
				
			}
			
			
			
			
		
		 
		 }//FIM WHILE
		
		
		

		}//FIM M�TODO
	
	
	}//FIM CLASSE
