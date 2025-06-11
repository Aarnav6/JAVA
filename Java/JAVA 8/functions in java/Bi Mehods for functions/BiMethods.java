/*
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;

public class BiMethods {
    public static void main(String[] args) {
        BiPredicate<String ,Integer> isStringEqualsNumber = (str,i) -> Integer.parseInt(str) == i;
        BiFunction<Integer, Integer, String> biFunction = (x,y) ->  "String: " + String.valueOf(x*y); 
        // we use Integer.toString(int);  this converts integer to string  and can also use .toString(num , base) can also be used to change base
        // we can use String.valurOf(int); this converts any type to String
        BiConsumer<String, Boolean> printBiConsumer = (str , bool) -> System.out.println("BiConsumer: " + str + " + " +  bool);
        System.out.println(isStringEqualsNumber.test("5", 5));
        System.out.println(biFunction.apply(4,5));
        printBiConsumer.accept(biFunction.apply(45, 2) , isStringEqualsNumber.test("50", 50));
        // note that BiSupplier does not exist since a function can only return 1 value in java
    }
}
*/