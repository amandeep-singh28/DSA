package Strings;
import java.util.Scanner;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int ele = ch + 32;
                str.setCharAt(i, (char)ele);
                // str = str.substring(0, i) + char(ele) + str.substring(i + 1);
            } else if (ch >= 'a' && ch <= 'z'){
                int ele = ch - 32;
                str.setCharAt(i, (char)ele);
                // str = str.substring(0, i) + char(ele) + str.substring(i + 1);
            }
        }
        System.out.println(str);
        sc.close();
    }
}
