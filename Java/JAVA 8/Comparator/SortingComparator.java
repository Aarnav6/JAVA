import java.util.*;
public class SortingComparator {
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
        
        Comparator<Integer> c = (a,b)-> a%10 - b%10; // sorting on basis of last integer of number
        Collections.sort(list , c); // can also use list.sort(comparator) means from List interface 
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
    * Notes from Telusko Description : -
    #1
    * From the Java 1.7 version, it is not compulsory to mention the generic type on the right-hand side if you have already mentioned it on the left-hand side.
    *  
    * A collection class has lots of methods. The collection class belongs to the util package.
    * We can sort a list or an ArrayList by using the method sort of collection class
    *  Collections.sort();
    * If we want to apply our own logic in sorting, then we have to use a comparator with sorting in collections.
    * Comparator is also an interface.
    * We have a method called compare() in the comparator interface.
    * We can use an interface by implementing a class or through an anonymous class.
    * Compare method works on an algorithm where it compares two values and then swaps them.
    *  Comparator Integer com= new Comparator Integer()
    *  {
    *   public int compare(Integer i, Integer j)
    *   {
    *    statements;
    *   }
    *  };
    
    * So, a comparator is an interface through which you can specify your own concept of sorting.
    * 
    * #2
    * Integer class implements a Comparable interface. So by default, sort works for Integer.
    * If you want to do natural sorting on any other non-defined class, you can implement something called the Comparable.
    * Comparable is present in the lang package.
    * Comparable has a method known as compareTo(). 
    * You have to define the method comapreTo() in a class, that is implementing Comparable.
    *  class Student implements Comparable Student
    *  {
    *   public int compareTo( Student that){
    *    statements;
    *   }
    *  }
    * Here, that is a variable.
    * We can also override the logic by using Comparator even if we have implements the Comparable interface.
    * Lambda expression can also be used with Comparator as it is a functional interface.
    * 
    *  #3
    * Difference between Comparable & Comparator:
    * Comparable provides a single sorting sequence while the Comparator provides multiple sorting sequences.
    * In Comparable, actual gets modified while in Comparator, the original class does not get affected.
    * Comparable gives the compareTo() method for sorting while Comparator gives the compare() method to sort elements.
*/
