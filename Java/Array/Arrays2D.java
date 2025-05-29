package Array;
// // import java.util.Scanner;
// // public class Arrays1D
// // {
// // Scanner sc = new Scanner(System.in);


// // public int[] input_Arry() // function to take array
// // {
// //     System.out.println("enter the number of element "); 
// //     int n = sc.nextInt();
// //     int arry[] = new int[n];

// //     // taking array input
// //     for(int i=0 ; i<n ; i++)
// //     {
// //         String set;

// //         switch (i)
// //         {
// //             case 0  ->  set = "st"; 
// //             case 1  ->  set = "nd"; 
// //             case 2  ->  set = "rd";  
// //             default ->  set = "th"; 
// //         }

// //         System.out.println("enter the " + (i+1) + set + " element of array");
// //         arry[i] = sc.nextInt();
// //     }
// //     return arry; 
// // }

// // public void show_Arry(int[] Array ,int n) // function to show array
// // {
// //     for(int i=0 ; i<n ; i++)
// //     {
// //         String set;

// //         switch (i)
// //         {
// //             case 0  ->  set = "st"; 
// //             case 1  ->  set = "nd"; 
// //             case 2  ->  set = "rd";  
// //             default ->  set = "th"; 
// //         }

// //         System.out.println("the" + " " + (i+1) + set + " " + "element of array is" + " " + Array[i]);
// //     }
// // }

// // public static void main(String args[])
// // {
// //     Arrays1D obj = new Arrays1D();
// //     int A[] = obj.input_Arry();
// //     obj.show_Arry(A,A.length);
// // }
// // }


// // // class RefrencingArrays {

// // //     public static int arry[] = new int [5];
// // //     // public static int arry1[] = arry; //refrenced or refrencing array!!
// // //     public static int[] F1 () {
// // //         return arry;
// // //     }

// // //     public static void main(String args[])
// // //     {
// // //         RefrencingArrays.arry1[1]=5;
// // //         System.out.println(F1()[1]);
// // //     }

// // // }

// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// import java.util.Scanner;
// // :)
// // understand that each row has its own array 
// // think of it as an array of arrays which are of data type all arrays stored in array[index of arrays][index of indexofarrays] 
// // :)
// public class Arrays2D {
//     private int[][] Ary;
//     public Arrays2D() {
//         input();
//         show();
//     }
//     private void input() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number of rows: ");
//         int row = sc.nextInt();
//         System.out.print("enter the number of cols: ");
//         int col = sc.nextInt();

//         Ary = new int[row][col];

//         System.out.println("enter the elements");
//         for(int i=0 ; i<row ; i++) {
//             for(int j=0 ; j<col ; j++) {
//                 int numbers = sc.nextInt();
//                 Ary[i][j] = numbers;
//             }
//         }
//         sc.close();
//     }
//     private void show() {
//         for(int[] i : Ary) {          //Ary.length gives row length (can be used for indexed loop)
//             for(int j : i) {  //Ary.[i]length gives col Ary length at i-th index (can be used for indexed loop)
//                 System.out.print(j + "\t");
//             }
//             System.out.print("\n");    
//         }
//     }
//     public static void main(String[] args) {
//         Arrays2D run;
//     }
// }