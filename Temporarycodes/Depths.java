//for oopm static non static 


class ClassA {
    // Static method
    public static void staticMethod() {
        System.out.println("Static method in ClassA");
    }

    // Instance (non-static) method
    public void instanceMethod() {
        System.out.println("Instance method in ClassA");
    }
}

class Depths extends ClassA {
    public static void main(String[] args) {
        // Call the static method directly with the class reference
        ClassA.staticMethod();

        // Create an instance to call the non-static method
        Depths instance = new Depths();
        instance.instanceMethod();
    }
}