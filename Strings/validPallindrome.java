package Strings;

public class validPallindrome {
    class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) str += ch;
        }
        System.out.println(str);

        String strPallindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strPallindrome += str.charAt(i);
        }
        System.out.println(strPallindrome);

        if (str.compareTo(strPallindrome) == 0) return true;
        else return false;
    }
}
}
