package atVinho;



public class Vinho {

	private String nome, tipo;
	private double preco;
	private int safra;
	
	public Vinho() {
	}
	
	Vinho(String vNome, String vTipo, double vPreco, int vSafra){
		this.nome = vNome;
		this.tipo = vTipo;
		this.preco = vPreco;
		this.safra = vSafra;
	}
	
	
	public String mostrarVinho() {
		return "Nome: " + this.nome + 
				"\nTipo: " + this.tipo + 
				"\nPreço: " + this.preco + 
				"\nSafra: " + this.safra ; //usar sempre o THIS! ele é da própria instancia; Ajuda a proteger; "seu nome + seu tipo ...etc".//
	}
	
	public boolean verificarPreco(double preco) {
		if(preco<25) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
}
