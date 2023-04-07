package contaBancaria;

public class Principal {
	public static void main(String[] args) {
		MenuConta menuConta = new MenuConta();
		
		try {
		menuConta.executarMenu();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
