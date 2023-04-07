package layout;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class FanPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FanPage frame = new FanPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FanPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOk.setBounds(0, 0, 206, 126);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(0, 137, 206, 124);
		contentPane.add(btnCancelar);
		
		JButton btnCompartilhar = new JButton("COMPARTILHAR");
		btnCompartilhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCompartilhar.setBounds(216, 62, 195, 64);
		contentPane.add(btnCompartilhar);
		
		JButton btnCurtiu = new JButton("CURTIU");
		btnCurtiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCurtiu.setBounds(216, 0, 195, 64);
		contentPane.add(btnCurtiu);
		
		JButton btnNaoCurtiu = new JButton("N\u00C3O CURTIU");
		btnNaoCurtiu.setBounds(216, 137, 195, 64);
		contentPane.add(btnNaoCurtiu);
		
		JButton btnDenunciar = new JButton("DENUNCIAR");
		btnDenunciar.setBounds(216, 197, 195, 64);
		contentPane.add(btnDenunciar);
	}
}
