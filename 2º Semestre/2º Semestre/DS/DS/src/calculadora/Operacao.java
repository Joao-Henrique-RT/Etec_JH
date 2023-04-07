package calculadora;

public class Operacao {
	 double resultado;

	public double soma(double n1, double n2) {
		resultado = (n1 + n2);
		return resultado;
	}

	public double subtracao(double n1, double n2) {
		resultado = (n1 - n2);
		return resultado;
	}

	public double multiplicacao(double n1, double n2) {
		resultado = (n1 * n2);
		return resultado;
	}

	public double divisao(double n1, double n2) {
		resultado =  (n1 / n2);
		return resultado;
	}

}
