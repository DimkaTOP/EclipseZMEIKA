import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Читаем входные данные из файла
            Scanner scanner = new Scanner(new File("INPUT.TXT"));
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int[][] image1 = new int[h][w];
            int[][] image2 = new int[h][w];
            for (int i = 0; i < h; i++) {
                String line = scanner.next();
                for (int j = 0; j < w; j++) {
                    image1[i][j] = Integer.parseInt(line.charAt(j) + "");
                }
            }
            for (int i = 0; i < h; i++) {
                String line = scanner.next();
                for (int j = 0; j < w; j++) {
                    image2[i][j] = Integer.parseInt(line.charAt(j) + "");
                }
            }
            int and00 = scanner.nextInt();
            int and01 = scanner.nextInt();
            int and10 = scanner.nextInt();
            int and11 = scanner.nextInt();
            scanner.close();

            // Применяем логическую операцию к пикселям изображений
            int[][] result = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int pixel1 = image1[i][j];
                    int pixel2 = image2[i][j];
                    if (pixel1 == 0 && pixel2 == 0) {
                        result[i][j] = and00;
                    } else if (pixel1 == 0 && pixel2 == 1) {
                        result[i][j] = and01;
                    } else if (pixel1 == 1 && pixel2 == 0) {
                        result[i][j] = and10;
                    } else {
                        result[i][j] = and11;
                    }
                }
            }

            // Записываем результат в выходной файл
            PrintWriter writer = new PrintWriter(new File("OUTPUT.TXT"));
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    writer.print(result[i][j]);
                }
                writer.println();
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}