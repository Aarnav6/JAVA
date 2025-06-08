import java.util.function.Function;
public class FunctionChaning {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = x -> x*2;
        Function<Integer, Integer> giveCube = x -> x*x*x;
        
        Function<Integer, Integer> func1 = doubleIt.andThen(giveCube); 
        Function<Integer, Integer> func2 = doubleIt.compose(giveCube); 
        // compose actually means reversing the andThen like as an example 
        // Function<Integer, Integer> func1 = x -> giveCube.andThen(doubleIt).apply(x); this is actually compose compared with first method 
        // the above line using giveCube.andThen(doubleIt) it runs as give cube first then double but,
        // it if were to compose it runs double it then giveCube
        System.out.println(doubleIt.apply(3)); // (prints) = 6
        System.out.println(giveCube.apply(3)); // (prints) = 27
        System.out.println(func1.apply(3)); // pass 3 double = 6  then cube of 6 = 216 , (prints) = 216
        System.out.println(func2.apply(3)); // pass 3 cube = 27 then double of 27 = 54 , (prints) = 54
    }
}
