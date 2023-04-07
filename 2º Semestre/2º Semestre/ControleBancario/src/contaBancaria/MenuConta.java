package contaBancaria;

import thro.MovimentoLimite;
import thro.MovimentoNegativo;
import thro.MovimentoZero;

public class MenuConta extends Menu{

	private ContaCorrente contaCC;
	private ContaPoupanca contaCP;
	
	public MenuConta() {
		contaCC  = new ContaCorrente(500, 1000);
		contaCP  = new ContaPoupanca(5000, 1);
	}
	
	String menuPrin[]= {"Sair","Conta Corrente", "Conta Poupanca"};
	String menuSub[]= {"Voltar","Consultar Saldo", "Depositar", "Sacar", "Atualizar Saldo"};
	
	
	protected void executarMenu() {
		setOpcoes(pane.option("Escolha a conta", "MENU", menuPrin));
		avaliarOpcaoEscolhida();
	}
	
	protected void avaliarOpcaoEscolhida() {
		if(getOpcoes()==1) 
			operarContaCC();
		else if(getOpcoes()==2)
			operarContaCP();
		else if(getOpcoes()==0)
			System.exit(1);
	}
	
	private void operarContaCC() {
		int controler=0;
		while(controler==0) {
		setOpcoes(pane.option("Escolha uma operacao", "MENU", menuSub));
		if(getOpcoes()==1)
			pane.saidaDeDados(contaCC.toString(), "Consultar Saldo");
		if(getOpcoes()==2) {
			try {
				contaCC.depositar(pane.entradaNumDouble("Deposite um valor", "Depositar"));
			} catch (MovimentoZero | MovimentoNegativo e) {
				pane.saidaDeDados("O valor nao pode ser negativo ou 0", "VALOR INVALIDO");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				pane.saidaDeDados("Digite apenas numeros por gentileza", "ERRO");
				e.printStackTrace();
			} catch(Exception e) {
				pane.saidaDeDados("Ocorreu um problema \n Tente depositar novamente", "ERRO");
			}
		}
		if(getOpcoes()==3) {
			try {
				contaCC.sacar(pane.entradaNumDouble("Digite o valor do saque", "Sacar da conta corrente"));
			} catch (MovimentoZero | MovimentoNegativo e) {
				pane.saidaDeDados("O valor nao pode ser negativo ou 0", "VALOR INVALIDO");
				e.printStackTrace();
			} catch(MovimentoLimite e) {
				pane.saidaDeDados("Limite Especial insuficiente", "AVISO");
				e.printStackTrace();
			}catch(NumberFormatException e) {
				pane.saidaDeDados("Digite apenas numeros por gentileza", "ERRO");
				e.printStackTrace();
			} catch(Exception e) {
				pane.saidaDeDados("Ocorreu um problema \n Tente sacar novamente", "ERRO");
			}
		}
		if(getOpcoes()==4) 
			contaCC.atualizarSaldo();
			
		if(getOpcoes()==0) {
			executarMenu();
			controler=1;
		}
	}//while
		
	}//metodo
	
	private void operarContaCP() {
		int controler=0;
		while(controler==0) {
		setOpcoes(pane.option("Escolha uma operacao", "MENU", menuSub));
		if(getOpcoes()==1)
			pane.saidaDeDados(contaCP.toString(), "Consultar Saldo");
		if(getOpcoes()==2) {
			try {
				contaCP.depositar(pane.entradaNumDouble("Deposite um valor", "Depositar"));
			} catch (MovimentoZero | MovimentoNegativo e) {
				pane.saidaDeDados("O valor nao pode ser negativo ou 0", "VALOR INVALIDO");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				pane.saidaDeDados("Digite apenas numeros por gentileza", "ERRO");
				e.printStackTrace();
			} catch(Exception e) {
				pane.saidaDeDados("Ocorreu um problema \n Tente depositar novamente", "ERRO");
			}
		}
		if(getOpcoes()==3) {
			try {
				contaCP.sacar(pane.entradaNumDouble("Digite o valor do saque", "Sacar da conta corrente"));
			} catch (MovimentoZero | MovimentoNegativo e) {
				pane.saidaDeDados("O valor nao pode ser negativo ou 0", "VALOR INVALIDO");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				pane.saidaDeDados("Digite apenas numeros por gentileza", "ERRO");
				e.printStackTrace();
			} catch(Exception e) {
				pane.saidaDeDados("Ocorreu um problema \n Tente depositar novamente", "ERRO");
			}
		}
		if(getOpcoes()==4)
			try {
				contaCP.atualizarSaldo(pane.entradaNumDouble("Digite o valor do saque", "Sacar da conta corrente"));
			} catch (MovimentoZero | MovimentoNegativo e) {
				pane.saidaDeDados("O valor nao pode ser negativo ou 0", "VALOR INVALIDO");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				pane.saidaDeDados("Digite apenas numeros por gentileza", "ERRO");
				e.printStackTrace();
			} catch(Exception e) {
				pane.saidaDeDados("Ocorreu um problema \n Tente depositar novamente", "ERRO");
			}
			
		if(getOpcoes()==0) {
			executarMenu();
			controler=1;
		}
	}//while
		
	}
	
}

