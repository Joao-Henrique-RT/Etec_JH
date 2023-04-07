package herancaExemplos;

public class Veiculo {//SUPER CLASSE/GENÉRICA
	
	private int aroRodas;
	private int cilindradasMotor;
	private String combustivel;
	private String cor;
	
	public void setAroRodas(int aro) {
		this.aroRodas = aro;
	}
	
	public int getAroRodas() {
		return this.aroRodas;
	}
	
	public int getCilindradasMotor() {
		return cilindradasMotor;
	}

	public void setCilindradasMotor(int cilindradasMotor) {
		this.cilindradasMotor = cilindradasMotor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void partidaMotor() {
		System.out.println("Vruuunnnnnn");
	}
	
	public void buzinar() {
		System.out.println("biibiiiiiiiii");
	}

}
