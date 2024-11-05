// learning sorting
import java.util.Scanner;   
class Lec16 {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the Length of array");
        int size = scan.nextInt();
        int InputArray[] = new int[size];
        System.out.println("enter array elements");
        for (int i=0 ; i<InputArray.length ; i++) {
            InputArray[i] = scan.nextInt();
        }
        for (int i=0 ; i<InputArray.length - 1 ; i++) {
            for(int j=0 ; j<InputArray.length ; j++) {
                if (InputArray[j] < InputArray[j+1]) {
                    InputArray [j] = InputArray[j+1];
                    InputArray [j+1] = InputArray[j];
                }
            }
        }
        for (int i=0 ; i<InputArray.length ; i++) {
            System.out.println(InputArray[i]);
        }
    }
}