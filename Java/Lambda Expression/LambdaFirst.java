@FunctionalInterface
interface A {
    void show();   
}
@FunctionalInterface
interface B {
    void show(int var);   
}
@FunctionalInterface
interface C {
    void show(int var1 , float var2);   
}
public class LambdaFirst{
    public static void main(String[] args) {

    /*  instead of anonymous inner class we can use lambda expression
        A a = new A() {
            @Override
            public void show (int var) {
                System.out.println("IN A SHOW " + var);
            }
        };
    */
        // Lambda Expression for functional interface A
        A a = () -> System.out.println("IN A SHOW A");
        
        // Lambda Expression for functional interface B
        B b = (i) -> System.out.println("IN A SHOW B : " + i);
        
        // Lambda Expression for functional interface C
        C c = (i,j) -> {
            System.out.println("IN A SHOW B");
            System.out.println("INTEGER VAR1 : " + i);
            System.out.println("FLOAT VAR2 : " + j);
        };

        a.show();
        b.show(5);
        c.show(6,8.9f);
    }
}
/*
    ----🔹 What Is a Lambda Function in Java?

        A lambda function is a concise way to implement a functional interface — an interface with exactly one abstract method.
        Lambdas provide a shorter, cleaner syntax compared to anonymous inner classes.
        They do implement interfaces, but behind the scenes, the compiler generates an anonymous class for you.


    ----🔹 How Are Lambdas Related to Anonymous Inner Classes?
        Before Java 8, you used anonymous inner classes to provide implementations of interfaces on the fly.
        Since Java 8, lambdas replaced most use cases of anonymous inner classes for functional interfaces because they're simpler and less verbose.
        Conceptually, lambdas are syntactic sugar for instances of functional interfaces, just like anonymous inner classes.


    ----🔹 Do lambda expressions require implementing ?
        no lambda expressions dont since lambda expressions work on the basis of the instance with refrence of interface 
        so, lambda expressions dont need the interface to be implemented within that class
    

    ----🔹 What You Need to Know About Lambda Functions
        1. Must target a Functional Interface
        Lambdas can only be assigned to a functional interface reference (interface with a single abstract method).
        @FunctionalInterface
        interface A {
            void show(int var);
        }
        A obj = (x) -> System.out.println("Value: " + x);
        obj.show(5);

        2. You don't write implements when using lambdas
        You don't need to make your class implement the interface to create lambda instances. 
        Lambdas are instances of the interface, but not the class itself.

        3. Lambda body is the method implementation
        The lambda expression defines the only abstract method of the functional interface.
        The syntax (parameters) -> { method body } replaces the full anonymous class syntax.

        4. Lambdas do not create new classes explicitly
        The compiler generates a hidden class for the lambda.
        It's more memory-efficient and faster than anonymous classes.

    ----🔹 Summary: How Lambdas Fit in Java Interface and Anonymous Class World
        Concept	Explanation	Usage
        Anonymous Inner Class	Inline class implementation for any interface	Verbose, pre-Java 8
        Lambda Expression	Concise implementation for functional interfaces	Cleaner, Java 8+
        Interface Implementation	class MyClass implements Interface {}	Your class directly implements interface

        TL;DR — What You Need to Know for Lambdas
        Lambdas implement functional interfaces but do not require your class to implements the interface.

        You use lambdas to instantiate interfaces on the fly, without boilerplate.
        Lambdas replace anonymous inner classes for cleaner code.
        If you declare a class with implements, you must implement the interface methods in that class, lambdas don’t change that rule.
        Lambdas are primarily a language feature for functional programming style in Java.

    ----🔹 What is Less Verbose?
    Verbosity refers to how much code you have to write to express an idea. When something is "less verbose",
    it means you can write less code to do the same job.
    So:
    The anonymous inner class example above is more verbose.
    The lambda version is less verbose.
    Less verbosity = less boilerplate, cleaner, more maintainable code.
    */