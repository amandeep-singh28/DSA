package Strings;

//Strings are immutable in Java, meaning their values cannot be changed after creation. Any modification results in a new object being created, which can lead to performance overhead when many modifications occur. That’s why mutable classes like StringBuilder are preferred for frequent string modifications.

public class performanceOfStrings {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str += i; // Everytime a new object is being created which causes poor performance
        }
        // "" "1" "12" "123" "1234" "12345" "123456" "1234567" "12345678" "123456789" "12345678910"
        System.out.println(str);
    }
}
