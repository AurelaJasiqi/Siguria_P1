import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.math.BigInteger;

public class frmCRC extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;
	private JTextField textGjeneratori;
	private JTextField txtTekstiIpranuar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCRC frame = new frmCRC();
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
	public frmCRC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblFjaliaDerguar = new JLabel("");
		JLabel lblInfo = new JLabel("");
		lblInfo.setForeground(Color.RED);
		JLabel lblInput = new JLabel("Teksti qe doni te shkruani:");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInput.setBounds(27, 26, 163, 14);
		contentPane.add(lblInput);
		
		JLabel lblGjeneratori = new JLabel("Gjeneratori:");
		lblGjeneratori.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGjeneratori.setBounds(70, 57, 130, 14);
		contentPane.add(lblGjeneratori);
		
		JLabel lblTekstiIPranuar = new JLabel("Teksti i pranuar:");
		lblTekstiIPranuar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTekstiIPranuar.setBounds(60, 174, 135, 14);
		contentPane.add(lblTekstiIPranuar);
		
		txtText = new JTextField();
		txtText.setBounds(200, 24, 198, 20);
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		textGjeneratori = new JTextField();
		textGjeneratori.setBounds(200, 55, 198, 20);
		contentPane.add(textGjeneratori);
		textGjeneratori.setColumns(10);
		
		txtTekstiIpranuar = new JTextField();
		txtTekstiIpranuar.setBounds(200, 171, 198, 20);
		contentPane.add(txtTekstiIpranuar);
		txtTekstiIpranuar.setColumns(10);
		
		
		
		JButton btnTransmit = new JButton("Transmit");
		btnTransmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String teDhenat=txtText.getText();
			String Gjeneratori=textGjeneratori.getText();
			String TeDhenatTotale=teDhenat;
			int i=1;
			while(TeDhenatTotale.length()<(teDhenat.substring(0, i).length()+Gjeneratori.substring(0, i).length()-1)) {
				TeDhenatTotale=TeDhenatTotale+"0";
				i++;
			}
			try {
			TeDhenatTotale=teDhenat+div(TeDhenatTotale,Gjeneratori);
			//lblFjaliaDerguar.setText(TeDhenatTotale);
			String fjaliaEPranuar=txtTekstiIpranuar.getText();
			
			if(Integer.parseInt(div(fjaliaEPranuar,Gjeneratori)) == 0)
			    lblInfo.setText("Nuk ka gabime!");}
			catch(Exception e1){
				lblInfo.setText("Ka gabime!");
				
				}
			}
			
			
			String div(String num1,String num2)
			 {
			  int pointer = num2.length();
			  String rezultati = num1.substring(0, pointer);
			  String mbetja = "";
			  for(int i = 0; i < num2.length(); i++)
			  {
			   if(rezultati.charAt(i) == num2.charAt(i))
			    mbetja += "0";
			   else
			    mbetja += "1";
			  }
			  while(pointer < num1.length())
			  {
			   if(mbetja.charAt(0) == '0')
			   {
			    mbetja = mbetja.substring(1, mbetja.length());
			    mbetja = mbetja + String.valueOf(num1.charAt(pointer));
			    pointer++;
			   }
			   rezultati = mbetja;
			   mbetja = "";
			   for(int i = 0; i < num2.length(); i++)
			   {
			    if(rezultati.charAt(i) == num2.charAt(i))
			     mbetja += "0";
			    else
			     mbetja += "1";
			   }
			  }
			  return mbetja.substring(1,mbetja.length());
			 }	
				
				
			});
		
		
		
		
		btnTransmit.setBounds(262, 122, 89, 23);
		contentPane.add(btnTransmit);
		
		
		lblFjaliaDerguar.setBounds(220, 86, 188, 25);
		contentPane.add(lblFjaliaDerguar);
		
		
		lblInfo.setBounds(262, 222, 146, 14);
		contentPane.add(lblInfo);
	}

}


