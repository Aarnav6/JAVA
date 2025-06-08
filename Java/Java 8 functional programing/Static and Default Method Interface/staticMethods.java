interface A {
    static void sayHello() { // cam have body but can only be called by interface name
        System.out.println("hello from Static Methods A ");
    }
}
class B implements A {
    static void sayHello() { // cant be overriden since its not visible to this class
        System.out.println("hello from Static Methods B");
    }
}
public class staticMethods {
    public static void main(String[] args) {
        A.sayHello();
        B.sayHello();
    }
}