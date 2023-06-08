public class Main {
    public static void main(String[] args) {
        String str = "Это строка с пробелами";
        String strWithoutSpaces = removeSpaces(str);

        System.out.println("Исходная строка: " + str);
        System.out.println("Строка без пробелов: " + strWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}