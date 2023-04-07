package gui;

import java.awt.EventQueue;

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

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField CaixaDois;
	private JTextField CaixaUm;
	private JRadioButton rdSubtracao;
	private JRadioButton rdDivisao;
	private JRadioButton rdMultiplicacao;
	private JRadioButton rdAdicao;
	private JButton btnNewButton;
	private JButton btnCalcular;
	private JPanel panel;
	private JLabel lblResultado;

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
		setBounds(100, 100, 450, 300);
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
		rdAdicao = new JRadioButton("Adi\u00E7\u00E3o");
		contentPane.add(rdAdicao);
		
		rdSubtracao = new JRadioButton("Subtra\u00E7\u00E3o");
		contentPane.add(rdSubtracao);
		
		rdDivisao = new JRadioButton("Divis\u00E3o");
		contentPane.add(rdDivisao);
		
		rdMultiplicacao = new JRadioButton("Multiplica\u00E7\u00E3o");
		contentPane.add(rdMultiplicacao);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double soma;
				soma = Double.parseDouble(CaixaUm.getText()) + Double.parseDouble(CaixaDois.getText());
				lblResultado.setText("Seu resultado é: "+soma);
			}
		});
		contentPane.add(btnCalcular);
		
		lblResultado = new JLabel();
		contentPane.add(lblResultado);
		
		
		
	}

}
