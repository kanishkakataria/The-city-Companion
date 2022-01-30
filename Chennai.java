package smartcity;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//import com.teamdev.jxbrowser.chromium.Browser;
//import com.teamdev.jxbrowser.chromium.BrowserFactory;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//import AppPackage.AnimationClass;

public class Chennai extends JFrame {
	
	
	ImageIcon i1=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai3.jpg");
	ImageIcon i5=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai4.jpg");
	ImageIcon i4=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/chennai2.jpg");
	ImageIcon i3=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Chennai/city3.jpg");
	ImageIcon i2=new ImageIcon("/Users/kanishkamishra/Desktop/bang_flow.jpg");
	//ImageIcon i6=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lalbagh.jpg");

	String[] list=
		{
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai3.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/chennai4.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/chennai2.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Chennai/city3.jpg",
				"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/church1-st.francis.jpg ",
			
			
	};
	
	private JPanel contentPane;
	//AnimationClass AC=new AnimationClass();
	static JScrollPane scroll ;
	JLabel bslide1,bslide2;
	int x=0;
	Timer tm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//JFrame frame = new JFrame("Label Demo");
	      /*JLabel label;
	      label = new JLabel("Left aligned!", JLabel.LEFT);
	      label.setFont(new Font("Verdana", Font.PLAIN, 13));
	      frame.add(label);
	      frame.setSize(500,300);
	      frame.setVisible(true);*/
	      
	      
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chennai frame = new Chennai();
					frame.setVisible(true);
					frame.Slideshow_Chen();
					frame.getContentPane().add(scroll);
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
	public Chennai() {
//		ImageIcon i=new ImageIcon();
//		tm = new Timer(2000,new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                SetImageSize(bslide1,new ImageIcon(list[x]));
//                x += 1;
//                if(x >= list.length )
//                    x = 0; 
//            }
//        });
//	 //add(pic);
//        tm.start();
	
		Slideshow_Chen();
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
		
		//Slideshow();
		setBounds(5, 50, 1440, 920);
		
		
		back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		
		JLabel title = new JLabel("CHENNAI");
		getContentPane().setBackground(Color.PINK);
		back.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setForeground(Color.BLUE);
		title.setBounds(580, 20, 300, 40);
		
		
         
        
        // back.add(bslide2);
         
         bslide1 = new JLabel("");
         back.add(bslide1);
         bslide1.setBounds(0, 140,840, 500);
         
         bslide2 = new JLabel("");
         bslide2.setBounds(840, 140, 840, 500);
         back.add(bslide2);
       
        
        JButton Tourism = new JButton("Tourism");
        back.add(Tourism);
        Tourism.setBackground(Color.WHITE);
        Tourism.setForeground(Color.BLACK);
        Tourism.setFont(new Font("Tahoma",Font.BOLD,20));
        Tourism.setBounds(954,30, 110,33);
        
        JButton Education = new JButton("Education");
        back.add(Education);
        Education.setBackground(Color.WHITE);
        Education.setForeground(Color.BLACK);
        Education.setFont(new Font("Tahoma",Font.BOLD,20));
        Education.setBounds(1140, 30, 110, 33);
        
        /*JButton Business = new JButton("Business");
        back.add(Business);
        Business.setBackground(Color.WHITE);
        Business.setBounds(1113, 20, 100, 23);*/
        
       JButton General = new JButton("BACK");
        back.add(General);
        General.setBackground(Color.WHITE);
        General.setFont(new Font("Dialog",Font.BOLD,20));
        General.setBounds(1313, 30, 110, 33);
      
        General.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		/* Browser browser = BrowserFactory.create();
        	        JFrame frame = new JFrame("JxBrowser Google Maps");
        	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        	        frame.add(browser.getView().getComponent(), BorderLayout.CENTER);
        	        frame.setSize(700, 500);
        	        frame.setLocationRelativeTo(null);
        	        frame.setVisible(true);
        	        browser.loadURL("http://maps.google.com");*/
        		City c = new City();
        		c.show();
        	}
        });
      
        Education.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		EducationChennai t=new EducationChennai(); 
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
        		FrameDisplayChennai t=new FrameDisplayChennai(); 
        	}
        });
        Tourism.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        
        
        
        JButton Hospitals = new JButton("Hospitals");
        back.add(Hospitals);
        Hospitals.setBackground(Color.WHITE);
        Hospitals.setFont(new Font("Dialog",Font.BOLD,20));
        Hospitals.setBounds(1140, 95, 110, 33);
        
        Hospitals.addMouseListener(new MouseAdapter() {
        	@SuppressWarnings("deprecation")
			@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		Hospital_Chennai hb=new Hospital_Chennai(); 
        		
        		hb.show();
                
        	}
        });
        Hospitals.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		Hospital_Chennai hb=new Hospital_Chennai(); 
        		
        		hb.show();
        	}
        });
        
        
         bslide1.setVisible(true);
         bslide2.setVisible(true);
	     //JPanel text = new JPanel();x
		// String all = new Scanner(new File("textExample.txt")).useDelimiter("\\A").next(); 
	     //SetImageSize();

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
	
	public void Slideshow_Chen() {
		new Thread() {
			int count = 0;

			@Override
			public void run() {
				try {
					while (true) {
						switch (count) {
						case 0: // System.out.println("Hello");
								// ImageIcon i1=new
								// ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
								// bslide1.setIcon(i1);
							bslide1.setVisible(true);
							Thread.sleep(1000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i1);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i2);
							// bslide2.setBounds(840, 0,20,7);
							count = 1;
							break;
						case 1:

							// ImageIcon i2=new
							// ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang4.jpg");
							// bslide2.setIcon(i2);
							bslide2.setVisible(true);
							Thread.sleep(2000);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i3);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i4);
							// bslide2.setBounds(840,0,20,7);
							// bslide2.setBounds(0, 840,20,7);
							count = 2;
							break;
						case 2: // Thread.sleep(2000);
							// ImageIcon i3=new
							// ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
							// bslide1.setIcon(i3);
							bslide1.setVisible(true);
							Thread.sleep(2000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i5);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i1);
							// bslide1.setBounds(0,-840,20,7);
							// bslide2.setBounds(840, 0,20,7);
							count = 3;
							break;
						case 3: // Thread.sleep(2000);
							// ImageIcon i4=new
							// ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang4.jpg");
							// bslide2.setIcon(i4);
							bslide2.setVisible(true);
							Thread.sleep(2000);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i2);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i3);
							// bslide2.setBounds(840,0,20,7);
							// bslide2.setBounds(0, 840,20,7);
							count = 4;
							break;
						case 4: // Thread.sleep(2000);
							// ImageIcon i5=new
							// ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
							// bslide1.setIcon(i5);
							bslide1.setVisible(true);
							Thread.sleep(2000);
							bslide1.setBounds(7, 140, 770, 550);
							SetImageSize(bslide1, i4);
							bslide2.setBounds(770, 140, 660, 550);
							SetImageSize(bslide2, i5);
							// bslide1.setBounds(0, -840,20,7);
							// bslide2.setBounds(840, 0,20,7);
							count = 0;
							// Thread.sleep(2000);
							break;
						}
					}

				} catch (Exception e) {

				}
			}
		}.start();
	}
}

