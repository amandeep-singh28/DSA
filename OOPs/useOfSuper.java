package OOPs;

class ABC {
    ABC() {
        System.out.println("ABC Class");
    }
}

class XYZ extends ABC {
    XYZ() {
        super();
        System.out.println("XYZ Class");
    }
}

public class useOfSuper {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
    }
}
