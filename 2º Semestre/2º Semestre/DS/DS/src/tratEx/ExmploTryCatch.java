package tratEx;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExmploTryCatch {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Scanner sc = new Scanner(System.in);
				int n1, n2, res;
				int n[] = new int[3];
				
				try {
					System.out.println("Digite n1");
					n[0] = sc.nextInt();
					System.out.println("Digite n2");
					n[1] = sc.nextInt();
					n[2] = (n[0] / n[1]);
					
				}catch (ArithmeticException c) {
					System.out.println("Não existe divisão por ZERO!");
				}catch (InputMismatchException e) {
					System.out.println("Digite apenas números!");
				}catch(Exception e) {
					System.out.println("OCORREU UMA EXCEÇÃO! " + e);
				}finally {
					System.out.println("FINALLY EXECUTADO!");
				}
				System.out.println(n[2]);
			}

		
	}


