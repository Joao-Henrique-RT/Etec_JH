package contaBancaria;


import thro.MovimentoLimite;
import thro.MovimentoNegativo;
import thro.MovimentoZero;

public class Conta {
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 

	public void depositar(double valor) throws MovimentoZero, MovimentoNegativo {
		if(valor==0)
			throw new MovimentoZero();
		else if(valor<0)
			throw new MovimentoNegativo();
		else
			this.saldo +=valor;	
	}
	
	public void sacar(double valor) throws MovimentoZero, MovimentoNegativo, MovimentoLimite{
		if(getSaldo()-valor<0)
			throw new MovimentoLimite();
		else if(valor==0)
			throw new MovimentoZero();
		else if(valor<0)
			throw new MovimentoNegativo();
		else
		this.saldo-=valor;
	}
	
	public void atualizarSaldo() {
		if(this.saldo<0) {
			this.saldo+= (0.08*this.saldo);
		}
	}
}
