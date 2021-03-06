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

public class EducationMlore extends JFrame {

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
					EducationMlore frame = new EducationMlore();
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
	public EducationMlore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		//JScrollPane scrPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		  //       JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//getContentPane().add(scrPane);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.PINK);
		//back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		//back.setBounds(0, 0, 1500, 800);
		//contentPane.add(back);
		JLabel title = new JLabel("EDUCATION");
		contentPane.add(title);
		title.setFont(new Font("TimesRoman BOLD", Font.BOLD, 35));
		title.setForeground(Color.BLUE);
		title.setBounds(600, 20, 400, 40);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.BOLD, 15));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.PINK);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 0, 200, 34);
		contentPane.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mangalore b=new Mangalore();
				 b.Slideshow_Mlore();
				b.show();
			}
		});
		/*JLabel schools = new JLabel("SCHOOLS");
		schools.setFont(new Font("Tahoma", Font.ITALIC, 14));
		contentPane.add(schools);
		//title.setFont(new Font("Tahoma", 12));
		schools.setForeground(Color.WHITE);
		schools.setBounds(10, 61, 200, 40);*/
		
		JLabel bc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		bc.setBounds(150, 151, 200, 160);
		SetImageSize(bc,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/nitk.jpg"));
		contentPane.add(bc);
		
		JLabel lblBishopCottonBoys = new JLabel("NITK");
		lblBishopCottonBoys.setForeground(Color.WHITE);
		lblBishopCottonBoys.setBounds(150, 112, 200, 37);
		lblBishopCottonBoys.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblBishopCottonBoys);
		
		JLabel lblIndusInternationalSchool = new JLabel("KMC");
		lblIndusInternationalSchool.setForeground(Color.WHITE);
		lblIndusInternationalSchool.setBounds(580, 112, 250, 37);
		lblIndusInternationalSchool.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblIndusInternationalSchool);
		
		JLabel label_1 = new JLabel("");
		//label_1.setForeground(Color.WHITE);
		label_1.setBounds(580, 151, 200, 160);
		SetImageSize(label_1,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/KMC.jpg"));
		contentPane.add(label_1);
		
		JLabel lblMountCarmelSchool = new JLabel("St. ALOYSIUS COLLEGE");
		lblMountCarmelSchool.setForeground(Color.WHITE);
		lblMountCarmelSchool.setBounds(1020, 112, 400, 37);
		lblMountCarmelSchool.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblMountCarmelSchool);
		
		JLabel label = new JLabel("");
		label.setBounds(1020, 151, 200, 150);
		SetImageSize(label,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/aloysiuscollege.jpg"));
		contentPane.add(label);
		
		JLabel lblSophiasHighSchool = new JLabel("SRINIVAS COLLEGE");
		lblSophiasHighSchool.setForeground(Color.WHITE);
		lblSophiasHighSchool.setBounds(1020, 388, 400, 37);
		lblSophiasHighSchool.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblSophiasHighSchool);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(1020, 426, 200, 250);
		SetImageSize(label_2,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/srinivas.jpg"));
		contentPane.add(label_2);
		
		/*JLabel colleges = new JLabel("COLLEGES");
		colleges.setFont(new Font("Tahoma", Font.ITALIC, 14));
		contentPane.add(colleges);
		//title.setFont(new Font("Tahoma", 12));
		colleges.setForeground(Color.WHITE);
		colleges.setBounds(10, 326, 200, 40);*/
		
		/*JLabel lblDeeksha = new JLabel("MANGALORE UNIVERSITY");
		lblDeeksha.setForeground(Color.WHITE);
		lblDeeksha.setBounds(1080, 112, 400, 37);
		lblDeeksha.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblDeeksha);*/
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(580, 426, 200, 250);
		SetImageSize(label_4,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/mlore-university.jpg"));
		contentPane.add(label_4);
		
		JLabel lblJain = new JLabel("YENEPOYA UNIVERSITY");
		lblJain.setForeground(Color.WHITE);
		lblJain.setBounds(150, 388, 250, 37);
		lblJain.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblJain);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(150, 426, 200, 250);
		SetImageSize(label_5,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/yenepoya-university.jpg"));
		contentPane.add(label_5);
		
	    /*JLabel lblUniversities = new JLabel("UNIVERSITIES");
		lblUniversities.setForeground(Color.WHITE);
		lblUniversities.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblUniversities.setBounds(588, 326, 200, 40);
		contentPane.add(lblUniversities);*/
		
//		JLabel lblIisc = new JLabel("BITS HYDERABAD");
//		lblIisc.setForeground(Color.WHITE);
//		lblIisc.setBounds(910, 388, 200, 37);
//		lblIisc.setFont(new Font("Dialog",Font.BOLD,20));
//		contentPane.add(lblIisc);
		
		JLabel lblDeeksha = new JLabel("MANGALORE UNIVERSITY");
		lblDeeksha.setForeground(Color.WHITE);
		lblDeeksha.setBounds(580, 388, 300, 37);
		lblDeeksha.setFont(new Font("Dialog",Font.BOLD,20));
		contentPane.add(lblDeeksha);
		
//		JLabel label_3 = new JLabel("");
//		label_3.setBounds(910, 426, 200, 150);
//		SetImageSize(label_3,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\edu-BITSHyderabad.jpg"));
//		contentPane.add(label_3);
		
		/*JLabel lblInternationalInstituteOf = new JLabel("IIIT ");
		lblInternationalInstituteOf.setForeground(Color.WHITE);
		lblInternationalInstituteOf.setBounds(836, 388, 95, 37);
		contentPane.add(lblInternationalInstituteOf);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(846, 426, 200, 150);
		SetImageSize(label_6,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\edu-iiithyd.jpg"));
		contentPane.add(label_6);
		
		JLabel lblBangaloreUniversity = new JLabel("OSMANIA UNIVERSITY");
		lblBangaloreUniversity.setForeground(Color.WHITE);
		lblBangaloreUniversity.setBounds(1096, 388, 149, 37);
		contentPane.add(lblBangaloreUniversity);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(1096, 426, 200, 150);
		SetImageSize(label_7,new ImageIcon("C:\\Users\\Prajwala\\Downloads\\edu-osmaniauniversity.jpg"));
		contentPane.add(label_7);
		*/
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
