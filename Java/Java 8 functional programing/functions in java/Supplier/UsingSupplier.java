import java.util.function.Supplier;
public class UsingSupplier {
    public static void main(String[] args) {
        Supplier<Integer> supplyProduct = () -> 120*2;
        Supplier<Integer> supplyWithPrint = () -> {
            System.out.println("supplying: " + 8*2);
            return 8*2;
        };

        System.out.println("value Supplied: " + supplyProduct.get());
        System.out.println("value Supplied: " + supplyWithPrint.get());
    }
}
