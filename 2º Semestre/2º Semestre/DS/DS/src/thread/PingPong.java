package thread;

public class PingPong extends Thread{

	String palavra;
	long tempo;
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	public void run(){
		try {	
			for (int i = 0; i < 10; i++){
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		}catch (InterruptedException e) {
			return;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread t = new Thread();
		new PingPong("oi", 3500).start();
		new PingPong("tchaw", 1000).start();
		System.out.println("Ver Thread");
	}

}

