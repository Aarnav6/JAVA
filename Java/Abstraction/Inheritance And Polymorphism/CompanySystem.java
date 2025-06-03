// Interface 1
interface Payable {
    void calculatePay();
}

// Interface 2
interface Reportable {
    void generateReport();
}

// Abstract Class
abstract class Person {
    final private String name;
    final private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract Method
    public abstract void displayRole();

    // Encapsulation via Getters
    public String getName() { return name; }
    public int getAge() { return age; }
}

// Concrete class
class Employee extends Person implements Payable, Reportable {

    private static int count = 0; // static var
    private final int id; // final var
    private double salary;

    // Constructor Chaining
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        this.id = ++count;
    }

    // Method Overloading
    public void calculatePay(double bonus) {
        salary += bonus;
    }

    // Method Overriding from Interface
    @Override
    public void calculatePay() {
        System.out.println(getName() + "'s Pay: ₹" + salary);
    }

    // Overriding from Interface
    @Override
    public void generateReport() {
        System.out.println("Generating salary report for: " + getName());
    }

    // Overriding from abstract class
    @Override
    public void displayRole() {
        System.out.println(getName() + " is an Employee.");
    }

    // Static method
    public static void totalEmployees() {
        System.out.println("Total Employees: " + count);
    }

    // toString Override
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + getName() + ", Age: " + getAge();
    }

    public void performOnlyEmployeeTask() {
        System.out.println(getName() + " is doing employee-specific task.");
    }
}

// Subclass (Inheritance + Overriding)
class Manager extends Employee {
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    // Overriding displayRole method
    @Override
    public void displayRole() {
        System.out.println(getName() + " is a Manager.");
    }

    public void approveLeave() {
        System.out.println(getName() + " is approving leaves.");
    }
}

// Main Class
public class CompanySystem {
    public static void main(String[] args) {

        // Upcasting: Manager -> Employee (Dynamic Method Dispatch)
        Employee e1 = new Manager("Aarnav Sharma", 22, 85000);

        // Dynamic Method Dispatch
        e1.displayRole();        // Calls Manager's version
        e1.calculatePay();       // Calls Employee's version
        
        /* 
        // Downcasting
        this is old manual method used before java 17:- expained below
        if (e1 instanceof Manager) {
            Manager m1 = (Manager) e1;
            m1.approveLeave(); // Accessing subclass method
        }
            how new way works:-
                Pattern Matching with instanceof (Java 16+)
                    Definition: A Java feature that allows testing an object’s type and simultaneously casting it in a single expression.

                    Syntax:-
                    if (object instanceof Type variableName) {
                        // use variableName as Type here
                    }
                    How it works:-
                    Checks if object is an instance of Type.
                    If true, casts object to Type and assigns it to variableName.
                    variableName is scoped only within the if block.
                    
                    Advantages:=
                    Eliminates the need for explicit casting after instanceof.
                    Simplifies and clarifies code.
                    Prevents potential ClassCastException from manual casting.

                    Version requirement:- Java 16 (preview) and fully supported in Java 17+. 
                    
                    Benefits:-
                    Less boilerplate code — no need for explicit casting.
                    Reduces casting errors and accidental misuse of variables.
                    Code is easier to read and maintain.
                    Compiler can help with more precise type analysis.
        */
        
        if (e1 instanceof Manager m1) { //new way of doing downCasting
            m1.approveLeave(); // Accessing subclass method
        }
        // Using Interface Reference (Upcasting)
        Payable p = new Manager("Sneha Gupta", 30, 95000);
        p.calculatePay();

        // Abstract Class Reference
        Person person = new Employee("Ravi Kumar", 28, 60000);
        person.displayRole();

        // Downcast to access methods not in abstract/interface
        // using above explained new way of doinig downcast in java after java 17
        if (person instanceof Employee emp) { 
            emp.performOnlyEmployeeTask();
            emp.generateReport();
        }

        // Static Method Call
        Employee.totalEmployees();

        // Demonstrate method overloading
        Employee emp2 = new Employee("Rahul", 25, 40000);
        emp2.calculatePay(5000); // Adding bonus
        emp2.calculatePay();     // Print updated pay
    }
}
