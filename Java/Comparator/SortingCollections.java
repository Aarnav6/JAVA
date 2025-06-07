import java.util.*;
public class SortingCollections {
    public static void main(String[] args) {
        // lets write a code to demonstrate sorting on basis of last value on integer using Comparator
        List<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(50);
        list.add(69);
        list.add(22);
        list.add(45);
        list.add(45);

        
        System.out.println("this is from Array list:         " + list);

        list = new LinkedList<>(list);
        System.out.println("this is from Linked list:        " + list);
        
        list = new Vector<>(list); // its an legacy / obslete in java
        System.out.println("this is from vector:             " + list);
        
        Comparator<Integer> c = (a,b)-> a%10 - b%10; // sorting on basis of last integer of number
        list.sort(c);
        System.out.println("this is after sorting the list : " + list);

    }
}
/*        
    * Important notes : -
    *                                About comparator :-
    *    
    *    to sort an collection in your own way you can use an overloaded sort method which needs to be pass with (Collection , Comparator)
    *    now comparator is an functional interface in java which takes takes 2 wrapper class objects and it runs an sorting algoritims when 
    *    passed in .sort (collection , comparator)
    *    to implement the comparator u can use a class or anonymous inner class or an lambda expression
    *    
*/
