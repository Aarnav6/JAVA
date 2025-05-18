// Interface A with a default method
interface A {
    default void display() {
        System.out.println("Display from A");
    }
}

// Interface B with a default method
interface B {
    default void display() {
        System.out.println("Display from B");
    }
}

// Class C implements both A and B
// Must override display() to resolve conflict
public class SolutionToAmbiguity implements A, B {
    // Overriding the display() method to avoid ambiguity
    // @Override
    public void display() {
        System.out.println("display from C");
    }

    public static void main(String[] args) {
        SolutionToAmbiguity obj = new SolutionToAmbiguity();
        obj.display();  // Output: Display from C
    }
}
