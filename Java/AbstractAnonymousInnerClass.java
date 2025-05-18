/*
abstract class A {
    public void show () {
        System.out.println("A class show function");
    }
    abstract public void Meth1();
}
public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() { // this is not an object of class A its an object of Anonymous Inner Class
            @Override
            public void Meth1() {
                super.show(); // to call super class show funciton can be done is possible
                System.out.println("meth1 overriden funciton of Anonymous Inner Class");
            }
        };
        obj.show();
        
    }
}
*/