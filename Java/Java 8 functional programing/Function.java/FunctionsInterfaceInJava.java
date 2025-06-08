import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInterfaceInJava {
    public static void main(String[] args) { 
       
        // implementation : (my own idea)
        BiFunction <String, Integer, String> getSubString = (x,n) -> x.substring(0,n);
        
        Function<String , Boolean> predicateCheckIfVip = s -> {
            Predicate <String> checkIfVip = x -> getSubString.apply(x,2).equalsIgnoreCase("AA");
            return checkIfVip.test(s);
        };
    
        Function<List<Student> , List<Student>> studentFilter = studsList -> {
            List<Student> filteredStuds = new ArrayList<>();
            for(Student s : studsList) {
                if (predicateCheckIfVip.apply(s.getName())) {
                  filteredStuds.add(s);
                }
            }
            return filteredStuds;
        };
        
        Student s1 = new Student("Aarnav", "4A", 3, 20);
        Student s2 = new Student("Anvesh", "4A", 38, 20);
        Student s3 = new Student("Adhyatma", "4A", 9, 20);
        Student s4 = new Student("Aadarsh", "4A", 1, 20);
        
        List<Student> studs = Arrays.asList(s1,s2,s3,s4); // returns an array List with elements provided in it java var args used here
        List<Student> filteredStudentList = studentFilter.apply(studs);
        System.out.println(filteredStudentList);
    }
}


class Student {
    final private String name;
    final private String section;
    final private int age;
    final private int rollNumber;
    
    public Student(String name, String section, int rollNumber, int age) {
        this.name = name;
        this.section = section;
        this.age = age;
        this.rollNumber = rollNumber;
    }
    public String getName() {
        return name;
    }
    public String getSection() {
        return section;
    }
    public int getAge() {
        return age;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return String.format("name: %s || section: %s || roll number: %d || age: %d ",name,section,rollNumber,age);
    }
}

/*
 *  1.notes : 
 *    Function <passing value , Return type> = lambda expression
 *   
 *  2.example :
 *   Function<String , Integer> getLength = x -> x.length();
 *   int len = getLength.apply("im am iron man");
 *   System.out.println(len);
 *
 */