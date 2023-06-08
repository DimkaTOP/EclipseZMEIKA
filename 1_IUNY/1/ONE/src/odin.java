public class odin {
    public static void main(String[] args) {
        String str = "reverse";
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println(reversedStr);
    }
}