import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login extends JFrame {

	JFrame frame;
	private JPanel contentPane;
	private JTextField usertxt;
	private JPasswordField passtxt;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 150, 935, 735);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel userlbl = new JLabel("Username");
		userlbl.setForeground(Color.WHITE);
		userlbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		userlbl.setBounds(256, 235, 86, 23);
		contentPane.add(userlbl);
		
		JLabel passlbl = new JLabel("Password");
		passlbl.setForeground(Color.WHITE);
		passlbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passlbl.setBounds(256, 321, 86, 22);
		contentPane.add(passlbl);
		
		usertxt = new JTextField();
		usertxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usertxt.setBounds(392, 235, 250, 39);
		contentPane.add(usertxt);
		usertxt.setColumns(10);
		
		passtxt = new JPasswordField();
		passtxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		passtxt.setBounds(392, 313, 250, 39);
		contentPane.add(passtxt);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\l2.png"));
		loginbtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				if((usertxt.getText().equals("HMS")) && (passtxt.getText().contentEquals("123")))
				{
					setVisible(false);
					new Home().setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null, "Incorrect Username OR Password..");
			}
		});
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		loginbtn.setBounds(392, 417, 97, 25);
		contentPane.add(loginbtn);
		
		JButton closebtn = new JButton("Close");
		closebtn.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\c2.png"));
		closebtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		closebtn.setBounds(545, 417, 97, 25);
		contentPane.add(closebtn);
		
		closebtn.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            int result = JOptionPane.showConfirmDialog(null, "Do You want to close Application?","Warning",JOptionPane.YES_NO_OPTION);
	            if(result == JOptionPane.YES_OPTION){
	               System.exit(0);
	            }
	         }
	      });
		
		
		JLabel loginback = new JLabel("");
		loginback.setBounds(225, 158, 475, 369);
		contentPane.add(loginback);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/b1.jpg"));//pass the path of the image
		//add an object of image icon class
		loginback.setIcon(icon);
		
		JLabel loginlbl = new JLabel("LOGIN FORM");
		loginlbl.setBackground(new Color(255, 255, 255));
		loginlbl.setForeground(new Color(0, 102, 204));
		loginlbl.setFont(new Font("Times New Roman", Font.BOLD, 26));
		loginlbl.setBounds(376, 120, 178, 39);
		contentPane.add(loginlbl);
		
		JLabel title = new JLabel("HOSPITAL MANAGEMENT SYSTEM");
		title.setForeground(new Color(0, 0, 205));
		title.setFont(new Font("Times New Roman", Font.BOLD, 45));
		title.setBounds(63, 13, 787, 66);
		contentPane.add(title);
		
		JLabel imgback = new JLabel("");
		imgback.setForeground(new Color(51, 0, 204));
		imgback.setIcon(new ImageIcon("C:\\Users\\Kakad\\New eclipse-workspace\\HospitalManagementSystem\\Images\\Hos4.jpg"));
		imgback.setBackground(new Color(255, 255, 255));
		imgback.setBounds(0, 0, 917, 688);
		contentPane.add(imgback);
		
	}
	
}
