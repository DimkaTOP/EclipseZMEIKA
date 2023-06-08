package mouse_package;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class palitra_mouse {
	public static void main (String [] args) {
		okno window = new okno();
	}
}
	class okno extends JFrame{
		public okno() {
			setBounds(0,0,800,600);
			setTitle("пеинт");
			panel pan = new panel();
			Container con = getContentPane();
			con.add(pan);
			setVisible(true);
			setFocusable(true);
			setBackground(Color.WHITE);
		}
	}
	class panel extends JPanel {
		Color[] masColor;
		int tCol = 0;
		int mX, mY;
		Boolean flag = false;
		public panel() {
			addMouseListener(new Mouse1());
			addMouseMotionListener(new Mouse2());
		}
		public void paintComponent(Graphics gr) {
			masColor = new Color[9];
			masColor[0] = Color.BLACK;
			masColor[1] = Color.GREEN;
			masColor[2] = Color.BLUE;
			masColor[3] = Color.RED;
			masColor[4] = Color.YELLOW;
			masColor[5] = Color.ORANGE;
			masColor[6] = Color.PINK;
			masColor[7] = Color.WHITE;
			for (int i=0; i<8; i++) {
				gr.setColor(masColor[i]);
				gr.fillRect(i*100, 0, 100, 50);
				if (flag==true) {
					gr.setColor(masColor[tCol]);
					gr.fillRect(mX, mY, 10, 10);
				}
				
			}
			
		}	
	
public class Mouse1 implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		
	}


	public void mousePressed(MouseEvent e) {
		int tX = e.getX();
		int tY = e.getY();
		int col = e.getClickCount();
		int btn = e.getButton();
		if ((tX>0)&&(tY>0)&&(tX<800)&&(tY<50)) {
			if (col==1) {
				if (btn == 1) {
					tCol = tX/100;
				}
			}
		}
	}

	
	public void mouseReleased(MouseEvent e) {
	
	}

	public void mouseEntered(MouseEvent e) {	
	}

	public void mouseExited(MouseEvent e) {
	}
}
public class Mouse2 implements MouseMotionListener {
	public void mouseMoved (MouseEvent e) {
		System.out.println(e.getX()+"     "+e.getY());
	}

	public void mouseDragged(MouseEvent e) {
		int tX = e.getX();
		int tY = e.getY();
		if (tY>50) {
			mX = tX;
			mY = tY;
			flag = true;
			repaint();
		}
	}
}
}