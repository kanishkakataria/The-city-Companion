package smartcity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class B_LBlore extends JPanel {

	/**
	 * Create the panel.
	 */
	 JButton ptv,hotels,b_l,goback,book_hotel; 
	    JLabel back1;
	public B_LBlore() {
		setLayout(null);
		String text="Name: Elanza\nLocation : No. 88/2, Richmond Road, Bengaluru, Karnataka 560025\nPhone:080 2223 3666\nReviews : 4 stars";
       //JScrollPane scrollPane = new JScrollPane(,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       //scrollPane.setBounds(32, 32, 789,469);
       setBackground(Color.PINK);
       setBounds(5, 50, 1440, 920);
		//scrPane.setPreferredSize(new Dimension(1500,800));
		
        back1= new JLabel("");
        //back1.setEnabled(false);
        //back1.setIcon(null);
		//back1.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		
		//add(scrollPane);
//	    ptv= new JButton("PLACES TO VISIT");
//		
//		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
//		ptv.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				 FrameDisplayTest.frame.remove(FrameDisplayTest.panel);
//				 FrameDisplayTest.frame.setContentPane(new PlacesBLore());
//				 FrameDisplayTest.frame.setVisible(true);
//			}
//		});
//		//SetImageSize(back1,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
//		ptv.setForeground(Color.WHITE);
//		ptv.setBackground(Color.BLACK);
//		ptv.setBounds(0, 0, 200, 34);
//		back1.add(ptv);
//		
		//add(textArea_1);
		
		
//		hotels = new JButton("HOTELS");
//        hotels.setForeground(Color.WHITE);
//		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
//		hotels.setBackground(Color.BLACK);
//		hotels.setBounds(199, 0, 200, 34);
//		back1.add(hotels);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setMargin(new Insets(20,20,20,20));
		goback.setBorderPainted(true);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1130, 5, 200, 35);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Bangalore b=new Bangalore();
				 b.Slideshow();
				 b.show();
			}
		});
		
		
		book_hotel= new JButton("Hotel Booking");
		book_hotel.setFont(new Font("Tahoma", Font.ITALIC, 20));
		book_hotel.setForeground(Color.BLACK);
		book_hotel.setBackground(Color.WHITE);
		book_hotel.setMargin(new Insets(20,20,20,20));
		book_hotel.setBorderPainted(true);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		book_hotel.setBounds(730, 5, 270, 35);
		back1.add(book_hotel);
		book_hotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 HotelBooking hb=new  HotelBooking();
				 //b.Slideshow();
				 hb.show();
			}
		});
		
//		hotels.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				 FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
//				 FrameDisplayTest.frame.setContentPane(new HotelsBlore());
//				 FrameDisplayTest. frame.setVisible(true);
//			}
//		});
//		hotels.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//			}
//		});
//		
//		b_l = new JButton("BOARDING AND LODGING");
//		b_l.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		b_l.setForeground(Color.WHITE);
//		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
//		b_l.setBackground(Color.BLACK);
//		b_l.setBounds(397, 0, 250, 34);
//		back1.add(b_l);
		
		JTextArea textArea_1 = new JTextArea();
		//back1.add(textArea_1);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		 JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(300, 110, 250,150);
		 back1.add(scrollPane1);
		add(back1);
		
		JLabel elanza = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		elanza.setBounds(100,110, 250, 150);
		SetImageSize(elanza,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging1-elanza.jpg"));
		//add(lalbagh);
		back1.add(elanza);
		
		String text2=" Name: Oberoi\nLocation : 37-39, MG Road, Bengaluru, Karnataka 560001\nPhone:080 2558 5858\nReviews : 5 stars ";
		JTextArea textArea_2 = new JTextArea();
		//back1.add(textArea_1);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		 JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane2.setBounds(1000,110,250,150);
		 back1.add(scrollPane2);
		//add(back1);
		
		JLabel oberoi = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		oberoi.setBounds(800, 110, 200, 150);
		SetImageSize(oberoi,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging1-oberoi.jpg"));
		//add(lalbagh);
		back1.add(oberoi);
		
		String text3="Name: Royal Orchid\nLocation :1, Golf Avenue, Adjoining KGA Golf Course, HAL Airport Rd, Bengaluru, Karnataka 560008\nPhone: +91 80 4178 3000\nReviews : 5 stars";
		JTextArea textArea_3 = new JTextArea();
		//back1.add(textArea_1);
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		 JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane3.setBounds(300,330,250,150);
		 back1.add(scrollPane3);
		//add(back1);
		
		JLabel ro = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ro.setBounds(100, 330, 200, 150);
		SetImageSize(ro,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging4-royalorchid.jpg"));
		//add(lalbagh);
		back1.add(ro);
		
		String text4="Name: Trinity Suites\nLocation :1/3, Artillery Road, Cambridge Layout, Ulsoor, Bengaluru, Karnataka 560008\nPhone:080 4164 6100\nReviews : 4.7 stars";
		JTextArea textArea_4 = new JTextArea();
		//back1.add(textArea_1);
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		 JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane4.setBounds(1000,330,250,150);
		 back1.add(scrollPane4);
		//add(back1);
		
		JLabel ts = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ts.setBounds(800, 330, 200, 150);
		SetImageSize(ts,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging5-trinitysuites.jpg"));
		//add(lalbagh);
		
		back1.add(ts);
		
		JLabel ll = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ll.setBounds(100, 550, 200, 150);
		SetImageSize(ll,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging3-leelapalace.jpg"));
		//add(lalbagh);
		back1.add(ll);
		
		String text6="Name: Leela Palace\nLocation :23, HAL Airport Rd, ISRO Colony, Domlur, Bengaluru, Karnataka 560008\nPhone: 080 2521 1234\nReviews : 4.7 stars";
		JTextArea textArea_6 = new JTextArea();
		//back1.add(textArea_1);
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		 JScrollPane scrollPane6 = new JScrollPane(textArea_6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane6.setBounds(300,550,250,150);
		 back1.add(scrollPane6);
		
		 JLabel jw = new JLabel("");
			//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		jw.setBounds(800, 550, 200, 150);
			SetImageSize(jw,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lodging6-JWmarriot.jpg"));
			//add(lalbagh);
			back1.add(jw);
			
			String text7=" Name: JWmarriot\nLocation :24/1, Vittal Mallya Road, Bengaluru, Karnataka 560001\nPhone: 080671 89999\nReviews : 4.4 stars";
			JTextArea textArea_7 = new JTextArea();
			//back1.add(textArea_1);
			textArea_7.setBackground(Color.WHITE);
			textArea_7.setText(text7);
			textArea_7.setLineWrap(true);
			textArea_7.setWrapStyleWord(true);
			textArea_7.setEditable(false);
			textArea_7.setCaretPosition(0);
			 JScrollPane scrollPane7 = new JScrollPane(textArea_7,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			 scrollPane7.setBounds(1000,550,250,150);
			 back1.add(scrollPane7);
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
