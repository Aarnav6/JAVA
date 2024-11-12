import java.util.Scanner;
class Sorter {
    private static int arry[];

    public static void getArray () {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in array: ");
        int size = sc.nextInt();
        arry = new int[size];
        for (int i=0 ; i<arry.length ; i++) {
            arry[i] = sc.nextInt();
        }
    }
    public static void showArray() {
        for(int i=0 ; i<arry.length ; i++) {
            System.out.print(arry[i] + "\t");
        }
    }
    public static void bubbleSort() {
        getArray();
        int arrayMaxIndex = arry.length-1; 
        for(int i=0 ; i<arrayMaxIndex ; i++){
            for(int j=0 ; j<arrayMaxIndex-i ; j++) { // here we did -i because each iteration last element in array is sorted
                if (arry[j] > arry[j+1]) {
                    int temp = arry[j]; 
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }
        showArray();
    }
    public static void selectionSort() {
        getArray();
        int arrayMaxIndex = arry.length-1;
        for(int i=0 ; i<arrayMaxIndex ; i++) {
            int smallestIndex = i;
            for (int j=i ; j<=arrayMaxIndex ; j++) { // here we did j=i or 0+i because each iteration first element in array is sorted
                if(arry[smallestIndex] > arry[j]){
                    smallestIndex = j;
                }
            }
            int temp = arry[i];
            arry[i] = arry[smallestIndex];
            arry[smallestIndex] = temp; 
        }
        showArray();
    }

    public static void insertionSort() {
        int arrayMaxIndex = arry.length-1;
        int sortedArray[] = new int[arry.length];
        for(int i=0 ; i<arrayMaxIndex ; i++) {
            if(sortedArray[i] > arry[i]) {
                // push ahead
            }
        }
    }

    public static void main (String args []) {
        Sorter.bubbleSort();
        Sorter.selectionSort();
    }
}