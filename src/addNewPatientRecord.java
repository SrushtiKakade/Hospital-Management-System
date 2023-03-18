import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import Project.ConnectionProvider;
import java.sql.*;


public class addNewPatientRecord extends JFrame {

	private JPanel contentPane;
	private JTextField pat_id;
	private JTextField pat_name;
	private JTextField pat_num;
	private JTextField pat_age;
	private JTextField pat_address;
	private JTextField pat_bg;
	private JTextField pat_md;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewPatientRecord frame = new addNewPatientRecord();
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
	public addNewPatientRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1350, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JButton back_btn = new JButton("");
		back_btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				new Home().setVisible(true);
				setVisible(false);
			}
		});
		back_btn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\BackBtn.png"));
		back_btn.setBackground(new Color(175, 238, 238));
		back_btn.setBounds(12, 13, 65, 65);
		back_btn.setBorder(null);
		contentPane.add(back_btn);
		
		JLabel addpattitle = new JLabel("Add Patient Details");
		addpattitle.setForeground(new Color(0, 0, 0));
		addpattitle.setHorizontalAlignment(SwingConstants.CENTER);
		addpattitle.setFont(new Font("Times New Roman", Font.BOLD, 45));
		addpattitle.setBounds(330, 13, 725, 65);
		contentPane.add(addpattitle);
		
		JLabel patient_id = new JLabel("Patient ID");
		patient_id.setForeground(new Color(0, 0, 205));
		patient_id.setFont(new Font("Times New Roman", Font.BOLD, 20));
		patient_id.setBounds(119, 159, 157, 35);
		contentPane.add(patient_id);
		
		JLabel patient_name = new JLabel("Name");
		patient_name.setForeground(new Color(0, 0, 205));
		patient_name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		patient_name.setBounds(119, 207, 157, 35);
		contentPane.add(patient_name);
		
		JLabel lblNewLabel_2 = new JLabel("Contact Number");
		lblNewLabel_2.setForeground(new Color(0, 0, 205));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(119, 255, 157, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setForeground(new Color(0, 0, 205));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(119, 303, 157, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setForeground(new Color(0, 0, 205));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(119, 351, 137, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group");
		lblNewLabel_5.setForeground(new Color(0, 0, 205));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(119, 399, 137, 35);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setForeground(new Color(0, 0, 205));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(119, 452, 137, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Any Major Disease Suffered Earlier..?");
		lblNewLabel_7.setForeground(new Color(0, 0, 205));
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_7.setBounds(119, 500, 368, 35);
		contentPane.add(lblNewLabel_7);
		
		pat_id = new JTextField();
		pat_id.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_id.setBounds(382, 159, 222, 35);
		contentPane.add(pat_id);
		pat_id.setColumns(10);
		
		pat_name = new JTextField();
		pat_name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_name.setBounds(382, 209, 222, 35);
		contentPane.add(pat_name);
		pat_name.setColumns(10);
		
		pat_num = new JTextField();
		pat_num.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_num.setBounds(382, 257, 222, 35);
		contentPane.add(pat_num);
		pat_num.setColumns(10);
		
		pat_age = new JTextField();
		pat_age.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_age.setBounds(382, 305, 222, 35);
		contentPane.add(pat_age);
		pat_age.setColumns(10);
		
		pat_address = new JTextField();
		pat_address.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_address.setBounds(382, 454, 222, 35);
		contentPane.add(pat_address);
		pat_address.setColumns(10);
		
		pat_bg = new JTextField();
		pat_bg.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_bg.setBounds(382, 401, 222, 35);
		contentPane.add(pat_bg);
		pat_bg.setColumns(10);
		
		JComboBox pat_gen = new JComboBox();
		pat_gen.setModel(new DefaultComboBoxModel(new String[] {"  Male", "  Female", "  Other"}));
		pat_gen.setBackground(Color.WHITE);
		pat_gen.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_gen.setToolTipText("");
		pat_gen.setBounds(382, 353, 222, 35);
		contentPane.add(pat_gen);
		
		pat_md = new JTextField();
		pat_md.setFont(new Font("Times New Roman", Font.BOLD, 20));
		pat_md.setBounds(119, 539, 483, 35);
		contentPane.add(pat_md);
		pat_md.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\PA.jpg"));
		lblNewLabel_8.setBounds(646, 91, 674, 655);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("ADD PATIENT");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String patientID=pat_id.getText();
				String name=pat_name.getText();
				String contactNumber=pat_num.getText();
				String gender=(String)pat_gen.getSelectedItem();
				String age=pat_age.getText();
				String bloodGroup=pat_bg.getText();
				String address=pat_address.getText();
				String anyMajorDisease=pat_md.getText();
				
				try
				{
					Connection con=ConnectionProvider.getCon();
					Statement st=con.createStatement();
					st.executeUpdate("insert into patient values('"+patientID+"','"+name+"','"+contactNumber+"','"+age+"','"+gender+"','"+bloodGroup+"','"+address+"','"+anyMajorDisease+"')");
					JOptionPane.showMessageDialog(null, "Data Successfully Updated...");
					setVisible(false);
					new addNewPatientRecord().setVisible(true);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Enter Data Correctly...");
				}
			}
		});
		btnNewButton.setBackground(new Color(124, 252, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(119, 616, 157, 44);
		contentPane.add(btnNewButton);
	}
}
