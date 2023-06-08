package kosinka;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.w3c.dom.events.MouseEvent;

public class pole extends JPanel {

	private Timer tmDraw;

	private JButton btn1,btn2;

	private Image fon;

	private game newGame;

	public class myMouse1 implements MouseListener{

		public void mouseClicked(MouseEvent e){}

		public void mousePressed(MouseEvent e){

			if(newGame.endGame==false){

				int mX = e.getX();
				int mY = e.getY();

				if((e.getButton()==1)&&(e.getClickCount()==1)){

					newGame.mousePressed(mX,mY);

				}

				else if ((e.getButton()==1)&&(e.getClickCount()==2)){

					newGame.mouseDoublePressed(mX,mY);
				
				}

			}

		}

		public pole(){

			addMouseListener(new myMouse1());
			addMouseMotionListener(new myMouse2());

			newGame = new game();

			try{

				fon = ImageIO.read(new File("Z://ГРУППЫ//ПРОГРАММИСТЫ//Разработка програмных модулей//Пасьянс - косынка//Картинки//fon.png"));

			}
			catch(Exception ex){}

			setLayout(null);

			btn1 = new JButton();
			btn1.setText("New game");
			btn1.setForeground(Color.BLUE);
			btn1.setBounds(850,50,150,50);
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0){
					newGame.start();
				}
			});
			add(btn1);

			btn2 = new JButton();
			btn2.setText("Exit");
			btn2.setForeground(Color.RED);
			btn2.setFont(new Font("serif", 0,20));
			btn2.setBounds(820,150,150,50);
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0){
					System.exit(0);
				}
			});
			add(btn2);
			tmDraw = new Timer(20, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0){
					repant();
				}
			});

			tmDraw.start();

		}

	}
	
}
