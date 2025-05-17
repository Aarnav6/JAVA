class Shape {
    public void draw() {
        System.out.println("im drew a shape");
    }
    public void name() {
        System.out.print("this is an shape");
    }
}
class Circle extends Shape{
    @Override
    public void draw () {
        System.out.println("im drew a circle");
    }
    @Override
    public void name() {
        System.out.println("this is an circle");
    }
    public void circumference() {
        System.out.println("2 pie R");
    }
}
class Reactangle extends Shape {
    @Override
    public void draw () {
        System.out.println("im drew a reactangle");
    }
    @Override
    public void name() {
        System.out.println("this is an reaactangle");
    }
    public void perimeter() {
        System.out.println("2 times l * b");
    }
}

public class DynamicMethodDispatch { // DYNAMIC METHOD ONLY ALLOWS THE METHOD OF WHICH ARE OVERIDDEN
    public static void main(String[] args) {
        Shape s;
        
        s = new Shape(); //intialising the refrence varriable  
        s.draw();
        s.name();
        System.out.println("\n");
        
        s = new Circle(); //this is upcasting
        s.draw();
        s.name();
        // downcasting method 1
        Circle downcastedObject = (Circle) s ; //this is downcasting and throws "java.lang.ClassCastException" if s is not holding the refrence of class of chilfSpecialFunciton
        downcastedObject.circumference(); 
        System.out.println("\n");
        
        s = new Reactangle(); //this is upcasting
        s.draw();
        s.name();
        // downcast method 2
        ((Reactangle)s).perimeter();  // downcasting direct downcast method
        System.out.println("\n");

        /* 
        parrentClass obj = childClass(); // this is Upcasting since the refrence (addreess going up)
        ChildClass childObj = (ChildClass) parentObj; // this is Downcasting
        // Now childObj holds a reference to the ChildClass object
        // and you can access childObj.childSpecialFunction();
        // this is downcasting since the refrence (addreess going down) can be risky if cast in not handled correctly child class object must have the refrence to special function class
        */
    }
}