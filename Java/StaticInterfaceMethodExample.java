public class StaticInterfaceMethodExample {

    interface MyInterface {
        int var = 5;
        String str = "MyInterfrace: this is a string";
        
        void regularMethod(); // An abstract method

        default void defaultMethod() { // A default method
            System.out.println("MyInterface: Default method");
        }

        static void staticMethod() { // A static method
            System.out.println("MyInterface: Static method");
        }
    }

    static class ImplementationA implements MyInterface {
        @Override
        public void regularMethod() {
            System.out.println("ImplementationA: Regular method");
        }

        @Override
        public void defaultMethod() {
            System.out.println("ImplementationA: Overridden default method");
        }
    }

    static class ImplementationB implements MyInterface {
        @Override
        public void regularMethod() {
            System.out.println("ImplementationB: Regular method");
        }
    }

    public static void main(String[] args) {
        // Calling the static method of the interface
        MyInterface.staticMethod(); // Output: MyInterface: Static method
        System.out.println("MyInterfrace: " + MyInterface.var);
        System.out.println(MyInterface.str);

        // Demonstrating dynamic method dispatch with instance methods
        MyInterface refA = new ImplementationA();
        refA.regularMethod(); // Output: ImplementationA: Regular method (Dispatched based on the object type)
        refA.defaultMethod(); // Output: ImplementationA: Overridden default method (Dispatched based on the object type)
        
        MyInterface refB = new ImplementationB();
        refB.regularMethod(); // Output: ImplementationB: Regular method (Dispatched based on the object type)
        refB.defaultMethod(); // Output: MyInterface: Default method (ImplementationB uses the default)
    }
}