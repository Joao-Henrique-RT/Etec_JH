package thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.util.Random;

public class GameJava extends JFrame {

	private int Acerto;
	private int Erro;
	JLabel tempo = new JLabel("60");
	JLabel acertoWord = new JLabel("Acertos");
	JLabel acerto = new JLabel("0");
	JLabel erroWord = new JLabel("Erros");
	JLabel erro = new JLabel("0");
	Random random = new Random();
	int segundos = 60;

	public GameJava() {
		editarLayout();
		new contarTempo().start();
		calculos(Acerto, Erro);
		
	}
	
	

	public void editarLayout() {
		
		Container c = getContentPane();
		Font fonte = new Font("Arial", Font.BOLD, 50);
		Font fonte2 = new Font("Arial", Font.BOLD, 30);

		setLayout(new GridLayout(5, 2));
		c.add(tempo);
		c.add(acertoWord);
		c.add(acerto);
		c.add(erroWord);
		c.add(erro);

		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		acertoWord.setHorizontalAlignment(SwingConstants.LEFT);
		acerto.setHorizontalAlignment(SwingConstants.LEFT);
		erro.setHorizontalAlignment(SwingConstants.RIGHT);
		erroWord.setHorizontalAlignment(SwingConstants.RIGHT);
		acertoWord.setFont(fonte2);
		acerto.setFont(fonte);
		erroWord.setFont(fonte2);
		erro.setFont(fonte);
		tempo.setFont(fonte2);

		setSize(600, 500);
		setTitle("TESTE SEUS CONHECIMENTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameJava();
	}

	public void calculos(int Acerto, int Erro) {
		
		while (segundos != 0) {
			this.Acerto = Acerto;
			this.Erro =Erro;
			
			
			int numero1 = random.nextInt(100);
			int numero2 = random.nextInt(100);
			int calculo = Integer.parseInt(JOptionPane
					.showInputDialog( null, "Qual e o resultado do calculo abaixo? \n" + numero1 + " + " + numero2, "Jogo da SOMA", JOptionPane.QUESTION_MESSAGE));
			int resultado = numero1 + numero2;
			
			if (resultado == calculo) {
				Acerto++;
				tempo.setText("+ 5 Segundos!");
				segundos +=5;
				
			}else {
				Erro++;
			}

		}

	}
	public class contarTempo extends Thread {
		public void run() {
			while (true) {
				if (segundos == 0) {
					try {
						Thread.sleep(2000);
						JOptionPane.showInternalMessageDialog(null, "FIM DE JOGO!!! \n Quantidade de acertos: " + Acerto + "\n Quantidade de erros: " + Erro);
						System.exit(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}// CASO O TEMPORIZADOR FIQUE IGUAL A ZERO, FECHA O APLICATIVO
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
				segundos--;
				tempo.setText(segundos + "");
				acerto.setText(Acerto + "");
				erro.setText(Erro + "");
			}

		}
	}
}