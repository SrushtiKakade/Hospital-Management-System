import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class Home extends JFrame {
	int i=0;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1350, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JButton addpatientbtn = new JButton("Add New Patient");
		addpatientbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new addNewPatientRecord().setVisible(true);
				setVisible(false);
			}
		});
		addpatientbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		addpatientbtn.setHorizontalAlignment(SwingConstants.LEFT);
		addpatientbtn.setBackground(Color.WHITE);
		addpatientbtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\patient.png"));
		addpatientbtn.setBounds(12, 137, 188, 58);
		contentPane.add(addpatientbtn);
		
		JButton adddiabtn = new JButton("Add Diagnosis");
		adddiabtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		adddiabtn.setHorizontalAlignment(SwingConstants.LEFT);
		adddiabtn.setBackground(Color.WHITE);
		adddiabtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\d2.jpg"));
		adddiabtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				new addDiagnosis().setVisible(true);
				setVisible(false);
			}
		});
		adddiabtn.setBounds(12, 216, 188, 58);
		contentPane.add(adddiabtn);
		
		JButton hisbtn = new JButton("Patient's History");
		hisbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		hisbtn.setHorizontalAlignment(SwingConstants.LEFT);
		hisbtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\His1.jpg"));
		hisbtn.setBackground(Color.WHITE);
		hisbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
				new fullHistoryOfThePatient().setVisible(true);
			}
		});
		hisbtn.setBounds(12, 298, 188, 58);
		contentPane.add(hisbtn);
		
		JButton updatebtn = new JButton("Update Patient");
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				new updatePatientRecord().setVisible(true);
			}
		});
		updatebtn.setBackground(Color.WHITE);
		updatebtn.setHorizontalAlignment(SwingConstants.LEFT);
		updatebtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\Update.png"));
		updatebtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		updatebtn.setBounds(12, 377, 188, 58);
		contentPane.add(updatebtn);
		
		JButton aboutbtn = new JButton(" Hospital Info");
		aboutbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				new hospitalInformation().setVisible(true);
			}
		});
		aboutbtn.setBackground(Color.WHITE);
		aboutbtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\HA.jpg"));
		aboutbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		aboutbtn.setHorizontalAlignment(SwingConstants.LEFT);
		aboutbtn.setBounds(12, 456, 188, 58);
		contentPane.add(aboutbtn);
		
		JButton logoutbtn = new JButton(" Logout");
		buttonGroup.add(logoutbtn);
		logoutbtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\logout.jpg"));
		logoutbtn.setHorizontalAlignment(SwingConstants.LEFT);
		logoutbtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		logoutbtn.setBackground(Color.WHITE);
		logoutbtn.setBounds(12, 536, 188, 58);
		contentPane.add(logoutbtn);
		logoutbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int a=JOptionPane.showConfirmDialog(null, "Do you want to Logout?","Select",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					new login().setVisible(true);
				}
			}
		});
		
		JButton menu = new JButton("");
		menu.setBackground(Color.WHITE);
		menu.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\menu2.jpg"));
		menu.setBounds(12, 24, 77, 71);
		contentPane.add(menu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\HB2.jpg"));
		lblNewLabel.setBounds(223, 14, 1097, 650);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(514, 259, 56, 16);
		contentPane.add(label);
		
		menu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(i==0)
				{
					addpatientbtn.setLocation(100, 30);
					adddiabtn.setLocation(298, 30);
					hisbtn.setLocation(496, 30);
					updatebtn.setLocation(694, 30);
					aboutbtn.setLocation(892, 30);
					logoutbtn.setLocation(1090, 30);
					i=1;
				}
				else
				{
					addpatientbtn.setLocation(12, 137);
					adddiabtn.setLocation(12, 216);
					hisbtn.setLocation(12, 298);
					updatebtn.setLocation(12, 377);
					aboutbtn.setLocation(12, 456);
					logoutbtn.setLocation(12, 536);
					i=0;
				}
				
			}
		});
		
		
	}
}
