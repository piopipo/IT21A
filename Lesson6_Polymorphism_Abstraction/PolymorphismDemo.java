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
    public static void main(String[] args) {

        Employee employee1 = new Programmer("Alex");
        Employee employee2 = new Designer("Jamie");

        System.out.println("EMPLOYEE WORK MANAGEMENT SYSTEM");
        System.out.println("================================");
        System.out.println("Employee Task Assignments");
        System.out.println("--------------------------------");

        employee1.performWork();
        employee2.performWork();

        System.out.println("--------------------------------");
        System.out.println("Employee task assignments completed.");
    }
}
