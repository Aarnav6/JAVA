// the code might give hiding field warning ,
// but this code is just to demonstrate how to prevent field hiding and how it works so u can safely ignore it

/*
import SubPackage.SubPackageFile;
public class Runner extends SubPackageFile{
    public int a = 1; // this field hide the inherited class field if refrence type is runner and inherited class has same name variable
    protected int b = 11; // this field can hide the inherited class field if refrence type is runner and inherited class has same name variable
    int c = 111; // this field can hide the inherited class field if refrence type is runner and inherited class has same name variable
    final private int d = 1111; 
    
    public void preventingFieldHiding () {
        // System.out.println(this.a); // if u want the runner class a
        // System.out.println(this.b); // if u want the runner class b
        System.out.println(super.a);
        System.out.println(super.b);
    }
    public static void main(String[] args) {
        Runner obj0 = new Runner();
        System.out.println(obj0.a);
        System.out.println(obj0.b);
        System.out.println(obj0.c);
        System.out.println(obj0.d);


        SamePackageFile obj1 = new SamePackageFile();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);


        Runner obj2 = new Runner();
        // System.out.println(obj2.a); // to prevent the field hiding using a method
        // System.out.println(obj2.b); // to prevent the field hiding using a method
        obj2.preventingFieldHiding();
    }
}
*/