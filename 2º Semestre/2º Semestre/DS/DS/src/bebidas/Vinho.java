package bebidas;



public class Vinho extends Bebida{

	private String tipo;
	private int safra;
	public String mostrarBebida() {
		return " Nome: " + this.getNome()+
				" \nPreço: R$ " + this.getPreco()+
				" \nSafra: " + this.safra +
				" \nTipo: " + this.tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSafra() {
		return safra;
	}

	public void setSafra(int safra) {
		this.safra = safra;
	}
	
	public Vinho(String vNome, double vPreco, int vSafra, String vTipo){
		this.setNome(vNome);
		this.setPreco(vPreco);
		this.tipo = vTipo;
		this.safra = vSafra;
	}
	
	public boolean verificarPreco(double preco) {
		if(getPreco()<25){
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
}
