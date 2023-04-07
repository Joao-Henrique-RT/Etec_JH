package iniciais;
import java.util.Scanner;

public class TestaOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float num1, num2, numSelect;
		
		Scanner leia = new Scanner(System.in); 	//INSTANCIAÇÃO DA CLASSE SCANNER (CRIAÇÃO DO OBJETO)	
												//Linha cria um objeto da classe scanner, "leia" = objeto
		
		OpAritm minhaCalc = new OpAritm();// INSTANCIAÇÃO DA CLASSE OpAritm (CRIAÇÃO DO OBJETO)
		//Nome do objeto, minhaCalc
		EscolhaOp opMat = new EscolhaOp();
		
		System.out.println("Digite o 1º Número");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o 2º Número");
		num2 = leia.nextFloat();

		
		System.out.println(opMat.operacao(null));
		
		
		numSelect = leia.nextFloat();
		if(numSelect  == 1) {
		System.out.println("Resultado "+minhaCalc.soma(num1, num2));
		}
		if(numSelect  == 2) {
			System.out.println("Resultado " +minhaCalc.subtracao(num1, num2));
			}
		if(numSelect  == 3) {
			System.out.println("Resultado "+ minhaCalc.multiplicacao(num1, num2));
			}
		if(numSelect  == 4) {
			System.out.println("Resultado "+minhaCalc.divisao(num1, num2));
			}
		
		
	}

}
