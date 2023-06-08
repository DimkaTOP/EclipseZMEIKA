package qass;


public class Thre extends Thread {
    StringBuilder sb;

    public Thre(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 1000; ++i)
                System.out.print(i + "" + sb + "    ");
            System.out.println("\n");
            sb.setCharAt(0, (char) (sb.charAt(0) + 1));
        }
    }

    public static void main(String[] msi) {
        StringBuilder sb = new StringBuilder("z");
        for (int i = 0; i < 5; i++)
            new Thre(sb).start();
    }
}
