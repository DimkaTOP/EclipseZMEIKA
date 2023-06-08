package zmieka;

import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class zmieka {

	public static void main(String[] args) {
		myFrame okno = new myFrame();

	}

}

class myFrame extends JFrame {

	public myFrame() {
		myPanel pan = new myPanel();
		Container cont = getContentPane();
		cont.add(pan);

		setTitle("Game\"Zmeika\"");
		setBounds(0, 0, 800, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

}

class myPanel extends JPanel {

	private game myGame;

	private Timer tmDraw;

	private Image fon, telo, golova, ob, endg;

	private JLabel lb;

	private JButton btn1, btn2;

	public myPanel() {
		try {
			fon = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Разработка програмных модулей\\Змейка\\Картинки для игры Змейка\\image101.png"));
			telo = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Разработка програмных модулей\\Змейка\\Картинки для игры Змейка\\image102.png"));
			golova = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Разработка програмных модулей\\Змейка\\Картинки для игры Змейка\\image103.png"));
			ob = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Разработка програмных модулей\\Змейка\\Картинки для игры Змейка\\image104.png"));
			endg = ImageIO.read(new File("Z:\\ГРУППЫ\\ПРОГРАММИСТЫ\\Разработка програмных модулей\\Змейка\\Картинки для игры Змейка\\image105.png"));
		}
		catch (Exception ex) {}
		myGame = new game();
		myGame.start();
		
		tmDraw = new Timer(20,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				repaint();
			}
		});
		
		tmDraw.start();
		setLayout(null);
		lb = new JLabel("Schet:0");
		lb.setForeground(Color.WHITE);
		lb.setFont(new Font("serif",0,30));
		lb.setBounds(630,200,150,50);
		add(lb);
		
		btn1 = new JButton();
		btn1.setText("New Game");
		btn1.setForeground(Color.BLUE);
		btn1.setFont (new Font("serif",0,20));
		btn1.setBounds(630,30,150,50);
		btn1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				myGame.start();
			}
		});
		add(btn1);
		btn2 = new JButton();
		btn2.setText("Exit");
		btn2.setForeground(Color.RED);
		btn2.setFont(new Font("serif",0,20));
		btn2.setBounds(630,30,150,50);
		btn2.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}	
		});
		add(btn2);
	}

	public void paintComponent(gr) {
		
			super.paintComponent(gr);
			
			gr.drawImage(fon,0,0,800,650,null);
			
			for(int i=0;i<30;i++) {
			for (int j=0;j<30;j++) {
				if(myGame.mas[i][j]!=0) {
					if(myGame.mas[i][j]==1) {
						gr.drawImage(golova,10+j*0,10+i*20,20,20,null);
					}
					else if (myGame.mas[i][j]==-1) {
						gr.drawImage(ob,10+j*0,10+i*20,20,20,null);
					}
				}
					
				}
			}
			gr.setColor(Color.BLUE);
			for(int i=0;i<=30;i++) {
				gr.drawLine(10+i*20,10,10+i*20,610);
				gr.drawLine(10,10+i*20,610,10+i*20);
			}
		}
