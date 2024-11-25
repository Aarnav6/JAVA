////////////////////////////////////////////////Bubble_Sort TECHNIQUES///////////////////////////////////////////
import java.util.Scanner;
class Array_Functions {
    protected static int size;
    protected static int InputArray[];

    public static void getArray () {
            Scanner scan = new Scanner(System.in);
            System.out.print("enter the Length of array:- ");
            size = scan.nextInt();
            InputArray = new int [size];   
            System.out.println("enter array elements");
            for (int i=0 ; i<size ; i++) {
            InputArray[i] = scan.nextInt();
        }
    }
    public static void showArray () {
            for (int i=0 ; i<InputArray.length ; i++) {
            System.out.print(InputArray[i] + "  ");
        }
        System.out.print("\n");
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
        showArray();
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
        showArray();
    }
}
class Selection_Sort extends Array_Functions {

    public static void Selection_SortArray_Ascending () {
        for(int i=0 ; i<InputArray.length-1 ; i++) {
            // System.out.println("Starting loop from i= " + i); // temporary understanding lines
            int Smallest_Element_Index = i;
            for(int j=i ; j<InputArray.length ; j++) {
                // System.out.println("Starting loop from arrayIndex(j)= " + j);// temporary understanding lines
                if(InputArray[Smallest_Element_Index] > InputArray[j]) {
                    Smallest_Element_Index = j;
                    // System.out.println(InputArray[j]  + " is smalllest in iteration of " + i); // temporary understanding lines
                }
            }
            int Temp = InputArray[i];
            InputArray[i] = InputArray[Smallest_Element_Index];
            InputArray[Smallest_Element_Index] = Temp;
            // System.out.println("Swapping " + InputArray[i] + " and " + Temp); // temporary understanding lines
            // System.out.println("showing current array"); // temporary understanding lines
            // showArray(); // temporary understanding lines
            // System.out.println("\n \n \n ");
        }
        Array_Functions.showArray();
    }
    public static void Selection_SortArray_Descending () {
        for(int i=0 ; i<InputArray.length-1 ; i++) {
            int Biggest_Element_Index = i;
            for(int j=i ; j<InputArray.length ; j++) {
                if(InputArray[Biggest_Element_Index] < InputArray[i]) {
                    Biggest_Element_Index = j;
                }
            }
            int Temp = InputArray[i];
            InputArray[i] = InputArray[Biggest_Element_Index];
            InputArray[Biggest_Element_Index] = Temp;
        }
        Array_Functions.showArray();
    }
}

class Lec16 {

    Lec16() {
        Array_Functions.getArray();
        
        System.out.println("Using bubbleSort for Ascending Order:- ");
        Bubble_Sort.Bubble_SortArray_Descending();
        System.out.println("Using bubbleSort for Descending Order:- ");
        Bubble_Sort.Bubble_SortArray_Ascending();

        System.out.println("Using SelectionSort for Ascending Order:- ");
        Selection_Sort.Selection_SortArray_Ascending();
        System.out.println("Using SelectionSort for Descending Order:- ");
        Selection_Sort.Selection_SortArray_Descending();
    }
    public static void main (String args[]) {
    Lec16 ob = new Lec16();
    }
}