package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameWindow extends JFrame {
	
	private static GameWindow game_window;
	
	private static Image fonik;
	
	private static Image drop;
	
	private static Image game_over;
	
	private static Image resert;
	
	private static long last_frame_time;
	
	private static float drop_y = -150;
	
	private static float drop_x;
	
	private static float drop_v = 220;
	
	private static int score = 0;
	
	private static float resert_x = 40;
	
	private static float resert_y = 60;
	
	public static void main(String[]args) throws IOException {
		
		fonik = ImageIO.read(GameWindow.class.getResourceAsStream("fonik.jpg"));
		
		drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
		
		game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));
		
		resert = ImageIO.read(GameWindow.class.getResourceAsStream("resert.png"));
		
		game_window = new GameWindow();
		
		game_window.setSize(900,600);
		
		game_window.setResizable(false);
		
		last_frame_time = System.nanoTime();
		
		game_window.setTitle("SPEED GAME");
		
		game_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		game_window.setLocation(200,150);
		
		GameField game_field = new GameField();
		
		game_field.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				float drop_x_right = drop_x + drop.getWidth(null);
				float drop_t_bottom = drop_y + drop.getHeight(null);
				boolean is_drop = x>= drop_x && x<=drop_x_right && y>= drop_y && y<= drop_t_bottom;
				if(is_drop) {
					drop_y = -100;
					drop_x = (int) (Math.random() * (game_field.getWidth() - drop.getHeight(null)));
					game_window.setTitle("Рекорд: " + score);
					score++;
					drop_v = drop_v + 20;					
				}
				
				float resert_x_left = resert_x + resert.getWidth(null);
				float resert_y_bottom = resert_y + resert.getHeight(null);
				boolean if_resert = x>= resert_x && x <=resert_x_left&& y >=resert_y&& y<=resert_y_bottom;
				if(if_resert) {
					drop_y = -300;
					drop_x = (int)(Math.random() * (game_field.getWidth() - drop.getHeight(null)));
					score = 0; drop_v = 200;
					game_window.setTitle("Рекорд: " + score);
				}
		}
	});
		
		game_window.add(game_field);
		
		game_window.setVisible(true);
		
	}
	
	public static void onRepaint(Graphics g) {
		
		g.drawImage(fonik, 0, 0, null);
		
		long corrent_time = System.nanoTime();
		
		float delta_time = (corrent_time - last_frame_time) * 0.000000001f;
			
		last_frame_time = corrent_time;
		
		drop_y = drop_y+drop_v * delta_time;
		
		g.drawImage(drop,(int)drop_x,(int)drop_y,null);
		
		if(drop_y>game_window.getHeight()) {
			g.drawImage(game_over,120,150,null);
			g.drawImage(resert,(int) resert_x,(int)resert_y,null);
		}	
	}
	
	private static class GameField extends JPanel{
		
	protected void paintComponent(Graphics g) {
			
			super.paintComponents(g);
			
			onRepaint(g);
			
			repaint();
			
		}
	}	
		}
	
	
		
		
	

