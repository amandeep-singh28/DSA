package Strings;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str); // hello
        // str += "World"; In normal String

        // str.append("world"); // we can add any type of data type even boolean also, at the end of the string

        str.setCharAt(0, 'm'); //hello -> mello
        System.out.println(str); // mello

        str.append(10);
        System.out.println(str); // mello10

        str.insert(2, 'y');
        System.out.println(str); // meyllo10

        str.deleteCharAt(0);
        System.out.println(str); // eyllo10

        StringBuilder str2 = new StringBuilder("amandeep");
        System.out.println(str2);

        str2.reverse();
        System.out.println(str2);

        str2.reverse();
        System.out.println(str2);
        //amandeep
        str2.delete(0, 4);
        System.out.println(str2); // deep

    }
}
