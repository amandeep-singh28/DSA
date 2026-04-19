package OOPs;

class Parent {
    void display() {
        System.out.println("Display() of parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display() of child class");
    }
}
public class overriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Child obj2 = new Child();
        Parent obj3 = new Child(); // Runtime polymorphism -> Upcasting
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
