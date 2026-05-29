package Revision_Part2;

public class stringsRev {
    // public static void main(String[] args) {
    //     String str1 = "dbc";
    //     String str2 = "bbc";
    //     System.out.println(str1.charAt(0));
    //     System.out.println(str1.indexOf('e'));
    //     System.out.println(str1.compareTo(str2)); // cbc bbc

    //     str1.concat(str2);
    //     System.out.println(str1);
    //     System.out.println(str1.concat(str2));

    //     String strsub = "Amandeep";
    //     System.out.println(strsub.substring(1));
    //     System.out.println(strsub.substring(1, 2));

    //     String x = "Hello";
    //     String y = "Hello";
    //     y = "Mello";
    //     System.out.println(x);
    //     System.out.println(y);
    // }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amandeep");
        System.out.println(sb);
        sb.append(" Singh");

        System.out.println(sb);

        sb.setCharAt(8, '_');
        System.out.println(sb);
        
        sb.insert(8, "  ");
        System.out.println(sb);
    }
}
