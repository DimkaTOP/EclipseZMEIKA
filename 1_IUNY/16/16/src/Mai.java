public class Mai {
    public static void main(String[] args) {
        String str = "Ёто строка с пробелами";
        str = str.replace(" ", "");

        System.out.println("—трока без пробелов: " + str);
    }
}