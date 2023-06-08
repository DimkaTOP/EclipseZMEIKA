package labarotory8;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class podar {
	
	public Image img;
	
	public int x,y;
	
	public Boolean act;
	
	Timer timerUpdate;
	
	public podar(Image img)
    {
		 timerUpdate = new Timer(150,new ActionListener() { 
			 public void actionPerformed(ActionEvent e) {
				 vniz();
			 }
	        });
		 this.img = img;
		 act=false;
			 }
	public void start()
    {
		
		timerUpdate.setDelay(100);
		
		 timerUpdate.start();
		 
		 y = 0;
		 
		 x = (int)(Math.random()*700);
		
		 }
	public void vniz()
    {
		
		 if (act==true) {
			 
			 y+=9;
			 
		 }
		 
		 if ((y+img.getHeight(null))>=470) {
			 
			 timerUpdate.stop();	 
		 }
    }
	
	public void draw(Graphics gr)
    {
        if (act==true)
        {
           gr.drawImage(img,x,y,null);

}
    }
}
