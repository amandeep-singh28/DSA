package OOPs;

class ABC {
    void display() {
        System.out.println("ABC class");
    }
}

class XYZ extends ABC {
    void display() {
        super.display();
        System.out.println("XYZ class");
    }
}

public class useOfSuper {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
        obj1.display();
    }
}
