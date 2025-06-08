@SuppressWarnings("unused")
import java.util.Random;
import java.util.function.*;
public class Using_Them {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer, Integer> function = x -> x*x*x;
        Consumer<Integer> consumer = x -> System.out.println("consuming: " + x);
        Supplier<Integer> supplier = () -> {
            Random rand = new Random();
            return rand.nextInt(0,100);
        };
        int val = supplier.get();

        if(predicate.test(function.apply(val))) {
            consumer.accept(val);
        } else {
            System.out.println("val was not even !");
        }

    }
}
