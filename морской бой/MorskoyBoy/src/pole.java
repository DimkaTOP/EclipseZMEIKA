import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class pole extends JPanel {
	
	private Timer tmDraw;
	private Image fon,paluba,ubit,ranen,end1,end2,bomba;
	private JButton btn1,btn2;
	private game myGame;
	private int mX,mY;
	
	public class myMouse1 implements MouseListener{
		public void mouseClicked(MouseEvent e) {}
		
		
		public void mousePressed(MouseEvent e) {
			if((e.getButton()==1)&&(e.getClickCount()==1)){
				mX=e.getX();
				mY=e.getY();
				if((mX>100)&&(mY>100)&&(mX<400)&&(mY<400)) {
					if((myGame.endg==0)&&(myGame.compHod==false)) {
						int i = (mY-100)/30;
						int j = (mX-100)/30;
						if(myGame.masComp[i][j]<=4)
							myGame.vistrelPlay(i, j);
					}
				}
			}
		}
		public void mouseReleased(MouseEvent e) {}
		
		public void mouseEntered(MouseEvent e) {}
		
		public void mouseExited(MouseEvent e) {}
		
		
	}
	public class myMouse2 implements MouseMotionListener{
		
		public void mouseDragged(MouseEvent e) {}
		
		public void mouseMoved(MouseEvent e) {
		
			mX=e.getX();
			mY=e.getY();
			if((mX>=100)&&(mY>=100)&&(mX<=400)&&(mY<=400)) 
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			else
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
		}
	}
	public pole() {
		 public void paintComponents(Graphics gr) {
		        super.paintComponents(gr);

		addMouseListener(new myMouse1());
		addMouseMotionListener(new myMouse2());
		setFocusable(true);
		gr.setColor(Color.RED);
		if((mX>100)&&(mY>100)&&(mX<400)&&(mY<400)) {
			if((myGame.endg==0)&&(myGame.compHod==false)) {
				int i = (mY-100)/30;
				int j = (mX-100)/30;
				if(myGame.masComp[i][j]<=4)
					gr.fillRect(100+j*30,100+i*30,30,30);
			}
		}
		if(myGame.endg==1) {
			gr.drawImage(end1,300,200,300,100,null);
		}
		else if(myGame.endg==2) {
			gr.drawImage(end2,300,200,300,100,null);
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(myGame.masComp[i][j]!=0) {
				}
			} 
	}
}
