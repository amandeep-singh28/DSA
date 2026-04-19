package OOPs;

class ABC {
    String name = "Amandeep Singh";
    void display() {
        System.out.println("ABC class");
    }
}

class XYZ extends ABC {
    String name = "Amandeep";
    void display() {
        super.display();
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class useOfSuper {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
        obj1.display();
    }
}
