package controleBancario;

import java.util.InputMismatchException;

public class DigiteNumeros extends InputMismatchException{

	

	public String toString() {
		return "Digite apenas números";
	}
}
