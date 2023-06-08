public class Main {
    public static void main(String[] args) {
        String str = "��� ������ � ���������";
        String strWithoutSpaces = removeSpaces(str);

        System.out.println("�������� ������: " + str);
        System.out.println("������ ��� ��������: " + strWithoutSpaces);
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