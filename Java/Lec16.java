////////////////////////////////////////////////Bubble_Sort TECHNIQUES///////////////////////////////////////////
import java.util.Scanner;
// import java.util.function.IntPredicate;
class Array_Functions {
    protected static int size;
    protected static int InputArray[];

    public static void getArray () {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the Length of array");
            size = scan.nextInt();
            System.out.println("enter array elements");
            InputArray = new int [size];   
            for (int i=0 ; i<size ; i++) {
            InputArray[i] = scan.nextInt();
        }
    }
    public static void showArray () {
            for (int i=0 ; i<InputArray.length ; i++) {
            System.out.print(InputArray[i] + "  ");
        }
    }
}

class Bubble_Sort extends Array_Functions {

    public static void Bubble_SortArray_Ascending() {
            for (int i=0 ; i<InputArray.length-1 ; i++) {
            for(int j=0 ; j<InputArray.length-1-i ; j++) {
                if (InputArray[j] > InputArray[j+1]) {
                    int temp = InputArray [j];
                    InputArray [j] = InputArray[j+1];
                    InputArray [j+1] = temp;
                }
            }
        }
    }
    public static void Bubble_SortArray_Descending() {
            for (int i=0 ; i<InputArray.length-1 ; i++) {
            for(int j=0 ; j<InputArray.length-1-i ; j++) {
                if (InputArray[j] < InputArray[j+1]) {
                    int temp = InputArray [j];
                    InputArray [j] = InputArray[j+1];
                    InputArray [j+1] = temp;
                }
            }
        }
    }
}

class Lec16 extends Bubble_Sort {

    public static void main (String args[]) {
        
        Array_Functions.getArray();

        System.out.print("\nPrinting Array in Ascending: ");
        Bubble_Sort.Bubble_SortArray_Ascending();
        Array_Functions.showArray();
        
        System.out.print("\nPrinting Array in Descending: ");
        Bubble_Sort.Bubble_SortArray_Descending();
        Array_Functions.showArray();
    }
}