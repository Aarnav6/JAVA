// package  ExceptionHandling;
// import java.util.InputMismatchException;
// class MyException extends Exception {
//     public MyException(String s) {
//         super(s);
//     }
// }
// public class ExceptionHandling {
//     public static void uncheckedExceptions1() {
//         try {
//             //here you can use custom message by passing an string into constructor of exception class
//             throw new InputMismatchException("input mismatch exception occurred");
//         } catch (InputMismatchException e) {
//             System.out.println("Exception Caught: " + e);
//         }
//     }
//     public static void uncheckedExceptions2() {
//         int[] arr = {4,5,6};
//         try {
//             System.out.println(arr[5]);
//         } catch (Exception e) {
//             System.out.println("Exception Caught: " + e);
//         }
//     }
//     public static void uncheckedExceptions3() throws Exception {
//         System.out.println(5/0);
//     }
//     public static void uncheckedExceptions3(int a) { 
//         try {
//             uncheckedExceptions3();
//         }
//         catch (Exception e) 
//         {
//             System.out.println("Exception Caught: " + e);
//         }
//     }
//     public static void uncheckedExceptions4() {
//         try {
//             throw new MyException("throwing my custom exception with an custom message");
//         } catch (MyException e) {
//             System.out.println("Exception Caught: " + e);
//         }
//     }
//     public static void main (String[] args) {
//         ExceptionHandling.uncheckedExceptions1();
//         ExceptionHandling.uncheckedExceptions2();
//         ExceptionHandling.uncheckedExceptions3(5);
//         ExceptionHandling.uncheckedExceptions4();
//     }
// }