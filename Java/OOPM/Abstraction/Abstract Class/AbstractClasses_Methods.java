abstract class CarModel {
    public abstract void fly(); // maybe achived in future
    public abstract void drive ();
    public void wheels() { System.out.println("every car has wheels"); }
}
class Bmw extends CarModel {
    @Override
    public void fly() { System.out.println("im not intrested in making flying cars"); }
    
    @Override
    public void drive() { System.out.println("0 to 60 Mph in just 3.2 seconds"); }
}


public class AbstractClasses_Methods {
    public static void main(String[] args) {
        // CarModel car = new CarModel(); // not possible for abstract methods 
        // Bmw car = new Bmw(); // can also be used when Bmw specfic methods are present  
        CarModel car = new Bmw(); // upcasting  -  dynamic method dispatch this cant acess Bmw specfic methods
        car.fly();
        car.drive();
        car.wheels(); // acessed through inheritance no downcast needed
    }
}