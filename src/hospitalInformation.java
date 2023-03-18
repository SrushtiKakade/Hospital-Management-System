import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hospitalInformation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hospitalInformation frame = new hospitalInformation();
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
	public hospitalInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(330, 100, 1300, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\HMS_D.jpg"));
		lblNewLabel.setBounds(741, 246, 535, 473);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrHospitalManagementSystem = new JTextArea(5,30);
		txtrHospitalManagementSystem.setForeground(new Color(255, 69, 0));
		txtrHospitalManagementSystem.setFont(new Font("Bell MT", Font.PLAIN, 26));
		txtrHospitalManagementSystem.setWrapStyleWord(true);
		txtrHospitalManagementSystem.setBounds(74, 193, 503, 498);
		txtrHospitalManagementSystem.setText("Hospital management system is a computer \nsystem that helps manage the information \nrelated to health care and aids in the job \ncompletion of health care providers effectively. \nHMS came into the picture of hospital \nmanagement as early as 1960 and have ever \nsince been evolving and synchronizing with \nthe technologies while modernizing \nhealthcare facilities. In today’s world, the \nmanagement of healthcare starts from the \nhands of the patients through their mobile \nphones and facilitates the needs of the patient.");
		txtrHospitalManagementSystem.getLineWrap();
		contentPane.add(txtrHospitalManagementSystem);
		
		JLabel lblNewLabel_1 = new JLabel("About Us..!");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_1.setBounds(189, 72, 255, 69);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HOSPITAL");
		lblNewLabel_2.setForeground(new Color(32, 178, 170));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 65));
		lblNewLabel_2.setBounds(843, 55, 350, 53);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MANAGEMENT SYSTEM");
		lblNewLabel_3.setForeground(new Color(34, 139, 34));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_3.setBounds(800, 121, 417, 36);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(620, 0, 5, 753);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\BackBtn.png"));
		btnNewButton.setBounds(12, 13, 64, 65);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
	}
}
