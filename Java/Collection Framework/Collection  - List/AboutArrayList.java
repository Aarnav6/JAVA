import java.util.*; // wild card import
public class AboutArrayList {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(98);
        list.add(64);
        System.out.println(list);
        
        System.out.println("set element at idx 0 to 898");
        list.set(0, 898);
        System.out.println(list);

        System.out.println("remove element at idx 2");
        list.remove(2);
        System.out.println(list);

        System.out.println("size = " + list.size());

        System.out.println("before sorting");
        System.out.println(list);

        Collections.sort(list);
        
        System.out.println("after sorting");
        System.out.println(list);
    }

}
