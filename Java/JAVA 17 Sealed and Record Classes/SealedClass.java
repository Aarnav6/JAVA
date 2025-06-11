sealed class A extends Thread implements Cloneable permits B,C{
    public void letDance () {
        System.out.println("were dancing : " + this.getClass().getName());
    }
}
non-sealed class B extends A {
    @Override
    public void letDance () {
        System.out.println("were dancing : " + this.getClass().getName());
    }
    
}
final class C extends A {
    @Override
    public void letDance () {
        System.out.println("were dancing : " + this.getClass().getName());
    }
    
}
final class D extends B{
    @Override
    public void letDance () {
        System.out.println("were dancing : " + this.getClass().getName());
    }
    
}


sealed interface interA permits interB , LastA {
    default void myMeth () { 
        System.out.println("from interA");
    }
}
non-sealed interface interB extends interA {
    @Override
    default void myMeth () { 
        System.out.println("from interB");
    }
}
final class LastA implements interA {

}
final class LastB implements interB {
    
}

public class SealedClass {
    public static void main(String[] args) {
        
        A ob = new A();
        ob.letDance();
        
        ob = new B();
        ob.letDance();

        ob = new C();
        ob.letDance();
    
        ob = new D();
        ob.letDance();
        
        interA interObjA = new LastA(); 
        interObjA.myMeth();

        interB interObjB = new LastB();
        interObjB.myMeth();

        
    }
}


/*
 * final classes are not allowed to inherit so we use 
 * sealed classes are used to prevent the inheritance 
 * class extending an sealed class mus have final, non-sealed or sealed 
 * 
 * final cant be extended
 * non-sealed can be extended by anyone
 * sealed can ony be accesed by only premited classes but it has rules that
 *      permits classes must extends the sealed class
 *      sub classes must be sealed , non-sealed or final
 * 
 * you can use this on interface too
 */