package smartcity;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FrameDisplayHyd 
{
    /*
     * Creating an object of JFrame instead of extending it 
     * has no side effects.
     */
    static JFrame frame;
    static JPanel panel, panel1;
    private JButton hotels;
	private JButton b_l,goback;
	private JLabel back,back1;
	JButton ptv ;
    public FrameDisplayHyd()
    {
        frame = new JFrame("Tourism");
        // If you running your program from cmd, this line lets it comes
        // out of cmd when you click the top-right  RED Button.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5, 50, 1440, 920);
        
        
        panel = new JPanel();
        JScrollPane scrPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		         JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       scrPane.setVisible(true);
      
        /*panel1 = new JPanel();
        String text="Lalbagh or Lalbagh Botanical Gardens, meaning The Red Garden in English, is a well known botanical garden in southern Bangalore, India. The garden was originally commissioned by Hyder Ali, the ruler of Mysore, and later finished by his son Tipu Sultan.[1] It has a famous glass house which hosts two annual flower shows (January 26th & August 15th). Lalbagh houses India's largest collection of tropical plants, has a lake, and is one of the main tourist attractions in Bangalore.[2] Lal Bagh is also home to a few species of birds. The commonly sighted birds include Myna, parakeets, crows, Brahmini Kite, Pond Heron, Common Egret, Purple Moor Hen etc.";
		JTextArea textArea_1 = new JTextArea();
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setText(text);
        textArea_1.setLineWrap(true);
        textArea_1.setEditable(false);
       JScrollPane scrollPane = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scrollPane.setBounds(40, 30, 300,200);
       panel1.add(scrollPane);*/
      
       
        //contentPane = new JPanel();
		
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(null);
		//setContentPane(contentPane);
		panel.setLayout(new BorderLayout(5,5));
		//frame.add(scrPane,BorderLayout.AFTER_LAST_LINE);
		back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back.setBounds(5, 50, 1440, 920);;
		panel.add(back);
		//frame.getContentPane().add(scrPane);
		panel.setBackground(Color.BLACK);
		/*back1= new JLabel("");
		back1.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back1.setBounds(0, 0, 1362, 739);
		panel1.add(back1);*/
		//panel1.add(back);
		//panel.add(back);
		//Border thickBorder = new LineBorder(Color.WHITE, 12);
		
		
		
		
		
		String text1="Hyderabad known as the city of Nizams, is an attractive tourist place. Hyderabad located on the Banks of River Musi, is the largest city of Andhra Pradesh.";
		
		JTextArea textArea_1 = new JTextArea();
		//back1.add(textArea_1);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textArea_1.setText(text1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(470, 100, 850,50);
		 //textArea_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		 panel.add(scrollPane1);
		back.add(scrollPane1);
		
		
		String text2="Hyderabad is called the city of pearls. It is one of the major producers of natural pearls. Kohinoor, a 105 karat diamond is believed to be mined in Hyderabad.";
		//back1.add(textArea_1);
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.LIGHT_GRAY);
		textArea_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		 JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane2.setBounds(490,180,850,50);
		 panel.add(scrollPane2);
		 back.add(scrollPane2);
		//add(back1);
		
		
		
		String text3="The awe-inspiring statue of the Buddha, is the largest single carved rock in the work weighing about 450 tons and 18 meters in height is situated in Hyderabad.";
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.LIGHT_GRAY);
		textArea_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		 JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane3.setBounds(500,250,900,50);
		 panel.add(scrollPane3);
		 back.add(scrollPane3);
		//add(back1);
		
		 
		
		String text4="Hyderabad is the home to the world’s biggest film city that is, the Ramoji Film City spread over a massive area of 2,000 acres.";
		JTextArea textArea_4 = new JTextArea();
		//back1.add(textArea_1);
		textArea_4.setBackground(Color.LIGHT_GRAY);
		textArea_4.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		 JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane4.setBounds(10,530,750,60);
		 panel.add(scrollPane4);
		 back.add(scrollPane4);
		//add(back1);
	
		
		String text6 = "Hyderabad is surrounded by beautiful artificial lakes including Hussain Sagar, Osman Sagar, and Himayat Sagar are the most popular among the 140 lakes in Hyderabad.";
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setFont(new Font("Tahoma", Font.ITALIC, 18));
		// back1.add(textArea_1);
		textArea_6.setBackground(Color.LIGHT_GRAY);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		JScrollPane scrollPane6 = new JScrollPane(textArea_6, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane6.setBounds(10, 630, 820, 60);
		back.add(scrollPane6);

		String text7 = "Hyderabad is one of the most elite cities in India which the top business schools like Indian School of Business, IIT and BITS.";
		JTextArea textArea_7 = new JTextArea();
		// back1.add(textArea_1);
		textArea_7.setBackground(Color.LIGHT_GRAY);
		textArea_7.setFont(new Font("Tahoma", Font.ITALIC, 18));
		textArea_7.setText(text7);
		textArea_7.setLineWrap(true);
		textArea_7.setWrapStyleWord(true);
		textArea_7.setEditable(false);
		textArea_7.setCaretPosition(0);
		JScrollPane scrollPane7 = new JScrollPane(textArea_7, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane7.setBounds(10, 730, 900, 60);
		back.add(scrollPane7);

		JLabel lalbagh = new JLabel();
		lalbagh.setBounds(10, 100, 450, 200);
		back.add(lalbagh);
		SetImageSize(lalbagh, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/Toy-rides-at-a-park-in-Hyderabad.jpg"));
	
		JLabel lalbagh1 = new JLabel();
		// lalbagh.setIcon(new
		// ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh1.setBounds(500, 320, 450, 200);
		back.add(lalbagh1);
		SetImageSize(lalbagh1,
				new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/images_java/hyderabad/tourism/nehruzoo.JPG"));

		JLabel lalbagh2 = new JLabel();
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh2.setBounds(980,550, 450, 200);
		back.add(lalbagh2);
		SetImageSize(lalbagh2,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/header-img-beautiful-lakes-in-hyderabad.jpg"));		
		
		
		
		
		ptv= new JButton("PLACES TO VISIT");
		ptv.setFont(new Font("Tahoma", Font.ITALIC, 20));
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.WHITE);
		ptv.setMargin(new Insets(20,20,20,20));
		ptv.setBorderPainted(true);
		ptv.setBounds(5, 5, 250, 45);
		back.add(ptv);
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.remove(panel);
	                frame.setContentPane(new PlacesHyderabad());
	                frame.setVisible(true);
			}
		});
		ptv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		goback= new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setMargin(new Insets(20,20,20,20));
		goback.setBorderPainted(true);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 5, 250, 45);
		back.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Hyderabad b=new Hyderabad();
				 b.Slideshow_Hybd();
				 b.show();
			}
		});
		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Tahoma", Font.ITALIC, 20));
		hotels.setBackground(Color.WHITE);
		hotels.setBounds(300, 5, 250, 45);
		back.add(hotels);
		
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.remove(panel);
	                frame.setContentPane(new HotelsHyd());
	                frame.setVisible(true);
			}
		});
		hotels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		b_l = new JButton("HOTELS");
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Tahoma", Font.ITALIC, 20));
		b_l.setBackground(Color.WHITE);
		b_l.setMargin(new Insets(20,20,20,20));
		b_l.setBorderPainted(true);
		b_l.setBounds(570, 5, 250, 45);
		back.add(b_l);
		//setLocationRelativeTo(null);
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayHyd.frame.remove( FrameDisplayHyd.panel);
				 FrameDisplayHyd.frame.setContentPane(new BLHyd());
				 FrameDisplayHyd. frame.setVisible(true);
			}
		});
        frame.setContentPane(panel);
        frame.setVisible(true);
        panel.setBackground(Color.decode("#bdb67b"));
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
    public static void main(String[] args)
    {   
        /*
         * This is the most important part ofyour GUI app, never forget 
         * to schedule a job for your event dispatcher thread : 
         * by calling the function, method or constructor, responsible
         * for creating and displaying your GUI.
         */
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new FrameDisplayHyd();
            }
        });
    }
}