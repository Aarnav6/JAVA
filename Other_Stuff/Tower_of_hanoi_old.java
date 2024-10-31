// import java.util.Scanner;

// class Tower {
//     private static int T1[]= {50,40,30,20,10};
//     private static int T2[] = new int[5];
//     private static int T3[] = new int[5];
    
//     public static int[] Tower1() {
//         return T1;
//     }
//     public static int[] Tower2() {
//         return T2;
//     }
//     public static int[] Tower3() {
//         return T3;
//     }

// }

// class Tower_functions extends Tower {

//     private static final Scanner sc = new Scanner(System.in);
//     private static int Tower_Input1;
//     private static int Tower_Input2;
//     private static int Picked_Disk;
//     private static int Disk_Input;
//     public static int Temp_Tower;
//     private static int Temp_Element;


//     public static void show() {

//         for(int col=0 ; col<5 ; col++ ) {
//                 System.out.print(Tower1()[col]);
//                 System.out.print("           ");
//                 System.out.print(Tower2()[col]);
//                 System.out.print("           ");
//                 System.out.print(Tower3()[col]);
//                 System.out.println();
//         }
//     }

//     public static void select_for_pick() {
//         System.out.println("select the tower among the three");
//         Tower_Input1 = sc.nextInt();
//         if (Tower_Input1 == 1 || Tower_Input1 == 2 || Tower_Input1 == 3) {
//             //does nothing its valid input
//         }
//         else {
//             System.out.println("wrong input");
//             throw new IllegalArgumentException("Error: Something went wrong!");
//         }
//         System.out.println("enter the Disk no.");
//         Disk_Input = sc.nextInt();
//         if (Disk_Input>=0 && Disk_Input<=5) {
//             //does nothing its valid input
//         }
//         else {
//             System.out.println("wrong input");
//             throw new IllegalArgumentException("Error: Something went wrong!");
//         }
//     }

//     public static void select_for_put() {
//         System.out.println("select the tower among the three");
//         Tower_Input2 = sc.nextInt();
//         if (Tower_Input2 == 1 || Tower_Input2 == 2 || Tower_Input2 == 3) {
//             //does nothing its valid input
//         }
//         else {
//             System.out.println("wrong input");
//             throw new IllegalArgumentException("Error: Something went wrong!");
//         }
//         System.out.println("enter the Disk no.");
//         Disk_Input = sc.nextInt();
//         if (Disk_Input>=0 && Disk_Input<=5) {
//             //does nothing its valid input
//         }
//         else {
//             System.out.println("wrong input");
//             throw new IllegalArgumentException("Error: Something went wrong!");
//         }
//     }

//     public static void Picked_Disk() {
//         switch (Tower_Input1) {
//             case 1 -> {
//                 Temp_Tower = 1;
//                 switch (Disk_Input){
//                     case 1 -> {
//                         System.out.println(Tower.Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower1()[Disk_Input - 1];
//                         Temp_Element = 1;
//                     }
//                     case 2 -> {
//                         System.out.println(Tower.Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower1()[Disk_Input - 1];
//                         Temp_Element = 2;
//                     }
//                     case 3 -> {
//                         System.out.println(Tower.Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower1()[Disk_Input - 1];
//                         Temp_Element = 3;
//                     }
//                     case 4 -> {
//                         System.out.println(Tower.Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower1()[Disk_Input - 1];
//                         Temp_Element = 4;
//                     }
//                     case 5 -> {
//                         System.out.println(Tower.Tower1()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower1()[Disk_Input - 1];
//                         Temp_Element = 5;
//                     }
//                     default -> System.out.println("wrong input");
//                 }
//             }
//             case 2 -> {
//                 Temp_Tower=2;
//                 switch (Disk_Input){
//                     case 1 -> {
//                         System.out.println(Tower.Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower2()[Disk_Input - 1];
//                         Temp_Element = 1;
//                     }
//                     case 2 -> {
//                         System.out.println(Tower.Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower2()[Disk_Input - 1];
//                         Temp_Element = 2;
//                     }
//                     case 3 -> {
//                         System.out.println(Tower.Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower2()[Disk_Input - 1];
//                         Temp_Element = 3;
//                     }
//                     case 4 -> {
//                         System.out.println(Tower.Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower2()[Disk_Input - 1];
//                         Temp_Element = 4;
//                     }
//                     case 5 -> {
//                         System.out.println(Tower.Tower2()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower2()[Disk_Input - 1];
//                         Temp_Element = 5;
//                     }
//                     default -> System.out.println("wrong input");
//                 }
//             }
//             case 3 -> {
//                 Temp_Tower=3;
//                 switch (Disk_Input) {
//                     case 1 -> {
//                         System.out.println(Tower.Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower3()[Disk_Input - 1];
//                         Temp_Element = 1;
//                     }
//                     case 2 -> {
//                         System.out.println(Tower.Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower3()[Disk_Input - 1];
//                         Temp_Element = 2;
//                     }
//                     case 3 -> {
//                         System.out.println(Tower.Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower3()[Disk_Input - 1];
//                         Temp_Element = 3;
//                     }
//                     case 4 -> {
//                         System.out.println(Tower.Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower3()[Disk_Input - 1];
//                         Temp_Element = 4;
//                     }
//                     case 5 -> {
//                         System.out.println(Tower.Tower3()[Disk_Input - 1]+" "+"Disk Picked_Disked");
//                         Picked_Disk = Tower.Tower3()[Disk_Input - 1];
//                         Temp_Element = 5;
//                     }
//                     default -> System.out.println("wrong input");
//                 }
//             }
//             default -> System.out.println("cant locate your tower input sorry try again later!");
//         }

//         if(Picked_Disk == 999) {
//             throw new IllegalArgumentException("Error: Something went wrong!");
//         }
//     }

//     public static void put() {
//         switch (Tower_Input2) {
//             case 1 -> Tower.Tower1()[Disk_Input-1] = Picked_Disk;
//             case 2 -> Tower.Tower2()[Disk_Input-1] = Picked_Disk;
//             case 3 -> Tower.Tower3()[Disk_Input-1] = Picked_Disk;
//         }
//         switch (Temp_Tower) {
//             case 1 -> Tower.Tower1()[Temp_Element] = Tower1()[Disk_Input-1];
//             case 2 -> Tower.Tower1()[Temp_Element] = Tower2()[Disk_Input-1];
//             case 3 -> Tower.Tower1()[Temp_Element] = Tower3()[Disk_Input-1];
//         }
//     }
// }
// class Execution extends Tower_functions {

//     public static void execute () {

//         Tower_functions.show(); // this works
//         Tower_functions.select_for_pick(); // this works
//         Tower_functions.Picked_Disk(); // this works
//         Tower_functions.select_for_put(); // this works
//         Tower_functions.put(); // this works
//         Tower_functions.show(); // this works



//         // show(); // this also works
//         // select(); // this also works
//         // Picked_Disk(); // this also works


//         // create a class object then use classobject.show(); this also works
//         // create a class object then use classobject.select(); this also works
//         // create a class object then use classobject.Picked_Disk(); this also works
//     }
// }

// class Tower_of_hanoi extends Execution {

//     public static void main (String args [])
//     {
//         Tower_of_hanoi.execute();
//     }
// }
