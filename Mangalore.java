package smartcity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

//import AppPackage.AnimationClass;

public class Mangalore extends JFrame {

	private JPanel contentPane;
	//AnimationClass AC=new AnimationClass();
	static JScrollPane scroll ;
	JLabel bslide1,bslide2;
	/**
	 * Launch the application.
	 */
	
	
	ImageIcon i1=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/mang2.jpg");
	ImageIcon i5=new ImageIcon("/Users/kanishkamishra/Desktop/mang.jpg");
	ImageIcon i4=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Mangalore/panambur.jpg");
	ImageIcon i3=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/mang3.jpg");
	ImageIcon i2=new ImageIcon("/Users/kanishkamishra/Desktop/mang_beach.jpg");
	ImageIcon i6=new ImageIcon("/Users/kanishkamishra/Desktop/bang_.jpg");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mangalore frame = new Mangalore();
					frame.setVisible(true);
					frame.Slideshow_Mlore();
					//frame.getContentPane().add(scroll);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel back ;
	//private JLabel lblNewLabel;
	public Mangalore() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.PINK);
		
		Slideshow_Mlore();
		
		
		back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		
		JLabel title = new JLabel("MANGALORE");
		back.add(title);
		title.setFont(new Font("TimesRomanBOLD", Font.BOLD, 30));
		title.setForeground(Color.BLUE);
		title.setBounds(500,20, 300, 40);
		
		
         
        
        // back.add(bslide2);
         
         bslide1 = new JLabel("");
         back.add(bslide1);
         bslide1.setBounds(0, 140,840, 500);
         
         bslide2 = new JLabel("");
         bslide2.setBounds(840, 140, 840, 500);
         back.add(bslide2);
       
        
        JButton Tourism = new JButton("TOURISM");
        back.add(Tourism);
        Tourism.setBackground(Color.ORANGE);
        Tourism.setFont(new Font("Dialog",Font.BOLD,15));
        Tourism.setBounds(954, 30, 110, 33);
        
        
        JButton Education = new JButton("EDUCATION");
        back.add(Education);
        Education.setFont(new Font("Dialog",Font.BOLD,15));
        Education.setBackground(Color.WHITE);
        Education.setBounds(1140, 30, 110, 33);
        
       
        
        JButton General = new JButton("BACK");
        back.add(General);
        General.setBackground(Color.WHITE);
        General.setFont(new Font("Dialog",Font.BOLD,15));
        General.setBounds(1313, 30, 110, 33);
      
        General.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//Browser browser = new Browser();
        		 //BrowserView view = new BrowserView(browser);

//        	        JFrame frame = new JFrame("Google Maps");
//        	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        	        //frame.add(view, BorderLayout.CENTER);
//        	        frame.setSize(700, 500);
//        	        frame.setLocationRelativeTo(null);
//        	        frame.setVisible(true);
        	       // browser.loadURL("http://www.google.com");
        		City c = new City();
        		c.show();
        	}
        });
        Education.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EducationMlore t=new EducationMlore(); 
                t.show();
        	}
        });
        Education.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        Tourism.addMouseListener(new MouseAdapter() {
        	@SuppressWarnings("deprecation")
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		//TourismBlore t=new TourismBlore(); 
                //t.show();
        		FrameDisplayMangalore t=new FrameDisplayMangalore(); 
        		
        	}
        });
        Tourism.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
   
        JButton Hospitals = new JButton("Hospitals");
        Hospitals.setFont(new Font("Dialog",Font.BOLD,15));
         back.add(Hospitals);
         Hospitals.setBackground(Color.WHITE);
         Hospitals.setBounds(1140, 95, 110, 33);
         
         Hospitals.addMouseListener(new MouseAdapter() {
         	@SuppressWarnings("deprecation")
 			@Override
         	public void mouseClicked(MouseEvent e) {
         		dispose();
         		Hospital_Mang hb=new Hospital_Mang(); 
         		
         		hb.show();
                 
         	}
         });
         Hospitals.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent arg0) {
         		dispose();
         		Hospital_Mang hb=new Hospital_Mang(); 
         		
         		hb.show();
         	}
         });
         
         
          bslide1.setVisible(true);
          bslide2.setVisible(true);
         
         
         
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

	public void Slideshow_Mlore(){
		new Thread(){
			int count=0;
			@Override
			public void run()
			{
				try{
					while(true)
					{
						switch(count)
						{
						case 0 : //System.out.println("Hello");
							    //ImageIcon i1=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
						        //bslide1.setIcon(i1);
						        bslide1.setVisible(true);
						        Thread.sleep(1000);
							    bslide1.setBounds(7,180,770,550);
							    SetImageSize(bslide1,i1);
							    bslide2.setBounds(770,180,660,550);
							    SetImageSize(bslide2,i2);
							    //bslide2.setBounds(840, 0,20,7);
						        count=1;
								break;
						case 1: 
							
					    //ImageIcon i2=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang4.jpg");
				        //bslide2.setIcon(i2);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        bslide2.setBounds(770,180,660,550);
					    SetImageSize(bslide2,i3);
					    bslide1.setBounds(7,180,770,550);
					    SetImageSize(bslide1,i2);
				        //bslide2.setBounds(840,0,20,7);
				        //bslide2.setBounds(0, 840,20,7);
				        count=2;
						break;
						case 2: //Thread.sleep(2000);
					    //ImageIcon i3=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
				        //bslide1.setIcon(i3);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        bslide1.setBounds(7,180,770,550);
					    SetImageSize(bslide1,i5);
					    bslide2.setBounds(770,180,660,550);
					    SetImageSize(bslide2,i6);
				        //bslide1.setBounds(0,-840,20,7);
				        //bslide2.setBounds(840, 0,20,7);
				        count=3;
						break;
						case 3: //Thread.sleep(2000);
					    //ImageIcon i4=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang4.jpg");
				        //bslide2.setIcon(i4);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        bslide2.setBounds(770,180,660,550);
					    SetImageSize(bslide2,i1);
					    bslide1.setBounds(7,180,770,550);
					    SetImageSize(bslide1,i2);
				        //bslide2.setBounds(840,0,20,7);
				        //bslide2.setBounds(0, 840,20,7);
				        count=4;
						break;
						case 4: //Thread.sleep(2000);
					    //ImageIcon i5=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
				        //bslide1.setIcon(i5);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        bslide1.setBounds(7,180,770,550);
					    SetImageSize(bslide1,i3);
					    bslide2.setBounds(770,180,660,550);
					    SetImageSize(bslide2,i5);
				        //bslide1.setBounds(0, -840,20,7);
				       // bslide2.setBounds(840, 0,20,7);
				        count=0;
				        //Thread.sleep(2000);
						break;
						}
					}
					
				}
				catch(Exception e)
				{
					
				}
			}
		}.start();
	}
}
