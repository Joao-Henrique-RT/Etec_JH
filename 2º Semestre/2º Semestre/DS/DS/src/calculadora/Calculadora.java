package calculadora;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField CaixaDois;
	private JTextField CaixaUm;
	private JRadioButton rdAdicao;
	private JButton btnNewButton;
	private JButton btnCalcular;
	private JPanel panel;
	private JLabel lblResultado;
	private JRadioButton rdSoma;
	private JRadioButton rdDivisao;
	private JRadioButton rdMulti;
	private JRadioButton rdSubtracao;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); 
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("Digite os n\u00FAmeros e escolha uma opera\u00E7\u00E3o");
		contentPane.add(lblNewLabel);

		CaixaUm = new JTextField();
		contentPane.add(CaixaUm);
		CaixaUm.setColumns(10);

		CaixaDois = new JTextField();
		contentPane.add(CaixaDois);
		CaixaDois.setColumns(10);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Operacao resultado = new Operacao();
				double num1 = Double.parseDouble(CaixaUm.getText());
				double num2 = Double.parseDouble(CaixaDois.getText());

				if (rdSoma.isSelected()) {
					lblResultado.setText("Seu resultado é: " + resultado.soma(num1, num2));
				} else if (rdSubtracao.isSelected()) {
					lblResultado.setText("Seu resultado é: " + resultado.subtracao(num1, num2));
				} else if (rdMulti.isSelected()) {
					lblResultado.setText("Seu resultado é: " + resultado.multiplicacao(num1, num2));
				} else if (rdDivisao.isSelected()) {
					lblResultado.setText("Seu resultado é: " + resultado.divisao(num1, num2));
				}

			}
		});
		ButtonGroup gp = new ButtonGroup();

		rdSoma = new JRadioButton("Soma");
		contentPane.add(rdSoma);

		rdSubtracao = new JRadioButton("Subtrair");
		contentPane.add(rdSubtracao);

		rdMulti = new JRadioButton("Multiplicar");
		contentPane.add(rdMulti);

		rdDivisao = new JRadioButton("Dividir");
		contentPane.add(rdDivisao);
		contentPane.add(btnCalcular);

		gp.add(rdSoma);
		gp.add(rdSubtracao);
		gp.add(rdMulti);
		gp.add(rdDivisao);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonGroup gp = new ButtonGroup();
				CaixaUm.setText("");
				CaixaDois.setText("");
				lblResultado.setText("");
				rdSoma.setSelected(false);
				rdSubtracao.setSelected(false);
				rdMulti.setSelected(false);
				rdDivisao.setSelected(false);
			}
		});
		contentPane.add(btnLimpar);

		lblResultado = new JLabel();
		lblResultado.setFont(new Font("Arial", Font.BOLD, 13));
		lblResultado.setForeground(Color.BLUE);
		contentPane.add(lblResultado);

	}

}
