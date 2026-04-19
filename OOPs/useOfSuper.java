package OOPs;

class ABC {
    ABC() {
        System.out.println("ABC Class");
    }
    ABC(String a) {
        System.out.println("Name:" + a);
    }
}

class XYZ extends ABC {
    XYZ() {
        super("Amandeep");
        System.out.println("XYZ Class");
    }
}

public class useOfSuper {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
    }
}
