package smartcity;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

//import javafx.stage.Stage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;

public class Signup extends JFrame{

	//static JPasswordField pass; 
	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JPasswordField password;
	private JPasswordField confirmpwd;
	private JTextField home;
	Connection connect=null;
	password pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		pwd=new password();
		//pwd=NULL;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connect=DbConnect.dataConnector();
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1500, 920);
		background.setIcon(new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/login.jpg"));
		contentPane.add(background);
		
		JLabel lblPassword = new JLabel("Password");
		background.add(lblPassword);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(334, 690, 63, 14);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		background.add(lblConfirmPassword);
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(334, 720, 200, 14);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		background.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(385, 575, 150, 35);
		JLabel lblPassword_cri = new JLabel("Password should Contain: 8 or more letters,numbers,alphabets,Capital letter.");
		background.add(lblPassword_cri);
		lblPassword_cri.setForeground(Color.WHITE);
		lblPassword_cri.setBounds(625, 605, 2000, 104);
		
		name = new JTextField();
		background.add(name);
		name.setBounds(465, 630, 86, 20);
		name.setColumns(10);
		
		home = new JTextField();
		background.add(home);
		home.setBounds(465,750, 86, 20);
		home.setColumns(10);
		
		confirmpwd = new JPasswordField();
		background.add(confirmpwd);
		confirmpwd.setBounds(465, 720, 86, 20);
		confirmpwd.setColumns(10);
		
		password = new JPasswordField();
		background.add(password);
		//password.setEchoChar('*');
		password.setBounds(465, 690, 86, 20);
		password.setColumns(10);
		
		JLabel lblHometown = new JLabel("Hometown");
		background.add(lblHometown);
		lblHometown.setForeground(Color.WHITE);
		lblHometown.setBounds(334, 750, 100, 14);
		
		JLabel lblUsername = new JLabel("Username");
		background.add(lblUsername);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(334, 660, 63, 14);
		
		JLabel lblName = new JLabel("Name");
		background.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(334, 630, 46, 14);
		
		username = new JTextField();
		background.add(username);
		username.setBounds(465, 660, 86, 20);
		username.setColumns(10);
		JButton btnSignUp = new JButton("Sign Up!");
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(680,680,150,35);
		background.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					String query="insert into User (Name,Username,Password,HomeTown) values (?,?,?,?)";
					PreparedStatement pst=connect.prepareStatement(query);
					char[] confirm=confirmpwd.getPassword() ;
					char[] pass=password.getPassword();
					//String uname=username.getText();
					password.setEchoChar('*');
					confirmpwd.setEchoChar('*');
					
					String confirm_pass;
					confirm_pass=new String(confirm);
					String pass1= new String(pass);
					
					/*if((pass1.length()==8)) {
						JOptionPane.showMessageDialog(null, "Length of Password should be minimum 8 !");
					}
					
					*/
					if(pass1.length()<8) {
						JOptionPane.showMessageDialog(null, "Length of Password should be minimum 8 !");
					}
					else if(!pwd.checkPass(new String(pass))){
						//JOptionPane.showMessageDialog(null, "Registered Succesfully!");
					}
					else if(confirm_pass.equals(new String(pass))){	
					
					pst.setString(1,name.getText() );
					pst.setString(2,username.getText() );
					pst.setString(3,new String(pass) );
					pst.setString(4,home.getText() );
					//pst.setString(5,username.getText() );
					pst.execute();
					/*login_back l=new login_back();
					l.login();*/
					pst.close();
					connect=null;
					JOptionPane.showMessageDialog(null, "Registered Succesfully!");		
					Welcome w=new Welcome();
					w.show();
					dispose();
					/*login_back l=new login_back();
					l.login();*/
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Enter the same password");
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
		//btnSignUp.setBounds(713, 601, 114, 22);
		setLocationRelativeTo(null);
		
		
	}

//	public void start(Stage arg0) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
	
	// function to check if the username already exist in database table		
	
	/*public boolean checkUsername(String username)
    {
		connect=DbConnect.dataConnector();
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = ("SELECT * FROM `User` WHERE `username` =?");
        
        try {
            ps = connect.prepareStatement(query);
            ps.setString(1, username);      
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
        } 
        catch (SQLException ex) {
        	System.out.println("Error!");
            //Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }
*/

	}

class password
{
	boolean checkPass(String password) {
		Scanner s1=new Scanner(System.in);
        char[] ch=new char[password.length()];
        //String password;
        //System.out.println("Enter a strong password which should follow the following criterias:\n");
        //System.out.println("1) 1 or more capital letters\n2) 1 or more small letters.\n3) 1 or more special characters\n4) 1 or more numbers\n");
        //System.out.println("Enter the password");

        //password=s1.nextLine();

        for(int i=0;i<password.length();i++)
        {
            ch[i]=password.charAt(i);
        }
        int capital=0,small=0,numbers=0,special=0;
        for(int i=0;i<password.length();i++)
        {


            if(ch[i]== 'A' ||ch[i]=='B'||ch[i]=='C'||ch[i]=='D'||ch[i]=='E'||ch[i]=='F'||ch[i]=='G'||ch[i]=='H'||ch[i]=='I'||ch[i]=='J'||ch[i]=='K'||ch[i]=='L'||ch[i]=='M'||ch[i]=='N'||ch[i]=='O'||ch[i]=='P'||ch[i]=='Q'||ch[i]=='R'||ch[i]=='S'||ch[i]=='T'||ch[i]=='U'||ch[i]=='V'||ch[i]=='W'||ch[i]=='X'||ch[i]=='Z')
            {
                capital=capital+1;

            }


            else if(ch[i]=='a'||ch[i]=='b'||ch[i]=='c'||ch[i]=='d'||ch[i]=='e'||ch[i]=='f'||ch[i]=='g'||ch[i]=='h'||ch[i]=='i'||ch[i]=='j'||ch[i]=='k'||ch[i]=='l'||ch[i]=='m'||ch[i]=='n'||ch[i]=='o'||ch[i]=='p'||ch[i]=='q'||ch[i]=='r'||ch[i]=='s'||ch[i]=='t'||ch[i]=='u'||ch[i]=='v'||ch[i]=='w'||ch[i]=='x'||ch[i]=='y'||ch[i]=='z')
            {
                small=small+1;
            }
            else if(ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='0')
            {
                numbers=numbers+1;
            }
            else if(ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='&'||ch[i]=='*'||ch[i]=='!'||ch[i]=='%')
            {
                special=special+1;
            }
            else
            {
                continue;
            }
        }
        if(capital==0)
        {
        	JOptionPane.showMessageDialog(null,"The password does not contain a capital letter ,re-enter password");
        	return false;
        }
        else if(small==0)
        {
        	JOptionPane.showMessageDialog(null,"The password does not contain a small letter ,re-enter password");
        	return false;
        }
        else if(numbers==0)
        {
        	JOptionPane.showMessageDialog(null,"The password does not contain a number ,re-enter password");
        	return false;

        }
        else if(special==0)
        {
        	JOptionPane.showMessageDialog(null,"The password does not contain a special characters,re-enter password");
        	return false;
        }
        //system.out.println(password);
        else {
        	return true;
        }
  
    }
}


