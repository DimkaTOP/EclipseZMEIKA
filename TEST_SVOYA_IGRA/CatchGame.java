import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CatchGame extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int ITEM_SIZE = 50;
    private static final int ITEM_SPEED = 1;
    private static final int ITEM_SPAWN_TIME = 1500;
    private static final int ITEM_MAX_SPAWN_TIME = 500;
    private static final int ITEM_LIFETIME = 2000;
    private static final int ITEM_SPAWN_AREA = 400;
    private static final Color ITEM_COLOR = Color.RED;

    private ArrayList<Item> items;
    private int score;
    private int timeLeft;
    private boolean gameOver;
    private Random rand;

    public CatchGame() {
        setPreferredSize(new java.awt.Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                handleMouseClick(e.getX(), e.getY());
            }
        });
        items = new ArrayList<Item>();
        score = 0;
        timeLeft = 60;
        gameOver = false;
        rand = new Random();
        Thread gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        while (!gameOver) {
            try {
                Thread.sleep(10);
                update();
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
        // Update items
        for (int i = items.size() - 1; i >= 0; i--) {
            Item item = items.get(i);
            item.update();
            if (item.isOutOfBounds() || item.isExpired()) {
                items.remove(i);
            }
        }
        // Spawn new item
        if (rand.nextInt(ITEM_SPAWN_TIME) == 0) {
            int x = rand.nextInt(ITEM_SPAWN_AREA) + (WIDTH - ITEM_SPAWN_AREA) / 2;
            int y = rand.nextInt(ITEM_SPAWN_AREA) + (HEIGHT - ITEM_SPAWN_AREA) / 2;
            items.add(new Item(x, y));
            // Increase item spawn speed
            ITEM_SPAWN_TIME = Math.max(ITEM_MAX_SPAWN_TIME, ITEM_SPAWN_TIME - 10);
        }
        // Update time left
        timeLeft--;
        if (timeLeft == 0) {
            gameOver = true;
        }
    }

    private void handleMouseClick(int x, int y) {
        for (int i = items.size() - 1; i >= 0; i--) {
            Item item = items.get(i);
            if (item.contains(x, y)) {
                items.remove(i);
                score++;
                // Increase time left
                timeLeft = Math.min(60, timeLeft + 2);
                break;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw items
        g.setColor(ITEM_COLOR);
        for (Item item : items) {
            item.draw(g);
        }
        // Draw score and time left
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
        g.drawString("Time left: " + timeLeft, 10, 40);
        // Draw game over message
        if (gameOver) {
            g.drawString("Game over!", WIDTH / 2 - 30, HEIGHT / 2);
            g.drawString("Final score: " + score, WIDTH / 2 - 40, HEIGHT / 2 + 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Catch Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new CatchGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private class Item {

        private int x;
        private int y;
        private int size;
        private long spawnTime;
        private long lifetime;

        public Item(int x, int y) {
            this.x = x;
            this.y = y;
            size = ITEM_SIZE;
            spawnTime = System.currentTimeMillis();
            lifetime = ITEM_LIFETIME;
        }

        public void update() {
            long currentTime = System.currentTimeMillis();
            lifetime -= currentTime - spawnTime;
            spawnTime = currentTime;
            x -= ITEM_SPEED;
            y += ITEM_SPEED;
        }

        public boolean isOutOfBounds() {
            return x < -size || x > WIDTH || y < -size || y > HEIGHT;
        }

        public boolean isExpired() {
            return lifetime <= 0;
        }

        public boolean contains(int x, int y) {
            return x >= this.x && x <= this.x + size && y >= this.y && y <= this.y + size;
        }

        public void draw(Graphics g) {
            g.fillRect(x, y, size, size);
        }
    }
}