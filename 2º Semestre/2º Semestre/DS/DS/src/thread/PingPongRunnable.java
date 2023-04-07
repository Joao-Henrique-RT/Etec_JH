package thread;

public class PingPongRunnable implements Runnable{

	String palavra;
	long tempo;
	public PingPongRunnable(String palavra, long tempo){
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
		Runnable ping = new PingPongRunnable("ping ", 2500);
		Runnable pong = new PingPongRunnable("pong ", 1000);
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		System.out.println("Ver Threads!");
	}

}
