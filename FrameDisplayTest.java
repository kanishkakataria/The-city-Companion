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

public class FrameDisplayTest
{
    /**
	 * 
	 */
	//private static final long serialVersionUID = -5022772939633964031L;
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
	private JLabel view;
    public FrameDisplayTest()
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
       
       
//       frame.remove(panel);
//       frame.setContentPane(new PlacesBLore());
//       frame.setVisible(true);
  
       
       
       //frame.getContentPane().setBackground(Color.decode("#bdb67b"));
      
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
		

		
		String text1="Bangalore is located at an elevation of 900 m or 3000 ft on the Deccan Plateau, thus making it the city situated at the highest altitude among major cities in India.";
		
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
		
		
		String text2="Bangalore is the second fastest-growing major city in India, owing to its diverse demographics.";
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
		
		
		
		String text3="All animal lovers rejoice, as PETA (People for Ethical Treatment of Animals) India called Bangalore India's most vegan-friendly city. It is home to many vegan restaurants.";
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
		
		 
		
		String text4=" Bangalore houses India's only Cartoon Gallery that exhibits works by cartoonists across the country. It is organised by the Indian Institute of Cartoonists, in Bangalore.";
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
	
		
		String text6 = "Bangalore was the first city in India to give free access to Wi-Fi (called Namma Wi-Fi). It is paid for by the State Government.";
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

		String text7 = "With a population of over 12 million, and with Bangalore being a Megacity, it's no surprise that the city has the highest traffic density in the country!";
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
		SetImageSize(lalbagh, new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/what-is-bangalore-famous-for-bangalore-palace.jpg"));
	
		JLabel lalbagh1 = new JLabel();
		// lalbagh.setIcon(new
		// ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh1.setBounds(500, 320, 450, 200);
		back.add(lalbagh1);
		SetImageSize(lalbagh1,
				new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/A-famous-flower-market-in-Bangalore.jpg"));

		JLabel lalbagh2 = new JLabel();
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh2.setBounds(980,550, 450, 200);
		back.add(lalbagh2);
		SetImageSize(lalbagh2,new ImageIcon("/Users/kanishkamishra/Desktop/Hospitals/main-qimg-c2aeb3c20a4e30796c79e0414a7167b8.jpeg"));
		

		 
		ptv= new JButton("PLACES TO VISIT");
		ptv.setFont(new Font("Tahoma", Font.ITALIC, 20));
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.WHITE);
		ptv.setMargin(new Insets(20,20,20,20));
		ptv.setBorderPainted(true);
		ptv.setBounds(5,5, 250, 45);
		back.add(ptv);
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.remove(panel);
	                frame.setContentPane(new PlacesBLore());
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
				 Bangalore b=new Bangalore();
				 b.Slideshow();
				 b.show();
			}
		});
		hotels = new JButton("RESTAURANTS");
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Tahoma", Font.ITALIC, 20));
		hotels.setBackground(Color.WHITE);
		hotels.setMargin(new Insets(20,20,20,20));
		hotels.setBorderPainted(true);
		hotels.setBounds(300,5, 250, 45);
		back.add(hotels);
		
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 frame.remove(panel);
//	                frame.setContentPane(new HotelsBlore());
//	                frame.setVisible(true);
	                FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
					 FrameDisplayTest.frame.setContentPane(new HotelsBlore());
					 FrameDisplayTest. frame.setVisible(true);
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
				FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
				 FrameDisplayTest.frame.setContentPane(new B_LBlore());
				 FrameDisplayTest. frame.setVisible(true);
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
            	 new FrameDisplayTest();
            }
        });
    }
}