package Game;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {

    private static GameWindow game_window;
    private static Image fonik;
    private static Image kamaz;
    private static Image game_over;
    private static Image resert;
    private static long last_frame_time;
    private static float drop_y;
    private static float drop_x;
    private static float drop_v = 220;
    private static int score = 0;

    public static void main(String[]args) throws IOException {
        fonik = ImageIO.read(GameWindow.class.getResourceAsStream("fonik.jpg"));
        kamaz = ImageIO.read(GameWindow.class.getResourceAsStream("kamaz.png"));
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game_over.png"));

        game_window = new GameWindow();
        game_window.setSize(900,600);
        game_window.setResizable(false);
        last_frame_time = System.nanoTime();

        game_window.setTitle("SPEED GAME");
        game_window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game_window.setLocation(200,150);

        GameField game_field = new GameField();

        game_window.add(game_field);

        game_window.setVisible(true);
    }

    public static void onRepaint(Graphics g) {
        g.drawImage(fonik, 0, 0, null);

        long corrent_time = System.nanoTime();

        float delta_time = (corrent_time - last_frame_time) * 0.000000001f;

        last_frame_time = corrent_time;

        drop_y = drop_y + drop_v * delta_time;

        g.drawImage(kamaz, (int)drop_x, (int)drop_y, null);

        if (drop_y > game_window.getHeight()) {
            g.drawImage(game_over, 120, 150, null);
        }

        g.setColor(Color.WHITE);
        g.setFont(scoreFont);
        g.drawString("Score: " + score, 10, 20);
    }

    public void increaseScore() {
        score++;
    }

    private static class GameField extends JPanel {

        private Rectangle kamazRect;

        public GameField() {
            kamazRect = new Rectangle((int)drop_x, (int)drop_y, kamaz.getWidth(null), kamaz.getHeight(null));

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Point clickPoint = e.getPoint();
                    if (kamazRect.contains(clickPoint)) {
                        increaseScore();
                        drop_y = 0;
                        drop_x = (int) (Math.random() * (game_window.getWidth() - kamaz.getWidth(null)));
                        kamazRect.setLocation((int)drop_x, (int)drop_y);
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            onRepaint(g);

            kamazRect.setLocation((int)drop_x, (int)drop_y);

            repaint();
        }
    }
}

	
	
		
		
	

