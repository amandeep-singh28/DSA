package OOPs;

class student {
    String name;
    int rno;
    void display() {
        System.out.println(name + " " + rno);
    }
}

class Hostel extends student {
    String hostel;
    void display_hostel() {
        System.out.println(hostel);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Hostel s = new Hostel();
        s.name = "Amandeep";
        s.rno = 21;
        s.hostel = "BH1";
        s.display();
        s.display_hostel();
    }
}