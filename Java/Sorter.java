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
        System.out.println("Sorting Using the Bubble Sort Method");
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
        System.out.println("Sorting Using the Selection Sort Method");
        getArray();
        int arrayMaxIndex = arry.length-1;
        for(int i=0 ; i<arrayMaxIndex ; i++) {
            int smallestIndex = i;  // here we did j=i or 0+i because each iteration first element in array is sorted
            for (int j=i ; j<=arrayMaxIndex ; j++) {
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
        System.out.println("Sorting Using the Insertion Sort Method");
        getArray();
        for(int i=1 ; i<arry.length ; i++) {
            int currentElement = arry[i];
            int j = i-1;
            while(j>=0 && currentElement < arry[j]) {
                arry[j+1] = arry[j];
                j--;
            }
            arry[j+1] = currentElement;
        }
        showArray();
    }
    public static void main (String args []) {
        Sorter.bubbleSort();
        Sorter.selectionSort();
        Sorter.insertionSort();
    }
}