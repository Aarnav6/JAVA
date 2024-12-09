// code i wrote has vulnerabilities towards bugs,errors and problems for open world devs ,like using :- || static and global fields || confusing logic hard to understand ||
// but this is my first time implementing recursion after learning it
class ownRecursion {
    private static int result;
    public static void sum (int index ,int []args) {
        result += args[index];
    }
    public static void sumHelper(int n,int ...ary){
        if(n == ary.length) {
            System.out.println(result);
            return;
        }
        sum(n,ary);
        sumHelper(n+1, ary);
    }
    public static void main(String[] args) {
        int elemnts[] = {1,2,3,5,8,10};
        sumHelper(0, elemnts);
    }
}

/*
//code made by chatgpt :- 
public class SumExample { 
    
    // Recursive function using varargs
    public static int sum(int... numbers) {
        return sumHelper(numbers, numbers.length - 1);
    }
    
    // Helper function that performs recursion
    private static int sumHelper(int[] numbers, int index) {
        if (index < 0) {
            return 0;  // Base case: when no elements are left to sum
        }
        return numbers[index] + sumHelper(numbers, index - 1); // Recursive case
    }

    public static void main(String[] args) {
        // Testing the sum function
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));  // Output: 15
    }
} 

//code made by me :- 

class ownRecursion {
    private static int result;
    public static void sum (int index ,int []args) {
        result += args[index];
    }
    public static void sumHelper(int n,int ...ary){
        if(n == ary.length) {
            System.out.println(result);
            return;
        }
        sum(n,ary);
        sumHelper(n+1, ary);
    }
    public static void main(String[] args) {
        int elemnts[] = {1,2,3,5,8,10};
        sumHelper(0, elemnts);
    }
}
*/