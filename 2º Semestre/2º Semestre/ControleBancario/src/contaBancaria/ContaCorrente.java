package contaBancaria;

import javax.swing.JOptionPane;

import thro.MovimentoLimite;
import thro.MovimentoNegativo;
import thro.MovimentoZero;

public class ContaCorrente extends Conta{

	private double limiteEspecial;
	
	public ContaCorrente(double saldo, double limite){
		super(saldo);
		this.limiteEspecial = limite;
	}
	
	public void sacar(double valor) throws MovimentoZero, MovimentoNegativo, MovimentoLimite{	
		if(getSaldo()-valor<0) {
			int res;
			res = JOptionPane.showConfirmDialog(null, "Saldo de: R$"+getSaldo()+" insuficiente \n deseja usar o limite especial?", "AVISO",
					        JOptionPane.YES_NO_OPTION);
			if(res==0) {
				if(getSaldo()<0 && ((this.limiteEspecial+getSaldo())+(getSaldo()*-1)-getSaldo()-valor)<0) 
					throw new MovimentoLimite();
				else if(limiteEspecial-valor>0 && getSaldo()-valor<0) {
					limiteEspecial-=valor;
					setSaldo(getSaldo()-valor);
				}
				else if(getSaldo()<0 &&((limiteEspecial+getSaldo())+(getSaldo()*-1)-valor)<0) 
					throw new MovimentoLimite();
				else if(getSaldo()>0 &&((limiteEspecial+getSaldo())+(getSaldo()*-1)+getSaldo()-valor)<0) 
					throw new MovimentoLimite();
				else {
					limiteEspecial=(limiteEspecial-=valor)+getSaldo();
					setSaldo(getSaldo()-valor);
					if(limiteEspecial<=0)
						limiteEspecial=0;
				}
			}
		}else if(valor==0)
			throw new MovimentoZero();
		else if(valor<0)
			throw new MovimentoNegativo();
		else
			setSaldo(getSaldo()-valor);
	}
	
	public String toString() {
		return "Saldo: "+getSaldo()+"\n Limite Especial: "+limiteEspecial;
	}
	
}
