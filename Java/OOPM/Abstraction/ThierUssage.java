// @FunctionalInterface
// interface  IsAnFunctionalInterface { // // here we can use lambda expression since here we have do have an functional interface
//     void letsDance();
// }
// interface NotAnFunctionalInterface { // here we cant use lambda expression since its not functional interface so here we use anonymous innner class
//     void letsGo();
//     void letsRun();
// }
// public class ThierUssage {

//     public static void main(String[] args) {
//         //lambda expression => 
        
//         //int a = 5; // this is an local
//         IsAnFunctionalInterface A = () -> {
//             System.out.println("were dancing");
//             // a = 50; // not possible to use local varriable since its not final 
//                     // since interface uses public static final fields
//         };


        
//         //Anonymous Inner Class =>
//         NotAnFunctionalInterface B = new NotAnFunctionalInterface() {
//             @Override
//             public void letsGo() {
//                 //  int a = 4512; // since this is an instance varriable u can use it
//                 //  a = 60; // can also be changed later
//                 System.out.println("were going");
//             }
//             @Override
//             public void letsRun() {
//                 System.out.println("were runing");
//             }
//         };

//         A.letsDance();
//         B.letsGo();
//         B.letsRun();
//     }
// }

// /* notes : -
//  * the problem actually is anonymous inner class can have an instance varriable 
//  * and in anonymous innner class methods u can use this.var since that var is instance 
//  * but same cant be achived inside the lambda expression since that varriable will not
//  * is local and loca varriable cant be acessed since this.var there no point in it
//  * 
//  * 
//  * the other concept being u cant use any outside variable in lambda expression defination 
//  * and since when u write inside it gives error either it has to be local to be acessible
//  * 
//  */