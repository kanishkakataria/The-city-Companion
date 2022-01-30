package smartcity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

//import smartcity.City.submithandler;

public class Hospitals_Blore extends JFrame {

	private JPanel contentPane;
	JLabel back ;
	JButton goback;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospitals_Blore frame = new Hospitals_Blore();
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
	public Hospitals_Blore() {
		
		setVisible(true);
		

		//this.add(textArea_5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
//		JScrollPane scrPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
//		       JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		getContentPane().add(scrPane);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		//back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		//back.setBounds(0, 0, 1500, 800);
		//contentPane.add(back);
		JLabel title = new JLabel("HOSPITALS");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 40));
		title.setForeground(Color.BLUE);
		title.setBounds(580, 10, 400, 40);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 22));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bangalore b=new Bangalore();
				 b.Slideshow();
				b.show();
			}
		});
//		JLabel schools = new JLabel("SCHOOLS");
//		schools.setFont(new Font("Tahoma", Font.ITALIC, 20));
//		contentPane.add(schools);
//		//title.setFont(new Font("Tahoma", 12));
//		schools.setForeground(Color.YELLOW);
//		schools.setBounds(20, 61, 200, 60);
		
		JLabel bc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		bc.setBounds(60, 171, 550, 150);
		SetImageSize(bc,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hosp6.jpg"));
		contentPane.add(bc);
	
		
		JLabel lblBishopCottonBoys = new JLabel("BANAGLORE BAPTIST HOSPITAL");
		lblBishopCottonBoys.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblBishopCottonBoys.setForeground(Color.BLUE);
		lblBishopCottonBoys.setBounds(60, 112, 470, 57);
		contentPane.add(lblBishopCottonBoys);
		
		JLabel lblIndusInternationalSchool = new JLabel("ASTER RV COLLEGE HOSPITAL");
		lblIndusInternationalSchool.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblIndusInternationalSchool.setForeground(Color.BLUE);
		lblIndusInternationalSchool.setBounds(697, 112, 470, 57);
		contentPane.add(lblIndusInternationalSchool);
		
		JLabel label_1 = new JLabel("");
		//label_1.setForeground(Color.WHITE);
		label_1.setBounds(697, 171, 550, 150);
		SetImageSize(label_1,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hosp4.jpg"));
		contentPane.add(label_1);
		
//		JLabel lblMountCarmelSchool = new JLabel("  MOUNT CARMEL SCHOOL");
//		lblMountCarmelSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
//		lblMountCarmelSchool.setForeground(Color.YELLOW);
//		lblMountCarmelSchool.setBounds(740, 112, 220, 57);
//		contentPane.add(lblMountCarmelSchool);
//		
//		JLabel label = new JLabel("");
//		label.setBounds(940, 171, 550, 150);
//		SetImageSize(label,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hosp5.jpg"));
//		contentPane.add(label);
//		
//		JLabel lblSophiasHighSchool = new JLabel("SOPHIAS HIGH SCHOOL");
//		lblSophiasHighSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
//		lblSophiasHighSchool.setForeground(Color.YELLOW);
//		lblSophiasHighSchool.setBounds(950, 112, 220, 57);
//		contentPane.add(lblSophiasHighSchool);
//		
//		JLabel label_2 = new JLabel("");
//		label_2.setBounds(950, 171, 200, 180);
//		SetImageSize(label_2,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-sophiashighschool.jpg"));
//		contentPane.add(label_2);
		
//		JLabel colleges = new JLabel("COLLEGES");
//		colleges.setFont(new Font("Tahoma", Font.ITALIC, 20));
//		contentPane.add(colleges);
//		//title.setFont(new Font("Tahoma", 12));
//		colleges.setForeground(Color.RED);
//		colleges.setBounds(20, 356, 200, 40);
		
		JLabel lblDeeksha = new JLabel("APPOLO HOSPITAL");
		lblDeeksha.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblDeeksha.setForeground(Color.BLACK);
		lblDeeksha.setBounds(60, 408, 220, 57);
		contentPane.add(lblDeeksha);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(60, 486, 550, 180);
		SetImageSize(label_4,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hosp3.jpg"));
		contentPane.add(label_4);
		
//		JLabel lblJain = new JLabel("JAIN COLLEGE");
//		lblJain.setFont(new Font("Tahoma", Font.ITALIC, 17));
//		lblJain.setForeground(Color.RED);
//		lblJain.setBounds(310, 408, 220, 57);
//		contentPane.add(lblJain);
//		
//		JLabel label_5 = new JLabel("");
//		label_5.setBounds(610, 486, 550, 180);
//		SetImageSize(label_5,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hosp2.jpg"));
//		contentPane.add(label_5);
		
//		JLabel lblUniversities = new JLabel("UNIVERSITIES");
//		lblUniversities.setForeground(Color.RED);
//		lblUniversities.setFont(new Font("Tahoma", Font.ITALIC, 25));
//		lblUniversities.setBounds(608, 356, 200, 40);
//		contentPane.add(lblUniversities);
		
		JLabel lblIisc = new JLabel("MANIPAL HOSPITAL");
		lblIisc.setFont(new Font("Tahoma", Font.ITALIC, 22));
		lblIisc.setForeground(Color.BLACK);
		lblIisc.setBounds(698, 408, 320, 57);
		contentPane.add(lblIisc);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(698, 486, 550, 180);
		SetImageSize(label_3,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/hsp.jpg"));
		contentPane.add(label_3);
		
//		JLabel lblInternationalInstituteOf = new JLabel("IIIT ");
//		lblInternationalInstituteOf.setFont(new Font("Tahoma", Font.ITALIC, 17));
//		lblInternationalInstituteOf.setForeground(Color.RED);
//		lblInternationalInstituteOf.setBounds(906, 408, 00, 57);
//		contentPane.add(lblInternationalInstituteOf);
//		
//		JLabel label_6 = new JLabel("");
//		label_6.setBounds(866, 486, 200, 180);
//		SetImageSize(label_6,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-IIITbanguniv.jpg"));
//		contentPane.add(label_6);
		
//		JLabel lblBangaloreUniversity = new JLabel("BANGALORE UNIVERSITY");
//		lblBangaloreUniversity.setFont(new Font("Tahoma", Font.ITALIC, 17));
//		lblBangaloreUniversity.setForeground(Color.RED);
//		lblBangaloreUniversity.setBounds(1096, 408, 209, 57);
//		contentPane.add(lblBangaloreUniversity);
//		
//		JLabel label_7 = new JLabel("");
//		label_7.setBounds(1096, 486, 200, 180);
//		SetImageSize(label_7,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/edu-banguniv.jpg"));
//		contentPane.add(label_7);
//		
		
	}
	public void SetImageSize(JLabel label,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		label.setIcon(newImc);
		
	}
}
