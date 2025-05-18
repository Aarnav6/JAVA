class A {
    public void show () {
        System.out.println("A class show function");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        A object = new A()
        { // this is Anonymous Inner class which will create dlass files as $1 since it dosent has a name
            @Override
            public void show () {
            System.out.println("new show function");
            }
        };
        object.show();
    }
} 