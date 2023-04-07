package contaBancaria;

import thro.MovimentoNegativo;
import thro.MovimentoZero;

public class ContaPoupanca extends Conta{
	
	private double reajusteMensal;
	
	public ContaPoupanca(double saldo, double reajuste) {
		super(saldo);
		this.reajusteMensal = reajuste;
	}
	
	public void atualizarSaldo(double reajuste) throws MovimentoZero, MovimentoNegativo {
		if(reajuste==0)
				throw new MovimentoZero();
			else if(reajuste<0)
				throw new MovimentoNegativo();
			else {
				reajusteMensal=(reajuste/100)* (getSaldo());
				setSaldo(getSaldo()+reajusteMensal);
				reajusteMensal = reajuste;
			}
	}
	
	public String toString() {
		return "Saldo Poupanca: "+getSaldo()+"\n Reajuste Mensal: "+reajusteMensal+"%";
	}
	
}
