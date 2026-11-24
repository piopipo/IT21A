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
class Designer extends Employee {

    Designer(String name) {
        super(name);
    }

    @Override
    void performWork() {
        System.out.println(name + " is creating user interfaces and visual designs.");
    }
}
public class PolymorphismDemo {
    
}
