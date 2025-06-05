import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");               // add(E e)
        fruits.add("Banana");
        fruits.add("Cherry");

        // Check size
        System.out.println("Size: " + fruits.size());  // size()

        // Check if contains element
        System.out.println("Contains Banana? " + fruits.contains("Banana")); // contains(Object o)

        // Remove element
        fruits.remove("Apple");            // remove(Object o)

        // Check if empty
        System.out.println("Is empty? " + fruits.isEmpty());  // isEmpty()

        // Iterate over collection
        for (String fruit : fruits) {     // iterator() used implicitly in enhanced for-loop
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();                   // clear()
    }
}
