package smartcity;

import java.awt.EventQueue;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
//import javafx.stage.Stage;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;

public class TableBooking extends JFrame {

	// static JPasswordField pass;
	private JPanel contentPane;
	private JTextField name;
	private JTextField hotel_name;
	private JTextField username;
	private JTextField password;
	private JTextField confirmpwd;
	private JTextField home;
	Connection connect = null;
	password pwd;
	private JList citylist;
    private DefaultListModel listarray;
    String store;

	/**
	 * Launch the application.
	 */
    
    String[] rests = {"Barbeque Nation, Chennai", "Faruuzi, Chennai", "The Flying Elephant, Chennai","Daalchini, Chennai","Alreef, Chennai","Benjarong, Chennai","Chef's, Manglore","Hao Ming, Manglore","Pallkhi, Manglore","Gajalee, Manglore"
			,"Girimanja's, Manglore","Village Restaurant, Manglore","Mia Cucina, Mumbai", "The Table, Mumbai","Masala Library, Mumbai","Global Fusion, Mumbai",
			"Indigo Deli, Mumbai","Wasabi By Morimoto, Mumbai","Minerva, Hyderabad","Ohri's, Hyderabad","Bawarchi, Hyderabad","Tabla, Hyderabad","Paradise, Hyderabad","Marriott, Hyderabad",
			"Sheraton, Banglore","37 China Town, Banglore","Beijing bites, Banglore","Nandini Palace, Banglore","Shanti Nagar, Banglore","bhagini, Banglore"};
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableBooking frame = new TableBooking();
					frame.addlist();
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
	
	public void addlist()
    {
		listarray.addElement("Barbeque Nation, Chennai");
	      listarray.addElement("Faruuzi, Chennai");
	      listarray.addElement("The Flying Elephant, Chennai");
	      listarray.addElement("Daalchini, Chennai");
	      listarray.addElement("Alreef, Chennai");
	      listarray.addElement("Benjarong, Chennai");
	      listarray.addElement("Chefs, Manglore");
	      listarray.addElement("Hao Ming, Manglore");
	      listarray.addElement("Pallkhi, Manglore");
	      listarray.addElement("Gajalee, Manglore");
	      listarray.addElement("Girimanja's, Manglore");
	      listarray.addElement("Village Restaurant, Manglore");
	      listarray.addElement("Mia Cucina, Mumbai");
	      listarray.addElement("The Table, Mumbai");
	      listarray.addElement("Masala Library, Mumbai");
	      listarray.addElement("Global Fusion, Mumbai");
	      listarray.addElement("Indigo Deli, Mumbai");
	      listarray.addElement("Wasabi By Morimoto, Mumbai");
	      listarray.addElement("Minerva, Hyderabad");
	      listarray.addElement("Ohri's, Hyderabad");
	      listarray.addElement("Bawarchi, Hyderabad");
	      listarray.addElement("Tabla, Hyderabad");
	      listarray.addElement("Paradise, Hyderabad");
	      listarray.addElement("Marriott, Hyderabad");
	      listarray.addElement("Sheraton, Banglore");
	      listarray.addElement("37 China Town, Banglore");
	      listarray.addElement("Beijing bites, Banglore");
	      listarray.addElement("Nandini Palace, Banglore");
	      listarray.addElement("Shanti Nagar, Banglore");
	      listarray.addElement("bhagini, Banglore");
      
      citylist = new JList(listarray);
      contentPane.add(citylist);
      citylist.setVisibleRowCount(30);
      
      JScrollPane p=new JScrollPane(citylist);
     contentPane.add(p);
     
     ListSelector lh= new ListSelector();
     citylist.addListSelectionListener(lh);
     contentPane.add(comboBox);
    
     setLayout(null);
 
 }
  class ListSelector implements ListSelectionListener
  {
      @Override
      public void valueChanged(ListSelectionEvent e)
      {
          String s=citylist.getSelectedValue().toString();
         // txt.setText(citylist.getSelectedValue().toString());
         store=s;
      }
     
  }
 

  private JComboBox comboBox;
	public TableBooking() {
		setVisible(true);
		pwd = new password();
		// pwd=NULL;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connect = DbConnect.dataConnector();
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		setBackground(Color.orange);
		JLabel background = new JLabel("");
		background.setBounds(200, 50, 1500, 750);
		background.setIcon(new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/table.jpg"));
		contentPane.add(background);

		JLabel lblPassword = new JLabel("Time ");
		background.add(lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(324, 683, 63, 14);

		JLabel lblConfirmPassword = new JLabel("Date ");
		background.add(lblConfirmPassword);
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(324, 643, 200, 14);

		JLabel lblNewLabel = new JLabel("TABLE BOOKING");
		lblNewLabel.setFont(new Font("TimesRoman BOLD", Font.BOLD, 40));
		background.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(380, 25, 500, 35);
		JLabel lblPassword_cri = new JLabel("Have a Delectable Place of Food!");
		lblPassword_cri.setFont(new Font("Tahoma", Font.BOLD, 30));
		background.add(lblPassword_cri);
		lblPassword_cri.setForeground(Color.WHITE);
		lblPassword_cri.setBounds(325, 75, 2000, 104);
		
		comboBox = new JComboBox();
		background.add(comboBox);
	    comboBox.setPreferredSize(new Dimension(250,150));
	    comboBox.setBounds(485, 520, 126, 25);
	   // comboBox.setVisible(true);
	 
	    ListSelector ls1 = new ListSelector();

		name = new JTextField();
		background.add(name);
		name.setBounds(485, 560, 106, 25);
		name.setColumns(10);

//		hotel_name = new JTextField();
//		background.add(hotel_name);
//		hotel_name.setBounds(485, 520, 106, 25);
//		hotel_name.setColumns(10);

//		home = new JTextField();
//		background.add(home);
//		home.setBounds(485,710, 106, 20);
//		home.setColumns(10);

		confirmpwd = new JTextField();
		background.add(confirmpwd);
		confirmpwd.setBounds(485, 640, 106, 20);
		confirmpwd.setColumns(10);

		password = new JTextField();
		background.add(password);
		// password.setEchoChar('*');
		password.setBounds(485, 680, 106, 20);
		password.setColumns(10);

//		JLabel lblHometown = new JLabel("Address");
//		background.add(lblHometown);
//		lblHometown.setFont(new Font("Tahoma", Font.BOLD, 16));
//		lblHometown.setForeground(Color.WHITE);
//		lblHometown.setBounds(324, 713, 100, 14);

		JLabel lblUsername = new JLabel("Number of Guests");
		background.add(lblUsername);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(324, 603, 363, 14);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		background.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(324, 563, 146, 14);

		JLabel lbl_Hotel_Name = new JLabel("Restaurant Name");
		lbl_Hotel_Name.setFont(new Font("Tahoma", Font.BOLD, 16));
		background.add(lbl_Hotel_Name);
		lbl_Hotel_Name.setForeground(Color.WHITE);
		lbl_Hotel_Name.setBounds(324, 523, 206, 14);

		JButton General = new JButton("BACK");
		background.add(General);
		General.setBackground(Color.LIGHT_GRAY);
		General.setForeground(Color.BLACK);
		General.setBounds(150, 25, 100, 35);
		background.add(General);

		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				City c = new City();
				c.show();
			}
		});

		username = new JTextField();
		background.add(username);
		username.setBounds(485, 600, 106, 20);
		username.setColumns(10);

		JButton btnSignUp = new JButton("BOOK !");
		btnSignUp.setBackground(Color.LIGHT_GRAY);
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setBounds(725, 603, 150, 35);
		background.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String place= (String)comboBox.getSelectedItem();

				try {
					String query = "insert into table_booking (r_name,user_name,guests, date, time) values (?,?,?,?,?)";
					PreparedStatement pst = connect.prepareStatement(query);
					String confirm = confirmpwd.getText();
					String pass = password.getText();
					// String uname=username.getText();
					// password.setEchoChar('*');
					//confirmpwd.setEchoChar('*');

					String confirm_pass;
					confirm_pass = new String(confirm);
					String pass1 = new String(pass);

					/*
					 * if((pass1.length()==8)) { JOptionPane.showMessageDialog(null,
					 * "Length of Password should be minimum 8 !"); }
					 * 
					 */
//					if (pass1.length() != 16) {
//						JOptionPane.showMessageDialog(null, "Invalid Date!");
//					}
//					
//					else if(confirm_pass.length()<3) {
//						JOptionPane.showMessageDialog(null, "Invalid CVV!");
//					}
//					else if(!pwd.checkPass(new String(pass))){
//						//JOptionPane.showMessageDialog(null, "Registered Succesfully!");
//					}
					

						pst.setString(1, place);
						pst.setString(2, name.getText());
						pst.setString(3, username.getText());
						pst.setString(5, new String(pass));
						pst.setString(4, new String(confirm_pass));
						// pst.setString(5,username.getText() );
						pst.execute();
						/*
						 * login_back l=new login_back(); l.login();
						 */
						pst.close();
						connect = null;
						JOptionPane.showMessageDialog(null, "BOOKED Succesfully!");
						City c = new City();
						c.show();
						dispose();
						/*
						 * login_back l=new login_back(); l.login();
						 */
					
//					else
//					{
//						JOptionPane.showMessageDialog(null, "Enter the same password");
//					}
					pst.close();
					/*
					 * login_back l=new login_back(); l.login();
					 */

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
					// System.out.println("User Name already Exists!");

				}
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		// btnSignUp.setBounds(713, 601, 114, 22);
		comboBox.setBackground(Color.PINK);
//		comboBox.setVisible(true);
	    int count=0;
	    for(int i = 0; i <31; i++) 
	    	comboBox.addItem(rests[count++]); 
	
		add(comboBox);
		setLocationRelativeTo(null);

	}
}