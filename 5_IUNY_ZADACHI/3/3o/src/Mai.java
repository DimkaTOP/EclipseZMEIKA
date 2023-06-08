import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Mai {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("INPUT.TXT"));

        // ��������� ������� ������
        String word = scanner.nextLine();
        int n1 = scanner.nextInt();
        HashSet<String> words1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            words1.add(scanner.next());
        }
        int n2 = scanner.nextInt();
        HashSet<String> words2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            words2.add(scanner.next());
        }
        scanner.close();

        // ����������, ��� ��������, ���� ��� ������ ������ ����������
        int result1 = minimax(word, words1, words2, true, true, 0);

        // ����������, ��� ��������, ���� ������ ����� ���������, � ������ - ������ ��������� �������
        int result2 = minimax(word, words1, words2, false, true, 0);

        // ����������, ��� ��������, ���� ��� ������ ���������
        int result3 = Math.min(words1.size(), words2.size());

        // ���������� ��������� � ���� OUTPUT.TXT
        FileWriter writer = new FileWriter("OUTPUT.TXT");
        writer.write(result1 + "\n" + result2 + "\n" + result3);
        writer.close();
    }

    // ����������� ������� ��� ����������� ����������� �������� ������� ������
    // currentState - ������� ��������� ���� (������� ����� � �����, ������� �������� ������� ������)
    // words1 - �����, ������� ����� ������ �����
    // words2 - �����, ������� ����� ������ �����
    // isMaximizingPlayer - ����, �����������, �������� �� ������� ����� ������ (true) ��� ������ (false)
    // canSurrender - ����, �����������, ����� �� ������� ����� ��������
    // depth - ������� ������� ��������
    public static int minimax(String currentState, HashSet<String> words1, HashSet<String> words2, boolean isMaximizingPlayer, boolean canSurrender, int depth) {
        // ������� ������ - ���� ���������
        if (words1.isEmpty() && words2.isEmpty()) {
            return isMaximizingPlayer ? -1 : 1; // ������ ����� �������, ���� �� �� ��������� �� ����, ����� - ��������
        }

        // ������� ������ - ����� ����� ��������
        if (canSurrender && isMaximizingPlayer) {
            return 0; // ����������� �������� ������� ������ ��� ������ ����� 0
        }

        // ������� ������ - ���������� ������������ ������� ��������
        if (depth > 5) {
            return 0; // ���������� 0, ��� ��� �� �� ����� ������������� ����������� ���� �� ������� ������� ��������
        }

        // �������� ��������� ����, �� ������� ����� ��������� ����� �����
        HashSet<String> possibleWords = new HashSet<>();
        for (int i = 0; i < currentState.length(); i++) {
            for (int j = i + 1; j <= currentState.length(); j++) {
                String subword = currentState.substring(i, j);
                if (words1.contains(subword) || words2.contains(subword)) {
                    possibleWords.add(subword);
                }
            }
        }

        // ���� ������� ����� - ������, �� �������� ���, ������� ������������� ����������� ��� ��������
        if (isMaximizingPlayer) {
            int bestScore = Integer.MIN_VALUE;
            for (String word : possibleWords) {
                HashSet<String> newWords1 = new HashSet<>(words1);
                newWords1.remove(word);
                int score = minimax(word, newWords1, words2, false, true, depth + 1);
                bestScore = Math.max(bestScore, score);
            }
            return bestScore;
        }

        // ���� ������� ����� - ������, �� �������� ���, ������� ������������ ����������� �������� ������� ������
        else {
            int bestScore = Integer.MAX_VALUE;
            for (String word : possibleWords) {
                HashSet<String> newWords2 = new HashSet<>(words2);
                newWords2.remove(word);
                int score = minimax(word, words1, newWords2, true, true, depth + 1);
                bestScore = Math.min(bestScore, score);
            }
            return bestScore;
        }
    }
}