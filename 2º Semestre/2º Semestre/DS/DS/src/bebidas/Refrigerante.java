package bebidas;

public class Refrigerante extends Bebida{

		private boolean  retornavel;
		public String mostrarBebida() {
			return " Nome: " + this.getNome()+
					" \nPreço: R$ " + this.getPreco()+
					" \nRetornavel: " + this.retornavel;
		}
		
		public Refrigerante(){
			
		}
		public Refrigerante(String vNome, double vPreco, boolean vRetornavel) {
			this.setNome(vNome);
			this.setPreco(vPreco);
			this.setRetornavel(vRetornavel);
		}
		
		public boolean isRetornavel() {
			return retornavel;
		}

		public void setRetornavel(boolean retornavel) {
			this.retornavel = retornavel;
		}

		public boolean verificarPreco(double preco) {
			if(getPreco()<5) {
				return true;
				}else {
					return false;
				}
			}
}
