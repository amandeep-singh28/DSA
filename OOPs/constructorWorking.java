package OOPs;

class Student {
    Student(int x) {
        System.out.println("Parent class");
    }
}

class Hostel extends Student {
    Hostel(String a) {
        super(10);
        System.out.println("Child class");
    }
}

public class constructorWorking {
    public static void main(String[] args) {
        Hostel h1 = new Hostel("Hello");
        
    }
}