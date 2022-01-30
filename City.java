package smartcity;


import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;*/
 import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class City extends JFrame {

	Connection connect=null;
    private JList citylist;
    private DefaultListModel listarray;
	private JPanel contentPane;
	private JButton btnCancel,sb,btnlogOut;
    //ListSelector lh;
	private JTextField txt;
	private JLabel back;
	JLabel pic,disp1,disp2,disp3,disp4,disp5;
	String[] cities={
			"Bangalore","Chennai","Mangalore","Hyderabad","Mumbai"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String []args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				   City frame = new City();
					frame.addlist();	
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
	
	public String store;
    Bangalore b=new Bangalore();
    Chennai c=new Chennai();
    Mangalore mg=new Mangalore();
    Mumbai m=new Mumbai();
    Hyderabad h = new Hyderabad();

    private JLabel view;
    public void addlist()
     {
       listarray.addElement("Bangalore");
       listarray.addElement("Chennai");
       listarray.addElement("Mangalore");
       listarray.addElement("Mumbai");
       listarray.addElement("Hyderabad");
       setTitle("The City Companion");
       contentPane.add(view);
       this.add(b);
       citylist = new JList(listarray);
       contentPane.add(citylist);
       citylist.setVisibleRowCount(3);
       JScrollPane p=new JScrollPane(citylist);
      contentPane.add(p);
       this.add(txt);
       ListSelector lh= new ListSelector();
       citylist.addListSelectionListener(lh);
       pic.add(sb);
       submithandler sth=new submithandler();
       sb.addActionListener(sth);
       this.add(sb);  
       contentPane.add(btnCancel);
       //btnCancel.addActionListener(b);
       setLayout (null);
   
   }
    class ListSelector implements ListSelectionListener
    {
        @Override
        public void valueChanged(ListSelectionEvent e)
        {
            String s=citylist.getSelectedValue().toString();
            txt.setText(citylist.getSelectedValue().toString());
           store=s;
        }
    }
    class submithandler implements ActionListener
    {
		@Override
       public void actionPerformed(ActionEvent e)
       {
           
             if(store.equals("Bangalore"))
            {
                b.show();
            }
            else if(store.equals("Chennai"))
            {
            	//c.Slideshow();
                c.show();
            }
             else if(store.equals("Hyderabad"))
            {
                h.show();
            }
             else if(store.equals("Mangalore"))
             {
                 mg.show();
             }
             else if(store.equals("Mumbai"))
             {
            	 m.show();
       }
    }
    
}

    private JComboBox comboBox;
	public City(){
		DbConnect db=new DbConnect();
		connect=db.dataConnector();
		
		JLabel background = new JLabel("");
	    btnlogOut=new JButton("Log Out");
	    background.setBackground(Color.WHITE);
	    background.setForeground(Color.BLACK);
	    btnlogOut.setBounds(1200, 10, 200, 35);
	    btnlogOut.setVisible(true);
		
		
		setTitle("Choose City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1500, 750);
		pic.setVisible(true);
		contentPane.add(pic);
		
		disp1=new JLabel();
		disp1.setBounds(50,80,220,190);
		disp1.setVisible(true);
		pic.add(disp1);
		SetImageSize(disp1,new ImageIcon("/Users/kanishkamishra/git/SmartCity-Application/SmartCity/img/Bangalore/bang2.jpg"));
		
		disp2=new JLabel();
		disp2.setBounds(340,80,220,190);
		disp2.setVisible(true);
		pic.add(disp2);
		SetImageSize(disp2,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/chennai2.jpg"));
		
		disp3=new JLabel();
		disp3.setBounds(630,80,220,190);
		disp3.setVisible(true);
		pic.add(disp3);
		SetImageSize(disp3,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/mang2.jpg"));
		
		disp4=new JLabel();
		disp4.setBounds(1175,80,220,190);
		disp4.setVisible(true);
		pic.add(disp4);
		SetImageSize(disp4,new ImageIcon("/Users/kanishkamishra/git/SmartCity-Application/SmartCity/img/hyd2.jpg"));
		
		disp5=new JLabel();
		disp5.setBounds(900,80,220,190);
		disp5.setVisible(true);
		pic.add(disp5);
		SetImageSize(disp5,new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mumbai/new/gateway-of-india-mumbai.jpg"));
		
		
	
		
//		try {
//			String query="select url_name from URL_demo where ID='2'";
//			PreparedStatement pst=connect.prepareStatement(query);
//			ResultSet rs=pst.executeQuery();
//			
			
			String text1="Bangalore, officially known as Bengaluru, is the capital of the Indian state of Karnataka. It has a population of about 8.42 million and a metropolitan population of about 8.52 million, making it the third most populous city and fifth most populous urban agglomeration in India.Located in southern India on the Deccan Plateau, at a height of over 900 m (3,000 ft) above sea level, Bangalore is known for its pleasant climate throughout the year. Its elevation is the highest among the major large cities of India.";
			JTextArea textArea_1 = new JTextArea();
			JTextArea textArea_2 = new JTextArea();
			JTextArea textArea_3 = new JTextArea();
			JTextArea textArea_4 = new JTextArea();
			JTextArea textArea_5 = new JTextArea();

			//create table Bangalore(id bigint PRIMARY KEY auto_increment, city_info varchar(3000), restaurants varchar(3000), hotels varchar(3000));

	        textArea_1.setBackground(Color.WHITE);
	        
//	        if(rs.next()){
//	        textArea_1.setText(rs.getString("url_name"));
	        JScrollPane scrollPane = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	        pic.add(scrollPane);
	       textArea_1.setText(text1);
	        scrollPane.setBounds(50, 300, 240,250);
	        textArea_1.setCaretPosition(0);
	        textArea_1.setLineWrap(true);
	        textArea_1.setWrapStyleWord(true);
	        textArea_1.setEditable(false);
	        
	   
	        
	        
	        
	       
	        
	       // else if(rs2.next()) {
	        
	        String text2="Chennai is the capital city of the Indian state of Tamil Nadu. Located on the Coromandel Coast off the Bay of Bengal, it is the biggest cultural, economic and educational centre in South India. Chennai is known as the \"Detroit of South Asia\" for its automobile industry. It is the fourth-largest city and fourth-most populous metropolitan area in the country and 36th-largest urban area in the world. Chennai is the most visited city in India by foreign tourists, and 38th most visited city in the world.\"The quality of living survey\" rated Chennai as the safest city in India.Chennai attracts about 45% of health tourists from abroad arriving in India, so the city is termed as \"health capital of India";
	        textArea_2.setBackground(Color.WHITE);
	        textArea_2.setText(text2);
	        JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        pic.add(scrollPane2);
	        textArea_2.setCaretPosition(0);
	        scrollPane2.setBounds(340, 300, 240,250);
	        textArea_2.setLineWrap(true);
	        textArea_2.setWrapStyleWord(true);
	        textArea_2.setEditable(false);
	        //}
	        
	        String text3="Mangalore, officially known as Mangaluru, is the chief port city of the Indian state of Karnataka. It is known as Kudla in Tulu, Mangaluru in Kannada, Maikāla in Beary, and Kodial in Canarese Konkani. It is located about 371 kilometres (230 mi) west of the state capital, Bangalore. Mangalore lies between the Arabian Sea and the Western Ghat mountain ranges, and is the administrative headquarters of the Dakshina Kannada (formerly South Canara) district in south western Karnataka. With its pristine beaches, broad roads and calm localities, Mangalore was ranked the 8th cleanest city of India and 2nd of Karnataka. Mangalore is the 2nd least polluted city in India and the 1st in Karnataka according to CPCB. Mangalore was ranked India's 13th and Karnataka's 2nd best destination for business.";
	        textArea_3.setBackground(Color.WHITE);
	        textArea_3.setText(text3);
	        textArea_3.setCaretPosition(0);
	        JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        pic.add(scrollPane3);
	        scrollPane3.setBounds(630, 300, 240,250);
	        textArea_3.setLineWrap(true);
	        textArea_3.setWrapStyleWord(true);
	        textArea_3.setEditable(false);
	        
	        String text4="Mumbai is the capital city of the Indian state of Maharashtra. It is the most populous city in India and the ninth most populous agglomeration in the world, with an estimated city population of 18.4 million. Along with the neighbouring regions of the Mumbai Metropolitan Region, it is one of the most populous urban regions in the world and the seсond most populous metropolitan area in India, with a population of 20.7 million as of 2011. Mumbai lies on the west coast of India and has a deep natural harbour. In 2009, Mumbai was named an alpha world city. It is also the wealthiest city in India, and has the highest GDP of any city in South, West, or Central Asia. Mumbai has the highest number of billionaires and millionaires among all cities in India.";
	         
	        textArea_4.setBackground(Color.WHITE);
	        textArea_4.setText(text4);
	        JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        pic.add(scrollPane4);
	        textArea_4.setCaretPosition(0);
	        scrollPane4.setBounds(900, 300, 230,250);
	        textArea_4.setLineWrap(true);
	        textArea_4.setWrapStyleWord(true);
	        textArea_4.setEditable(false);
	        
	        String text5="Hyderabad is the capital of the southern Indian state of Telangana and de jure capital of Andhra Pradesh.[A] Occupying 650 square kilometres (250 sq mi) along the banks of the Musi River, it has a population of about 6.7 million and a metropolitan population of about 7.75 million, making it the fourth most populous city and sixth most populous urban agglomeration in India. At an average altitude of 542 metres (1,778 ft), much of Hyderabad is situated on hilly terrain around artificial lakes, including Hussain Sagar—predating the city's founding—north of the city centre.";
	        textArea_5.setBackground(Color.WHITE);
	        textArea_5.setText(text5);
	        textArea_5.setCaretPosition(0);
	        JScrollPane scrollPane5 = new JScrollPane(textArea_5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        pic.add(scrollPane5);
	        scrollPane5.setBounds(1175, 300, 230,250);
	        textArea_5.setLineWrap(true);
	        textArea_5.setWrapStyleWord(true);
	        textArea_5.setEditable(false);
	        
	 
//	
//		}catch(Exception f){
//				JOptionPane.showMessageDialog(null, f);
//				
//			}
        
		listarray=new DefaultListModel();
	    txt=new JTextField(15);
	    sb=new JButton("Submit");
	    sb.setBackground(Color.WHITE);
	    sb.setForeground(Color.BLACK);
	    sb.setBounds(635, 720, 100, 30);
	    sb.setVisible(true);
	    
	    btnCancel=new JButton("CLOSE");
	    view=new JLabel("Select a city!");
	    view.setFont(new Font("Tahoma", Font.BOLD, 25));
	    view.setForeground(Color.WHITE);
	    comboBox = new JComboBox();
	    comboBox.setPreferredSize(new Dimension(250,150));
	    comboBox.setBounds(590, 650, 189, 41);
	    //comboBox.setBounds(getBounds());
		view.setBounds(600, 590, 300, 40);
	    view.setVisible(true);
	    int count=0;
	    for(int i = 0; i < cities.length; i++) 
	    	comboBox.addItem(cities[count++]); 
	    add(comboBox);
	    comboBox.setBackground(Color.PINK);
	   
		//addlist();
		//SetImageSize(0);
		sb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selected=(String)comboBox.getSelectedItem();
				if(selected.equals("Bangalore"))
				{
					dispose();
					b.Slideshow();
					b.show();
				}	
				else if(selected.equals("Chennai"))
				{
					dispose();
					c.Slideshow_Chen();
					c.show();
				}
				else if(selected.equals("Mumbai")){
					dispose();
					m.Slideshow_Mum();
					m.show();
				}
				else if (selected.equals("Mangalore")){
					dispose();
					mg.Slideshow_Mlore();
					mg.show();
				}
				else if(selected.equals("Hyderabad")){
					dispose();
					h.Slideshow_Hybd();
					h.show();
				}
			}
		});
		
		
		btnlogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w = new Welcome();
				w.show();
			}
		});
		
		 //add(pic);
	        
	        getContentPane().setLayout(null);
	        //setSize(1272, 712);
	       
			//SetImageSize();
	        JLabel lblNewLabel = new JLabel("CHOOSE A CITY");
			contentPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setBounds(595, 20, 300, 25);
	        contentPane.add(pic);
	        contentPane.add(view);
	        contentPane.add(comboBox);
	       // contentPane.add(pic);
	        
	        comboBox.setVisible(true);
	       
	        pic.add(sb);
	        pic.add(btnlogOut);
	       getContentPane().setBackground(Color.decode("#bdb67b"));
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
			
		
		
		setBackground(Color.white);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
	
	}
	
	public void SetImageSize()
	{
		ImageIcon icon=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/bg13.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
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
