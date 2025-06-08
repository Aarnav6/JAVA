import java.util.*;
public class SortingComparable { 

    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student (19 , "arnav"));
        list.add(new Student (50 , "adhyatma"));
        list.add(new Student (42 , "aadarsh"));
        list.add(new Student (80 , "anvesh"));
        Collections.sort(list); // this is only possible on objects due to the implements of the Comparable by the class written in the generic type of List
                                // eg.Student class in this case whose written like List<Student> that Student Class implements the Comparable interface
                                
        System.out.println(list); // dont use this unless you directly overload the toString in the class
    }
}
class Student implements Comparable<Student> {
    final private int age;
    final private String name;

    @Override
    public String toString() {
        return "age = " + this.age + " name = " + this.name;
    }

    Student(int age , String name) {
        this.age = age;
        this.name = name;
        System.out.println(this.age + " super with arg");
    }

    @Override 
    public int compareTo(Student that) { // overriding the Comparable so u can directly sort the list in java
        if (this.age == that.age ) {
            return 0;
        }
        return this.age > that.age ? 1 : -1;
    }
}