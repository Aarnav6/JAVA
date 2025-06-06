import java.util.*; // wildcard import
public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("this"); // this method only works on linke list in collection you can use add only with index
        System.out.println(list);
        System.out.println("\n");
        
        list.addLast("a");
        System.out.println(list);
        System.out.println("\n");

        list.add(1,"is");
        System.out.println(list);
        System.out.println("\n");
        
        list.remove();
        System.out.println(list);
        System.out.println("\n");
        
        list.remove(0);
        System.out.println(list);
        System.out.println("\n");
        
        list.clear();
        System.out.println("list.clear() : " + list);
        System.out.println("\n");
        
        list.add("mango");
        System.out.println(list);
        System.out.println("list.contains(\"mango\") : " + list.contains("mango"));
    
        System.out.println("using iterator");

        list.add("apple");
        list.add("banana");
        list.add("guava");
        list.add("grapes");
        list.add("pomigranate");
        
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
