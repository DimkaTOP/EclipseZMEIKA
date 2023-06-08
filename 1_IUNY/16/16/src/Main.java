public class Main {
    public static void main(String[] args) {
        String str = "Это строка с пробелами";
        String strWithoutSpaces = str.replace(" ", "");

        System.out.println("Исходная строка: " + str);
        System.out.println("Строка без пробелов: " + strWithoutSpaces);
    }
}