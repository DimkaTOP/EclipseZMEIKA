public class Main {
    public static void main(String[] args) {
        String str = "abcabc123";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }

        System.out.println("Повторяющиеся символы в строке " + str + ":");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println("'" + (char) i + "' - " + count[i] + " раз(а)");
            }
        }
    }
}