package Array;
class Student {
    final private String name; 
    final private byte marks; 
    final private byte rollNumber;

    public Student(String name , byte marks , byte rollNumber){
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }
    public void printDetails() {
        System.out.format(" Student Name: %s\n Student Roll Number: %d\n Student Marks: %d\n",name , rollNumber , marks );
        System.out.format("\n\n");
    }
}
public class ArrayOfObjects {
    
    public static void main(String[] args) {
        Student s1 = new Student("Aarnav", (byte) 96, (byte) 22);
        Student s2 = new Student("Anvesh", (byte) 97, (byte) 38);
        Student s3 = new Student("Adhyatm ", (byte) 98, (byte) 9);
        Student s4 = new Student("Aadarsh", (byte) 99, (byte) 1);
        
        Student[] obj = {s1, s2, s3, s4};

        for(Student i : obj) {
            i.printDetails();
        }
    }
}