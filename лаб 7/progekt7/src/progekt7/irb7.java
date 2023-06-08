package progekt7;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class irb7 {
	public static void main(String[] args) {
			myFrame okno = new myFrame();
				}
		}
							
				class myFrame extends JFrame{
							public myFrame() {
								myPanel np = new myPanel();
								Container cont = getContentPane();
								cont.add(np);
								setBounds(10,10,800,600);
								setVisible(true);
								}
							}
						class myPanel extends JPanel{
							private int x=0,y=0;
							private int napr = 2;
							private Image img;
							public myPanel(){
								Timer nt = new Timer(25, new ActionListener(){
									public void actionPerformed(ActionEvent e) {
										if(napr==0)x-=2;
										if(napr==1)y-=2;
										if(napr==2) {
											x+=2;
											y+=2;
										}
										if(napr==3)y+=2;
										repaint();
										}
									});
										nt.start();
										try{
											img = ImageIO.read(new File("C:\\Users\\User\\Desktop\\lab.GIF"));
										}
										catch(IOException exp) {}
										}
									public void paintComponent(Graphics gr) {
										gr.clearRect(x-2, y-2, img.getWidth(null)+2, img.getHeight(null)+2);
										gr.drawImage(img, x, y,null);
										}
									}

							






