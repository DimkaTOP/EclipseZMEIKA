package progekt7;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class prpgektEi7 {

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
			private class myKey implements KeyListener{
				public void keyPressed(KeyEvent e) {
					int key_ = e.getKeyCode();
					if(key_==37) napr = 0;
					if(key_==39) napr = 2;
					if(key_==38) napr = 1;
					if(key_==40) napr = 3;
				}
				
				public void keyReleased(KeyEvent e) {}
				public void keyTyped(KeyEvent e) {}
			}
			public myPanel(){
				
			addKeyListener(new myKey());
			setFocusable(true);
				Timer nt = new Timer(25, new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						if(napr==0) x--;
						if(napr==1) y--;
						if(napr==2) x++;
						if(napr==3) y++;
						repaint();
						}
					});
						nt.start();
						try{
							img = ImageIO.read(new File("C:\\Users\\User\\Desktop\\uu.jpeg"));
						}
						catch(IOException exp) {}
						}
					public void paintComponent(Graphics gr) {
						gr.clearRect(x-1, y-1, img.getWidth(null)+1, img.getHeight(null)+1);
						gr.drawImage(img, x, y,null);
						}
					}

			


