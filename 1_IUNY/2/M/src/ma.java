public class ma {
    public static void main(String[] args) {
        String str = "reverse";
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (end > start) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            end--;
            start++;
        }
        System.out.println(new String(charArray));
    }
}