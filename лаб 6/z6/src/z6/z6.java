package z6;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class z6 {

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
	private Image img;
	public myPanel() {
		try {
			img = ImageIO.read(new File("C:\\Users\\User\\Desktop\\uu.jpeg"));
		}
		catch(IOException exp) {}
}
	public void paintComponent(Graphics gr) {
		gr.drawImage(img, 10, 10,null);
	}
}