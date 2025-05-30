class outer {
    public void func () {
        System.out.println("from outer class");
    }
    class inner {
        public void func () {
            System.out.println("from inner class");
        }
    }
}

public class InnerClassInJava {
    public static void main(String[] args) {
        outer A = new outer();
        A.func();
        outer.inner B = A.new inner(); // use outerClassName.innerClassName innerClassObject = new outerClassObject.new innerClassName();
        B.func();

    }
}