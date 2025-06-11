import java.util.Arrays;
import java.util.function.Function;
import java.util.function.BiConsumer;
// import java.util.function.Consumer;
import java.util.List;

public class MethodsReference {
    public static int printA(int a) {
        return a;
    }
    public static void printB(int a , int b) {
        System.out.println(a + " " + b);
    }
    public static void myPrinter (String s) {
        System.out.println("helllllllloooooo :" + s);
    }
    public void myInstancePrinter(String s) {
        System.out.println("using instance printer to print names : " + s);
    }
    public static void main(String[] args) {
        Function<Integer, Integer> function = MethodsReference::printA;

        // you can conver this lambda expression by method reference in java
        //BiConsumer<Integer, Integer> biConsumer = (x,y) -> MethodsReference.printB(x,y);
        BiConsumer<Integer, Integer> biConsumer = MethodsReference::printB; // like this....
        
        
        System.out.println(function.apply(5));
        biConsumer.accept(45,23);

        List<String> names = Arrays.asList("amrit" , "naman" , "sneha");
        // Consumer<String> cons = MethodsReference :: myPrinter;
        // instead of making an consumer directly passing = ..part inside the forEach()
        names.forEach(MethodsReference :: myPrinter);
        
        //now if the method is not static use object
        MethodsReference obj = new MethodsReference(); // create object of class
        names.forEach(obj :: myInstancePrinter);
        
    }   
}
/*
 *  Important notes : 
 *  can be used only instead of lambda expression to refer to an method
 *  usefull when u want to pass the methods as an argument use this motsly used in (steam api)
 *  dont use it forcefully in unecessary conditions
 *  it takes argument automaticaly no parenthesis required 
 *  use className::methodName for static method
 *  use objectName::methodName for instance method
 */