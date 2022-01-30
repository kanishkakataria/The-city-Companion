package smartcity;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.EventQueue;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

//import javafx.stage.Stage;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;

public class HotelBooking extends JFrame{

	//static JPasswordField pass; 
	private JPanel contentPane;
	private JTextField name;
	private JTextField hotel_name;
	private JTextField username;
	private JTextField password;
	private JPasswordField confirmpwd;
	private JTextField home,txt;
	String store,hotel;
	Connection connect=null;
	private JList citylist;
    private DefaultListModel listarray;
	password pwd;
	 JButton btnSignUp;
	

	/**
	 * Launch the application
	 */
	
	 String[] hotels = {"Ginger Hotel, Chennai", "Hyatt Regency, Chennai","Leela palace, Chennai","Hotel Chennai Deluxe, Chennai","Lemon Tree Hotel, Chennai","Radisson Blu Hotel GRT, Chennai","Ginger hotel, Manglore","The Saffron, Manglore","Hotel Maya International, Manglore","The Gateway Hotel, Manglore",
			 "Goldfinch hotels, Manglore","The Ocean Pearl, Manglore","Grand Hyatt Mumbai Hotel & Residences, Mumbai", "Taj Lands End, Mumbai","Holiday Inn, Mumbai","ITC Maratha, a Luxury Collection Hotel, Mumbai",
			"Leela, Mumbai","JWmarriot, Mumbai","Grand Elite, Hyderabad","City Park, Hyderabad","Lotus Grand, Hyderabad","Oakwood Residence, Hyderabad","Red Fox, Hyderabad","The Golkonda, Hyderabad",
			"Elanza, Banglore","Oberoi, Banglore","Royal Orchid, Banglore","Trinity Suites, Banglore","Leela Palace, Banglore","JWmarriot, Banglore"};
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelBooking frame = new HotelBooking();
					frame.addlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addlist()
    {
		listarray.addElement("Ginger Hotel, Chennai");
	      listarray.addElement("Hyatt Regency, Chennai");
	      listarray.addElement("Leela palace, Chennai");
	      listarray.addElement("Hotel Chennai Deluxe, Chennai");
	      listarray.addElement("Lemon Tree Hotel, Chennai");
	      listarray.addElement("Radisson Blu Hotel GRT, Chennai");
	      listarray.addElement("Ginger hotel, Manglore");
	      listarray.addElement("The Saffron, Manglore");
	      listarray.addElement("Hotel Maya International, Manglore");
	      listarray.addElement("The Gateway Hotel, Manglore");
	      listarray.addElement("Goldfinch hotels, Manglore");
	      listarray.addElement("The Ocean Pearl, Manglore");
	      listarray.addElement("Grand Hyatt Mumbai Hotel & Residences, Mumbai");
	      listarray.addElement("Taj Lands End, Mumbai");
	      listarray.addElement("Holiday Inn, Mumbai");
	      listarray.addElement("ITC Maratha, a Luxury Collection Hotel, Mumbai");
	      listarray.addElement("Leela, Mumbai");
	      listarray.addElement("JWmarriot, Mumbai");
	      listarray.addElement("Grand Elite, Hyderabad");
	      listarray.addElement("City Park, Hyderabad");
	      listarray.addElement("Lotus Grand, Hyderabad");
	      listarray.addElement("Oakwood Residence, Hyderabad");
	      listarray.addElement("Red Fox, Hyderabad");
	      listarray.addElement("The Golkonda, Hyderabad");
	      listarray.addElement("Elanza, Banglore");
	      listarray.addElement("Oberoi, Banglore");
	      listarray.addElement("Royal Orchid, Banglore");
	      listarray.addElement("Trinity Suites, Banglore");
	      listarray.addElement("Leela Palace, Banglore");
	      listarray.addElement("JWmarriot, Banglore");      
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
	/**
	 * Create the frame.
	 */
	public HotelBooking() {

		setVisible(true);
		pwd=new password();
		//pwd=NULL;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connect=DbConnect.dataConnector();
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setBackground(Color.orange);
		JLabel background = new JLabel("");
		background.setBounds(200, -40, 1500, 920);
		background.setIcon(new ImageIcon("/Users/kanishkamishra/Desktop/hotel.jpg"));
		contentPane.add(background);
		
		JLabel lblPassword = new JLabel("CVV: ");
		background.add(lblPassword);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(334, 680, 63, 14);
		
		JLabel lblConfirmPassword = new JLabel("Card Number");
		background.add(lblConfirmPassword);
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(334, 650, 200, 14);
		
		JLabel lblNewLabel = new JLabel("HOTEL BOOKING");
		lblNewLabel.setFont(new Font("TimesRoman BOLD", Font.BOLD, 40));
		background.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(380, 155, 500, 35);
		JLabel lblPassword_cri = new JLabel("Book the best Hotels in Town!");
		lblPassword_cri.setFont(new Font("Tahoma", Font.BOLD, 30));
		background.add(lblPassword_cri);
		lblPassword_cri.setForeground(Color.black);
		lblPassword_cri.setBounds(325, 205, 2000, 104);
		
		comboBox = new JComboBox();
		background.add(comboBox);
	    comboBox.setPreferredSize(new Dimension(250,150));
	    comboBox.setBounds(465, 560, 126, 20);
	 
	    ListSelector ls1 = new ListSelector();
	   
		
		name = new JTextField();
		background.add(name);
		name.setBounds(465, 590, 106, 20);
		name.setColumns(10);
	
		username = new JTextField();
		background.add(username);
		username.setBounds(465, 620, 106, 20);
		username.setColumns(10);
		
		home = new JTextField();
		background.add(home);
		home.setBounds(465,710, 106, 20);
		home.setColumns(10);
		
		confirmpwd = new JPasswordField();
		background.add(confirmpwd);
		confirmpwd.setBounds(465, 680, 106, 20);
		confirmpwd.setColumns(10);
		
		password = new JTextField();
		background.add(password);
		//password.setEchoChar('*');
		password.setBounds(465, 650, 106, 20);
		password.setColumns(10);
		
		JLabel lblHometown = new JLabel("Address");
		background.add(lblHometown);
		lblHometown.setForeground(Color.WHITE);
		lblHometown.setBounds(334, 710, 100, 14);
		
		JLabel lblUsername = new JLabel("Gender");
		background.add(lblUsername);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(334, 620, 63, 14);
		
		JLabel lblName = new JLabel("Name");
		background.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(334, 590, 46, 14);
		
		
		JLabel lbl_Hotel_Name = new JLabel("Hotel Name");
		background.add(lbl_Hotel_Name);
		lbl_Hotel_Name.setForeground(Color.WHITE);
		lbl_Hotel_Name.setBounds(334, 560, 106, 14);
		
		
		JButton General = new JButton("BACK");
        background.add(General);
        General.setBackground(Color.LIGHT_GRAY);
        General.setForeground(Color.BLACK);
        General.setBounds(150, 155, 100, 35);
        background.add(General);
        
        General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 City c=new City();
				 c.show();
			}
		});
        
        btnSignUp = new JButton("BOOK !");
		btnSignUp.setBackground(Color.LIGHT_GRAY);
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setBounds(680,650,120,35);
		background.add(btnSignUp);
        
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hotel= (String)comboBox.getSelectedItem();
				
				try
				{
					String query="insert into hotel_booking (h_name,user_name,gender, cardno, cvv, address) values (?,?,?,?,?,?)";
					PreparedStatement pst=connect.prepareStatement(query);
					char[] confirm=confirmpwd.getPassword() ;
					String pass=password.getText();
					//String uname=username.getText();
					//password.setEchoChar('*');
					confirmpwd.setEchoChar('*');
					
					String confirm_pass;
					confirm_pass=new String(confirm);
					String pass1= new String(pass);
					if(pass1.length()!=16) {
						JOptionPane.showMessageDialog(null, "Invalid Card Number!");
					}
					
					else if(confirm_pass.length()<3) {
						JOptionPane.showMessageDialog(null, "Invalid CVV!");
					}

					else{	
					
					pst.setString(1,hotel);
					pst.setString(2,name.getText() );
					pst.setString(3,username.getText());
					pst.setString(4,new String(pass) );
					pst.setString(5,new String(confirm_pass) );
					pst.setString(6,home.getText() );
					//pst.setString(5,username.getText() );
					pst.execute();
					/*login_back l=new login_back();
					l.login();*/
					pst.close();
					connect=null;
					JOptionPane.showMessageDialog(null, "BOOKED Succesfully!");		
					City c=new City();
					c.show();
					dispose();
					/*login_back l=new login_back();
					l.login();*/
					}
				pst.close();
					/*login_back l=new login_back();
					l.login();*/
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
					//System.out.println("User Name already Exists!");
					
				}
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
        comboBox.setBackground(Color.PINK);
	
	    int count=0;
	    for(int i = 0; i <31; i++) 
	    	comboBox.addItem(hotels[count++]); 
	   

		add(comboBox);
		setLocationRelativeTo(null);
	}
		
	
}