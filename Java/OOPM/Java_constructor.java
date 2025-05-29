// class Base{
//     public int x;
//     Base() {
//         System.out.println("im a Base class constructor with 0 parameter");
//     }
//     Base(int a) {
//         System.out.println("im a Base class constructor with 1 parameter a: " + a);
//     }
//     Base(int a ,int b) {
//         System.out.println("im a Base class constructor with 2 parameter a: " + a + " b: "+b);
//     }
//     public int getX() {
//         return x;
//     }
//     public void setX(int x) {
//         this.x = x;
//     }
// }
// class Derived extends Base {
//     public int y;
//     Derived() {
//         super();
//         System.out.println("im a Derived class constructor with 0 parameter");
//     }
//     Derived(int a) {
//         super(a);
//         System.out.println("im a Derived class constructor with 1 parameter a: " + a);
//     }
//     Derived(int a ,int b) {
//         super(a,b);
//         System.out.println("im a Derived class constructor with 2 parameter a: " + a + " b: "+b);
//     }
//     public int getY() {
//         return y;
//     }
//     public void setY(int y){
//         this.y = y;
//     }
// }
// class Derived1 extends Derived {
//     public int z;
//     Derived1() {
//         super();
//         System.out.println("im a Derived1 class constructor with 0 parameter");
//     }
//     Derived1(int a) {
//         super(a);
//         System.out.println("im a Derived1 class constructor with 1 parameter a: " + a);
//     }
//     Derived1(int a ,int b) {
//         super(a,b);
//         System.out.println("im a Derived1 class constructor with 2 parameter a: " + a + " b: "+b);
//     }
//     public int getZ() {
//         return z;
//     }
//     public void setY(int z){
//         this.z = z;
//     }
// }
// public class Java_constructor {
//     public static void main(String[] args) {
//         Derived1 D = new Derived1(6,2);
//     }
// }