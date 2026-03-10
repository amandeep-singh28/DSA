package Strings;

public class printAllSubstring {
    public static void main(String[] args) {
        String s = "abcd";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                System.out.print(s.substring(i, j + 1) + " ");
            }
        }
    }
}
