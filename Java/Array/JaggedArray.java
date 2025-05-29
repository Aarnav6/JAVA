// package Array;
// public class JaggedArray {
//     public static void main(String[] args) {

//         int[][] arr = new int[3][];
//         arr[0] = new int [3];
//         arr[1] = new int [2];
//         arr[2] = new int [5];
        
//         /* // can be used in this way also but indexed base loop is better for understanding
//         for (int[] i : arr) {
//             for (int j = 0; j < i.length; j++) {
//                 arr1[j] = (int) (Math.random() * 10 );
//             }
//         }
//          */
//         for (int i=0 ; i < arr.length ; i++) {
//             for(int j=0 ; j<arr[i].length ; j++) {
//                 arr[i][j] = (int) (Math.random() * 10 );
//             }
//         }
//         for(int[] i : arr) {
//             for(int j : i) {
//                 System.out.print(j+" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }