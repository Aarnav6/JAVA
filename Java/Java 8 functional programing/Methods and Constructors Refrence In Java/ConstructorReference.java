public class ConstructorReference {
    public static void main(String[] args) {
        // similar to Methods Reference we can use Constructor Refrence by using new
        Provider pro = Student::new;
        // pro.provide gives object of student class lets say that object is obj
        // now so now obj.getStudent() gives the name associated with that student
        // which we wrote inside the System.out.println();
        System.out.println(pro.provide("alice").getStudent()); 
        System.out.println(pro.provide("bob").getStudent()); 
        System.out.println(pro.provide("josh").getStudent()); 
    }
    @FunctionalInterface
    private interface Provider {
        Student provide (String name);
    }
    // the class is static so that it can be acesssed in inside the main method which is static
    private static class Student {
        private String name;
        Student () {
            System.out.println("creating object of student class");
        }
        
        Student (String name) {
            this();
            this.name = name;
        }

        public String getStudent() {
            return name;
        }
        
    }
}
