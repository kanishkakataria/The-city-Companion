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

public class EducationHyd extends JFrame {

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
					EducationHyd frame = new EducationHyd();
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
	public EducationHyd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		//JScrollPane scrPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		  //       JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//getContentPane().add(scrPane);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setBackground(Color.LIGHT_GRAY);
		//back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		//back.setBounds(0, 0, 1500, 800);
		//contentPane.add(back);
		JLabel title = new JLabel("EDUCATION");
		contentPane.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		title.setForeground(Color.YELLOW);
		title.setBounds(10, 10, 200, 40);
		
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
				Hyderabad b=new Hyderabad();
				 b.Slideshow_Hybd();
				b.show();
			}
		});
		JLabel schools = new JLabel("SCHOOLS");
		schools.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(schools);
		//title.setFont(new Font("Tahoma", 12));
		schools.setForeground(Color.YELLOW);
		schools.setBounds(20, 61, 200, 60);
		
		JLabel bc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		bc.setBounds(20, 171, 200, 150);
		SetImageSize(bc,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-rosaryconventhighschool.jpg"));
		contentPane.add(bc);
		
		JLabel lblBishopCottonBoys = new JLabel("ROSARY CONVENT HIGH SCHOOL");
		lblBishopCottonBoys.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblBishopCottonBoys.setForeground(Color.YELLOW);
		lblBishopCottonBoys.setBounds(20, 112, 370, 57);
		contentPane.add(lblBishopCottonBoys);
		
		JLabel lblIndusInternationalSchool = new JLabel("ST.PAUL'S HIGH SCHOOL");
		lblIndusInternationalSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblIndusInternationalSchool.setForeground(Color.YELLOW);
		lblIndusInternationalSchool.setBounds(350, 112, 370, 57);
		contentPane.add(lblIndusInternationalSchool);
		
		JLabel label_1 = new JLabel("");
		//label_1.setForeground(Color.WHITE);
		label_1.setBounds(350, 171, 200, 150);
		SetImageSize(label_1,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-St.Pauls-High-School.jpg"));
		contentPane.add(label_1);
		
		JLabel lblMountCarmelSchool = new JLabel(" JOHNSON GRAMMAR HIGH SCHOOL");
		lblMountCarmelSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblMountCarmelSchool.setForeground(Color.YELLOW);
		lblMountCarmelSchool.setBounds(670, 112, 320, 57);
		contentPane.add(lblMountCarmelSchool);
		
		JLabel label = new JLabel("");
		label.setBounds(670, 171, 200, 150);
		SetImageSize(label,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-johnsongrammarschool.png"));
		contentPane.add(label);
		
		JLabel lblSophiasHighSchool = new JLabel("HYDERABAD PUBLIC SCHOOL");
		lblSophiasHighSchool.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblSophiasHighSchool.setForeground(Color.YELLOW);
		lblSophiasHighSchool.setBounds(1050, 112, 320, 57);
		contentPane.add(lblSophiasHighSchool);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(1050, 171, 200, 180);
		SetImageSize(label_2,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-hyderabadpublicschool.jpg"));
		contentPane.add(label_2);
		
		JLabel colleges = new JLabel("COLLEGES");
		colleges.setFont(new Font("Tahoma", Font.ITALIC, 20));
		contentPane.add(colleges);
		//title.setFont(new Font("Tahoma", 12));
		colleges.setForeground(Color.RED);
		colleges.setBounds(20, 356, 200, 40);
		
		JLabel lblDeeksha = new JLabel("SRI CHAITANYA COLLEGE");
		lblDeeksha.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblDeeksha.setForeground(Color.RED);
		lblDeeksha.setBounds(20, 408, 320, 57);
		contentPane.add(lblDeeksha);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(20, 486, 200, 180);
		SetImageSize(label_4,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-srichaitanyacollege.jpg"));
		contentPane.add(label_4);
		
		JLabel lblJain = new JLabel("NARAYANA COLLEGE");
		lblJain.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblJain.setForeground(Color.RED);
		lblJain.setBounds(310, 408, 220, 57);
		contentPane.add(lblJain);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(310, 486, 200, 180);
		SetImageSize(label_5,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/edu-narayanacollege.jpg"));
		contentPane.add(label_5);
		
		JLabel lblUniversities = new JLabel("UNIVERSITIES");
		lblUniversities.setForeground(Color.RED);
		lblUniversities.setFont(new Font("Tahoma", Font.ITALIC, 25));
		lblUniversities.setBounds(608, 356, 200, 40);
		contentPane.add(lblUniversities);
		
		JLabel lblIisc = new JLabel("BITS Hyderabad");
		lblIisc.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblIisc.setForeground(Color.RED);
		lblIisc.setBounds(608, 408, 320, 57);
		contentPane.add(lblIisc);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(608, 486, 200, 180);
		SetImageSize(label_3,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/education/bitspilanihyderabad.jpg"));
		contentPane.add(label_3);
		
		JLabel lblInternationalInstituteOf = new JLabel("IIIT ");
		lblInternationalInstituteOf.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblInternationalInstituteOf.setForeground(Color.RED);
		lblInternationalInstituteOf.setBounds(906, 408, 100, 57);
		contentPane.add(lblInternationalInstituteOf);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(866, 486, 200, 180);
		SetImageSize(label_6,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/education/iiithyd.jpg"));
		contentPane.add(label_6);
		
		JLabel lblBangaloreUniversity = new JLabel("OSMANIA UNIVERSITY");
		lblBangaloreUniversity.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblBangaloreUniversity.setForeground(Color.RED);
		lblBangaloreUniversity.setBounds(1096, 408, 209, 57);
		contentPane.add(lblBangaloreUniversity);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(1096, 486, 200, 180);
		SetImageSize(label_7,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/education/osmaniauniversity.JPG"));
		contentPane.add(label_7);
		
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
