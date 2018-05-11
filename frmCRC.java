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

