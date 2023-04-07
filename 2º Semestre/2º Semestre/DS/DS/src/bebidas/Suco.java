package bebidas;

public class Suco extends Bebida {

	
	private String sabor;
	public String mostrarBebida() {
	return " Nome: " + this.getNome()+
			" \nPreço: R$" + this.getPreco()+
			" \nSabor: " + this.sabor;
	}
	
	public Suco(){
		//
	}
	public Suco(String vNome, double vPreco, String vSabor) {
		this.setNome(vNome);
		this.setPreco(vPreco);
		this.setSabor(vSabor);
	}
	
	public boolean verificarPreco(double preco) {
		if(getPreco()<2.5) {
			return true;
			}else {
				return false;
			}
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
