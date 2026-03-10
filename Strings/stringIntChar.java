package Strings;

public class stringIntChar {
    public static void main(String[] args) {
        String str = "abc";
        str += "xyz";
        str += 10;
        str += 'r';
        System.out.println(str); //abcxyz10r

        System.out.println("abc" + 10 + 20); // abc1020 because of the precedence left -> right

        System.out.println("abc" + (10 + 20)); // abc30
    }
}
