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
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

//import AppPackage.AnimationClass;

public class Hyderabad extends JFrame {
	
	ImageIcon i1=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/city1.jpg");
	ImageIcon i5=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/hyd_city.jpg");
	ImageIcon i4=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/city2.jpg");
	ImageIcon i3=new ImageIcon("/Users/kanishkamishra/Desktop/bang_flow.jpg");
	ImageIcon i2=new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Hyderabad/tourism/golcondafort.jpg");
	

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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hyderabad frame = new Hyderabad();
					frame.setVisible(true);
					frame.Slideshow_Hybd();
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
	public Hyderabad() {
		
		Slideshow_Hybd();
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
		
		Slideshow_Hybd();
		setBounds(5, 50, 1440, 920);
		
		
		back= new JLabel("");
		//back.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\a-images for smartcity\\bg13.jpg"));
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		
		JLabel title = new JLabel("HYDERABAD");
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
        Tourism.setBounds(954,30, 120,33);
        
        JButton Education = new JButton("Education");
        back.add(Education);
        Education.setBackground(Color.WHITE);
        Education.setForeground(Color.BLACK);
        Education.setFont(new Font("Tahoma",Font.BOLD,20));
        Education.setBounds(1140, 30, 120, 33);
        
       
        
        JButton General = new JButton("BACK");
        back.add(General);
        General.setBackground(Color.WHITE);
        General.setFont(new Font("Tahoma",Font.BOLD,20));
        General.setBounds(1313, 30, 120, 33);
        
        
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
        		EducationHyd t=new EducationHyd(); 
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
        		FrameDisplayHyd t=new FrameDisplayHyd(); 
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
        		Hospitals_Hydbd hb=new Hospitals_Hydbd(); 
        		
        		hb.show();
                
        	}
        });
        Hospitals.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		Hospitals_Hydbd hb=new Hospitals_Hydbd(); 
        		
        		hb.show();
        	}
        });
        
        
         bslide1.setVisible(true);
         bslide2.setVisible(true);
	     //JPanel text = new JPanel();
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
	
	public void Slideshow_Hybd(){
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
					
				}
				catch(Exception e)
				{
					
				}
			}
		}.start();
	}
}
