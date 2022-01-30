package smartcity;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.Button;

public class PlacesMumbai extends JPanel {
    JButton ptv,hotels,b_l,goback; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesMumbai() {

		setLayout(null);
		
		
		
//      JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//       scrollPane.setBounds(32, 42, 789,469);
       setBackground(Color.PINK);
       setBounds(5, 50, 1440, 920);
		
		//scrPane.setPreferredSize(new Dimension(1500,800));
		
        back1= new JLabel("");
        back1.setEnabled(false);
        //back1.setIcon(null);
		//back1.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		
		
		add(back1);
		//add(scrollPane);
//	    ptv= new JButton("PLACES TO VISIT");
//		
//		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
//		ptv.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				FrameDisplayTest ft = new FrameDisplayTest();
//				//ft.show();
////				 FrameDisplayTest.frame.remove(FrameDisplayTest.panel);
////				 FrameDisplayTest.frame.setContentPane(new PlacesBLore());
////				 FrameDisplayTest.frame.setVisible(true);
//			}
//		});
//		//SetImageSize(back1,new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
//		ptv.setForeground(Color.WHITE);
//		ptv.setBackground(Color.BLACK);
//		ptv.setBounds(0, 0, 200, 34);
//		back1.add(ptv);
		
		//add(textArea_1);
		
		
//		hotels = new JButton("HOTELS");
//        hotels.setForeground(Color.WHITE);
//		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
//		hotels.setBackground(Color.BLACK);
//		hotels.setBounds(199, 0, 200, 34);
//		back1.add(hotels);
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
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Tahoma", Font.ITALIC, 20));
		goback.setForeground(Color.BLACK);
		goback.setBackground(Color.WHITE);
		goback.setMargin(new Insets(20,20,20,20));
		goback.setBorderPainted(true);
		//ptv.setMargin(new Insets(10,10,10,10));
		//ptv.setBorder(thickBorder);
		goback.setBounds(1150, 5, 200, 35);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Mumbai b=new Mumbai();
				 b.Slideshow_Mum();
				 b.show();
			}
		});
//		b_l = new JButton("BOARDING AND LODGING");
//		b_l.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				FrameDisplayTest.frame.remove( FrameDisplayTest.panel);
//				 FrameDisplayTest.frame.setContentPane(new B_LBlore());
//				 FrameDisplayTest. frame.setVisible(true);
//			}
//		});
//		b_l.setForeground(Color.WHITE);
//		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
//		b_l.setBackground(Color.BLACK);
//		b_l.setBounds(397, 0, 250, 34);
//		back1.add(b_l);
		
		String text1="The Gateway of India is a monument built during the 20th century in Mumbai City of Maharashtra state in Western India. /"
	    		+ "It is located on the waterfront in the Apollo Bunder area in South Mumbai and overlooks the Arabian Sea. /"
	    		+ "The structure is a basalt arch, 26 metres (85 feet) high. It lies at the end of Chhatrapati Shivaji Marg at the water's edge in Mumbai Harbour./"
	    		+ " It was a crude jetty used by the fishing community which was later renovated and used as a landing place for British governors and other prominent people. /"
	    		+ "In earlier times, it would have been the first structure that visitors arriving by boat in Mumbai would have seen. /"
	    		+ "The Gateway has also been referred to as the Taj Mahal of Mumbai";
				
		JTextArea textArea_1 = new JTextArea();
		//back1.add(textArea_1);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		 JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(300, 110, 250,150);
		 back1.add(scrollPane1);

		
		JLabel lalbagh = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		lalbagh.setBounds(100, 110, 200, 150);
		SetImageSize(lalbagh,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mumbai/new/gateway-of-india-mumbai.jpg"));
		//add(lalbagh);
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("GARDENS");
		 title1.setFont(new Font("Tahoma", Font.BOLD, 25));
		title1.setBounds(601,68, 305, 34);
		back1.add(title1);
		
		JLabel title2 = new JLabel("AMUSEMENT PARKS");
		title2.setFont(new Font("Tahoma", Font.BOLD, 25));
		title2.setBounds(561,278, 305, 34);
		back1.add(title2);
		
		
		String text2="Sanjay Gandhi National Park (aSGNP), previously Borivali National Park, is a large protected area in the northern part of Mumbai city in Maharashtra State";
				
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
		
		JLabel cubbonpark = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		cubbonpark.setBounds(800, 110, 200, 150);
		SetImageSize(cubbonpark,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/cubbonpark.jpg"));
		//add(lalbagh);
		back1.add(cubbonpark);
		
		String text3="Taraporewala Aquarium : Taraporewala Aquarium is India's oldest aquarium and one of the city's main attractions. It hosts marine and freshwater fishes. The aquarium is located on Marine Drive in Mumbai. In the aquarium's 16 sea water tanks and nine sweet water tanks, there are 31 types of fish, while 32 tropical tanks contains 54 kind of fishes. The tropical section of the aquarium already feature different ecosystems such as the moss aquarium for pregnant fishes, plantation aquarium that features imported varieties of water lilies and other aquatic plants and island aquarium";
		JTextArea textArea_3 = new JTextArea();
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
		
		JLabel wonderla = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		wonderla.setBounds(100, 330, 200, 150);
		SetImageSize(wonderla,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/wonderla.jpg"));
		//add(lalbagh);
		back1.add(wonderla);
		
		String text4="The Global Vipassana Pagoda is a Meditation Hall near Gorai, North-west of Mumbai, India. The Pagoda was inaugurated by Pratibha Patil, then President of India on 8 February 2009. It is built on donated land on a peninsula between Gorai creek and the Arabian Sea. The pagoda is to serve as a monument of peace and harmony. The Global Vipassana Pagoda has been built out of gratitude to the Buddha, his teaching and the community of monks practicing his teaching. Its traditional Burmese design is an expression of gratitude towards the country of Myanmar for preserving the practice of Vipassana. The shape of the pagoda is a copy of the Shwedagon Pagoda (Golden Pagoda) in Yangon, Myanmar. It was built combining ancient Indian and modern technology to enable it to last for a thousand years";
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
		
		JLabel ifc = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		ifc.setBounds(800, 330, 200, 150);
		SetImageSize(ifc,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/ifc.jpg"));
		//add(lalbagh);
		
		back1.add(ifc);
		
		JLabel title3 = new JLabel("TEMPLES");
		title3.setFont(new Font("Tahoma", Font.BOLD, 25));
		title3.setBounds(601,508,250, 34);
		back1.add(title3);
		
		JLabel dg = new JLabel("");
		//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
		dg.setBounds(100, 550, 200, 150);
		SetImageSize(dg,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/dg.jpg"));
		//add(lalbagh);
		back1.add(dg);
		
		String text6=" One of the most popular temples in Mumbai is the Siddhivinayak Temple. The temple is dedicated to Lord Ganesha and is also touted to be one of the richest temples in India. The temple continues to see a footfall of millions every year as it is a very popular place to visit in Maharashtra. The Siddhivinayak Mandir has seen a handful of celebrities from the Bollywood industry as well as from many global leaders too, including Apple's CEO Tim Cook.";
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
		
		 JLabel iskcon = new JLabel("");
			//lalbagh.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\Bangalore\\lalbagh.jpg"));
			iskcon.setBounds(800, 550, 200, 150);
			SetImageSize(iskcon,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/iskcon.jpg"));
			
			back1.add(iskcon);
			
			String text7="Dedicated to Lord Vishnu, the Balaji temple at Nerul is one of the most visited South Indian temples in Mumbai. The temple stands tall at an estimated height of 60 feet and also features a beautiful garden within the complex. Housing temples dedicated to other Gods such as Lakshmi, Narasimha, Vidya Ganapati, Ramanuja, and Vishwaksena, one must visit this temple when in Mumbai.";
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
//	public static void main(String[] args)
//    {   
//        /*
//         * This is the most important part of your GUI app, never forget 
//         * to schedule a job for your event dispatcher thread : 
//         * by calling the function, method or constructor, responsible
//         * for creating and displaying your GUI.
//         */
//        SwingUtilities.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                //new FrameDisplayTest();
//                //FrameDisplayTest.frame.setContentPane(FrameDisplayTest.panel);
//            	//FrameDisplayTest.frame.setContentPane(new PlacesBLore());
//            	PlacesBLore p=new PlacesBLore();
//            }
//        });
//    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlacesMumbai frame = new PlacesMumbai ();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
