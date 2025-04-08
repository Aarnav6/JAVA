// import java.util.Scanner;
// class cwh_lec6{
//     public static int Marks[] = new int[5];
    
//     cwh_lec6() {
//         int Input;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0 ; i<Marks.length ; i++) {
//             switch(i) {
//                 case 0 -> {
//                     System.out.print("enter the marks of OOPM : ");
//                     Input = sc.nextInt(); 
//                     if(Input > 100 || Input < 0) {
//                         throw new RuntimeException("Wrong Input Try Again");
//                     }
//                     else {
//                         Marks[i] = Input; 
//                     }
//                 }
//                 case 1 ->{
//                     System.out.print("enter the marks of DATA STRUCTURE : ");
//                     Input = sc.nextInt(); 
//                     if(Input > 100 || Input < 0) {
//                         throw new RuntimeException("Wrong Input Try Again");
//                     }
//                     else {
//                         Marks[i] = Input; 
//                     }
//                 }
//                 case 2 ->{
//                     System.out.print("enter the marks of DIGITAL SYSTEM : ");
//                     Input = sc.nextInt(); 
//                     if(Input > 100 || Input < 0) {
//                         throw new RuntimeException("Wrong Input Try Again");
//                     }
//                     else {
//                         Marks[i] = Input; 
//                     }
//                 }
//                 case 3 ->{
//                     System.out.print("enter the marks of DISCRETE STRUCTURE: ");
//                     Input = sc.nextInt(); 
//                     if(Input > 100 || Input < 0) {
//                         throw new RuntimeException("Wrong Input Try Again");
//                     }
//                     else {
//                         Marks[i] = Input; 
//                     }
//                 }
//                 case 4 ->{
//                     System.out.print("enter the marks of EEES : ");
//                     Input = sc.nextInt(); 
//                     if(Input > 100 || Input < 0) {
//                         throw new RuntimeException("Wrong Input Try Again");
//                     }
//                     else {
//                         Marks[i] = Input; 
//                     }
//                 }
//                 default -> System.out.println("error ocurred please try again later");
//             }
//         }
//     }

//     void Percentage() {
//         int sum=0;
//         for(int i=0 ; i<Marks.length ; i++) {
//             sum += Marks[i];
//         }
//         System.out.println(sum);
//         float Percentage = (sum/100f)*100;
//         double temp = Percentage / 9.5;
//         int CGPA = (int) temp;
//         System.out.println("your Percentage is: " + Percentage + "%");
//         System.out.println("your CGPA is: " + CGPA);
//     }

//     public static void main(String[] args) {
//         cwh_lec6 ob = new cwh_lec6();
//         ob.Percentage();
//     }
// }