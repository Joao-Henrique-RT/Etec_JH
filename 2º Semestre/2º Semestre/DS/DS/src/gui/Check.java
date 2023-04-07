package gui;




	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.Font;
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JTextField;

	public class Check extends JFrame{
		
		JTextField texto;
		JCheckBox bold, italic;
		public Check(){
			super("Exemplo CheckBox");
			texto = new JTextField("Veja a Fonte Mudar.", 12);
			texto.setFont(new Font("arial", Font.PLAIN, 26));
			bold = new JCheckBox("Bold");
			bold.addItemListener(new OuvinteCheckBox());	
			italic = new JCheckBox("Italic");
			italic.addItemListener(new OuvinteCheckBox());	
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.add(texto);
			c.add(bold);
			c.add(italic);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300, 300);
			setVisible(true);
		}
		class OuvinteCheckBox implements ItemListener{
			public void itemStateChanged(ItemEvent e){
				if (bold.isSelected() && italic.isSelected()){
					texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
				}else if(bold.isSelected()){
					texto.setFont(new Font("Serif", Font.BOLD, 26));
					}else if(italic.isSelected()){
						texto.setFont(new Font("Serif", Font.ITALIC, 26));
					}else{
						texto.setFont(new Font("Serif", Font.PLAIN , 26));
				}		
			}
		}
		public static void main (String[] args){
			new Check();
		}
	}