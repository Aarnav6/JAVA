interface Parrent {
    default void sayHello() { 
        // default methods in interface can have body
        System.out.println( "say hello from parrent");
    }
}
class Child implements Parrent {
    @Override
     public void sayHello() {
        System.out.println("say hello from child");
     }
}
public class defaultMethods {
    public static void main(String[] args) {
        Parrent p = new Child();
        Child c = new Child();
        p.sayHello();  // prints overloaded method if not overloaded then runs parrent class method
        c.sayHello(); // prints overloaded method if not overloaded then runs parrent class method
    }
}