package zidi6;

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


public class zi6 {
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
	private Image img;
	public myPanel(){
		Timer nt = new Timer(50, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				x++;
				repaint();
			}
		});
		nt.start();
		try {
			img = ImageIO.read(new File("C:\\Users\\student\\Desktop\\BUU.jpeg"));
		}
		catch(IOException exp) {}
		}
	public void paintComponent(Graphics gr) {
		gr.clearRect(x-1, y-1, img.getWidth(null)+1, img.getHeight(null)+1);
		gr.drawImage(img, x, y,null);
		}
	}
	


