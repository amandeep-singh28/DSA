package Strings;

public class basic {
    public static void main(String[] args) {
        String str = "Amandeep";
        char ch = str.charAt(1);
        System.out.println(ch);

        int idx = str.indexOf('e');
        System.out.println(idx);

        String a = "abc", b = "abc";
        System.out.println(a.compareTo(b)); // 0 value because both are equal
        
        a = "bbc"; b = "abc";
        System.out.println(a.compareTo(b)); // 1 because b > a

        a = "abc"; b = "abd";
        System.out.println(a.compareTo(b)); // -1 because c < d
        
        a = "abc"; b = "abe";
        System.out.println(a.compareTo(b)); // -2 because c is 2 step behind from e

        a = "Amandeep";
        System.out.println(a.contains("A")); // true
        System.out.println(a.contains("a")); // true
        System.out.println(a.contains("D")); // false

        System.out.println(a.startsWith("A")); // true
        System.out.println(a.endsWith("singh")); // false

        System.out.println(a.toLowerCase()); // amandeep
        System.out.println(a.toUpperCase()); // Amandeep

        b = " Singh";
        System.out.println(a.concat(b)); // Amandeep Singh

        a.concat(b); // It will not change a because Strings are immutable in Java
        System.out.println(a); // Amandeep  
    }
}
