package smartcity;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

//import com.teamdev.jxbrowser.chromium.Browser;

//import AppPackage.AnimationClass;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Bangalore extends JFrame {

	private JPanel contentPane;

	static JScrollPane scroll;
	JLabel bslide1, bslide2;
	ImageIcon i1 = new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang3.jpg");
	ImageIcon i5 = new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/slide/bang4.jpg");
	ImageIcon i4 = new ImageIcon("/Users/kanishkamishra/Desktop/bang_.jpg ");
	ImageIcon i3 = new ImageIcon("/Users/kanishkamishra/Desktop/bang_flow.jpg");
	ImageIcon i2 = new ImageIcon("//Users/kanishkamishra/Desktop/bang_leela.jpg");
	ImageIcon i6 = new ImageIcon(
			"/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/Bangalore/lalbagh.jpg");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bangalore frame = new Bangalore();
					frame.setVisible(true);
					frame.Slideshow();
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
	JLabel back;

	public Bangalore() {
		Slideshow();
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(5, 50, 1440, 920);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setBackground(Color.BLACK);

		setBounds(5, 50, 1440, 920);

		back = new JLabel("");
		back.setBounds(0, 0, 1500, 750);
		contentPane.add(back);

		JLabel title = new JLabel("BANGALORE");
		getContentPane().setBackground(Color.GRAY);
		back.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 35));
		title.setForeground(Color.BLUE);
		title.setBounds(580, 20, 300, 40);

		bslide1 = new JLabel("");
		back.add(bslide1);
		bslide1.setBounds(0, 140, 840, 500);

		bslide2 = new JLabel("");
		bslide2.setBounds(840, 140, 840, 500);
		back.add(bslide2);

		JButton Tourism = new JButton("Tourism");
		back.add(Tourism);
		Tourism.setBackground(Color.WHITE);
		Tourism.setBounds(954, 30, 110, 33);

		JButton Education = new JButton("Education");
		back.add(Education);
		Education.setBackground(Color.WHITE);
		Education.setBounds(1140, 30, 110, 33);

		JButton General = new JButton("BACK");
		back.add(General);
		General.setBackground(Color.WHITE);
		General.setBounds(1313, 30, 110, 33);

		General.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				City c = new City();
				c.show();
			}
		});

		Education.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EducationBlore t = new EducationBlore();
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

				FrameDisplayTest t1 = new FrameDisplayTest();

			}
		});
		Tourism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton Hospitals = new JButton("Hospitals");
		back.add(Hospitals);
		Hospitals.setBackground(Color.WHITE);
		Hospitals.setBounds(1140, 95, 110, 33);

		Hospitals.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Hospitals_Blore hb = new Hospitals_Blore();

				hb.show();

			}
		});
		Hospitals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Hospitals_Blore hb = new Hospitals_Blore();

				hb.show();
			}
		});
		bslide1.setVisible(true);
		bslide2.setVisible(true);

	}

	public void SetImageSize() {
		ImageIcon icon = new ImageIcon("/Users/kanishkamishra/Desktop/SmartCity-Application/SmartCity/img/bg13.jpg");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);

		ImageIcon newImc = new ImageIcon(newImg);
		back.setIcon(newImc);

	}

	public void SetImageSize(JLabel label, ImageIcon im) {
		ImageIcon icon = im;
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		// Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		label.setIcon(newImc);

	}

	public void Slideshow() {
		new Thread() {
			int count = 0;

			@Override
			public void run() {
				try {
					while (true) {
						switch (count) {
						case 0:
							bslide1.setVisible(true);
							Thread.sleep(1000);
							bslide1.setBounds(7, 180, 770, 550);
							SetImageSize(bslide1, i1);
							bslide2.setBounds(770, 180, 660, 550);
							SetImageSize(bslide2, i2);

							count = 1;
							break;
						case 1:

							bslide2.setVisible(true);
							Thread.sleep(2000);
							bslide2.setBounds(770, 180, 660, 550);
							SetImageSize(bslide2, i3);
							bslide1.setBounds(7, 180, 770, 550);
							SetImageSize(bslide1, i2);

							count = 2;
							break;
						case 2:
							bslide1.setVisible(true);
							Thread.sleep(3000);
							bslide1.setBounds(7, 180, 770, 550);
							SetImageSize(bslide1, i5);
							bslide2.setBounds(770, 180, 660, 550);
							SetImageSize(bslide2, i6);

							count = 3;
							break;
						case 3:
							bslide2.setVisible(true);
							Thread.sleep(3000);
							bslide2.setBounds(770, 180, 660, 550);
							SetImageSize(bslide2, i1);
							bslide1.setBounds(7, 180, 770, 550);
							SetImageSize(bslide1, i2);

							count = 4;
							break;
						case 4:
							bslide1.setVisible(true);
							Thread.sleep(3000);
							bslide1.setBounds(7, 180, 770, 550);
							SetImageSize(bslide1, i3);
							bslide2.setBounds(770, 180, 660, 550);
							SetImageSize(bslide2, i5);

							count = 0;

							break;
						}
					}

				} catch (Exception e) {

				}
			}
		}.start();

	}
}
