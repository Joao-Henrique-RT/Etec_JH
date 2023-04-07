package herancaExemplos;

public class Principal {
	public static void main(String[] args) {
		Carro opalao = new Carro();
		Motocicleta shadow = new Motocicleta();
		
		opalao.setAroRodas(14);
		opalao.setCilindradasMotor(4100);
		opalao.setCombustivel("gasolina");
		opalao.setCor("preto");
		opalao.capPortaMalas = 750;
		opalao.portas = 2;
		
		shadow.setAroRodas(18);
		shadow.setCilindradasMotor(600);
		shadow.setCombustivel("gasolina");
		shadow.setCor("azul");
		shadow.polGuidao = 14;
		
		opalao.buzinar();
		shadow.buzinar();
		
		System.out.println("O Opalão usa rodas aro " + opalao.getAroRodas());
		

	}

}
