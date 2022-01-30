package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametext;
	private JPasswordField passwordtext;
	Connection connect=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		DbConnect db=new DbConnect();
		connect=db.dataConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/login_2.jpg"));
		background.setSize(1440,920);
		background.setBounds(0,-70,1440,920);
		contentPane.add(background);
		
		JLabel usernamelabel = new JLabel("Username");
		background.add(usernamelabel);
		usernamelabel.setForeground(Color.WHITE);
		usernamelabel.setFont(new Font("Tahoma",Font.BOLD, 18));
		usernamelabel.setBounds(614, 760, 200, 50);
		
		JLabel Passwordlabel = new JLabel("Password");
		background.add(Passwordlabel);
		Passwordlabel.setForeground(Color.WHITE);
		Passwordlabel.setFont(new Font("Tahoma",Font.BOLD, 18));
		Passwordlabel.setBounds(614, 800, 200, 50);;
		
		JButton btnLogin = new JButton("User Login");
		background.add(btnLogin);
		background.setForeground(Color.BLACK);
		background.setBackground(Color.WHITE);
		btnLogin.setBounds(900, 775, 100, 60);
		
		/*JButton btnLogin2 = new JButton("ADMIN");
		background.add(btnLogin2);
		background.setForeground(Color.BLACK);
		background.setBackground(Color.WHITE);
		btnLogin2.setBounds(700, 617, 117, 25);*/
		
		usernametext = new JTextField();
		background.add(usernametext);
		usernametext.setBounds(761, 780, 86, 20);
		usernametext.setColumns(10);
		
		passwordtext = new JPasswordField();
		background.add(passwordtext);
		passwordtext.setBounds(761, 820, 86, 20);
		passwordtext.setColumns(10);
		
		JLabel lblPleaseLogin = new JLabel("PLEASE LOGIN");
		background.add(lblPleaseLogin);
		lblPleaseLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPleaseLogin.setForeground(Color.WHITE);
		lblPleaseLogin.setBounds(700,660, 500, 100);
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					String query="select Username,Password from User where Username=? and Password=?";
					String query2="select Id,Password from Admin where Id=? and Password=?";
					PreparedStatement pst=connect.prepareStatement(query);
					pst.setString(1, usernametext.getText());
					pst.setString(2, passwordtext.getText());
					passwordtext.setEchoChar('*');
					//String n=usernametext.getText();
					//System.out.println("Hello1");
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()){
						count++;
					}
					if(count==1)
					{
						dispose();
						//System.out.println("Hello2");
						JOptionPane.showMessageDialog(null,"Login Successful!");
						City c = new City();
						c.show();
						//after_login a=new after_login(n);
						//a.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null,"Wrong Username/Password");
					rs.close();
					pst.close();
				}
				catch(Exception f)
				{
					JOptionPane.showMessageDialog(null, f);
					
				}
			}
			});
//			btnLogin2.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					try
//					{
//						String query2="select Id,Password from Admin where Id=? and Password=?";
//						PreparedStatement pst2=connect.prepareStatement(query2);
//						pst2.setString(1, usernametext.getText());
//						pst2.setString(2, passwordtext.getText());
//						//String n=usernametext.getText();
//						//System.out.println("Hello1");
//						
//						//For admin
//						ResultSet rs2=pst2.executeQuery();
//						int count_admin=0;
//						while(rs2.next()){
//							count_admin++;
//						}
//						if(count_admin==1)
//						{
//							dispose();
//							//System.out.println("Hello2");
//							JOptionPane.showMessageDialog(null,"Login Successful!");
//							City c = new City();
//							c.show();
//							//after_login a=new after_login(n);
//							//a.setVisible(true);
//						}
//						else
//							JOptionPane.showMessageDialog(null,"Wrong Username/Password");
//						rs2.close();
//						pst2.close();
//						}
//					catch(Exception f)
//					{
//						JOptionPane.showMessageDialog(null, f);
//						
//					}
//
//				}
//		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		}
}