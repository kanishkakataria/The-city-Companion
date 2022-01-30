package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Welcome extends JFrame {

	private JPanel contentPane;
	int x=0;
	Timer tm;JLabel pic;
	String[] list=
		{
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/hyd1.jpeg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/chennai.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/bang.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/manglore.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/mumbai.jpg"
			
			
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setTitle("Smart City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setSize(1440,920);
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1440, 900);
		pic.setVisible(true);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.BLACK);
		label.add(pic);
		 tm = new Timer(2000,new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                SetImageSize(x);
	                x += 1;
	                if(x >= list.length )
	                    x = 0; 
	            }
	        });
		 //add(pic);
	        tm.start();
		label.setBackground(Color.BLACK);
	
		label.setIcon(new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/xyz.jpg"));
		label.setBounds(0, 50, 1500, 750);
		contentPane.add(label);
        JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.WHITE);
		contentPane.add(btnLogin);
		btnLogin.setBounds(1100, 5, 110, 40);
		

		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setForeground(Color.BLACK);
		btnSignup.setBackground(Color.WHITE);
		contentPane.add(btnSignup);
		btnSignup.setBounds(1229, 5, 110, 40);
		
		JLabel lblNewLabel = new JLabel("The City Companion");
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(580, -25, 700, 100);
		btnSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup s = new Signup();
				s.show();
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.show();
			}
		});
	}
	public void SetImageSize(int i)
	{
		ImageIcon icon=new ImageIcon(list[i]);
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		pic.setIcon(newImc);
		
	}

}
