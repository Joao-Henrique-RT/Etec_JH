package iniciais;
import java.util.Scanner;

public class TestaOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float num1, num2, numSelect;
		
		Scanner leia = new Scanner(System.in); 	//INSTANCIA��O DA CLASSE SCANNER (CRIA��O DO OBJETO)	
												//Linha cria um objeto da classe scanner, "leia" = objeto
		
		OpAritm minhaCalc = new OpAritm();// INSTANCIA��O DA CLASSE OpAritm (CRIA��O DO OBJETO)
		//Nome do objeto, minhaCalc
		EscolhaOp opMat = new EscolhaOp();
		
		System.out.println("Digite o 1� N�mero");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o 2� N�mero");
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
