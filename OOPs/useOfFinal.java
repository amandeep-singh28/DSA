package OOPs;

class ABC {
    final void display() {
        System.out.println("ABC Class");
    }
}

class XYZ extends ABC {
    // void display() {
    //     System.out.println("XYZ Class");
    // }
}
public class useOfFinal {
    public static void main(String[] args) {
        XYZ obj1 = new XYZ();
        obj1.display();
    }
}
