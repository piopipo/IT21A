class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void performWork() {
        System.out.println(name + " is performing assigned tasks.");
    }
}
class Programmer extends Employee {

    Programmer(String name) {
        super(name);
    }

    @Override
    void performWork() {
        System.out.println(name + " is developing and debugging software.");
    }
}

public class PolymorphismDemo {
    
}
