@FunctionalInterface
interface A {
    int sum(int... VarArr); // using var args here to return the sum of given arguments
}

@FunctionalInterface
interface B {
    int[] ret(int... VarArr); // using var args here to return 3rd element at index in arr of var args
}
public class LambdaSecond {
    public static void main(String[] args) {
        A a = (int... arr) -> { // using lambda expression here with curly braces / brackets (Multiple line)
                int sum = 0;
                for(int i : arr) {
                    sum += i;
                }
                return sum;               
            };
        try {
            B b = (int... arr) -> arr; // using lambda expression here (Single line)
            int temp = b.ret(1,2)[2];
            System.out.println("the value at 3rd value entered through argument in ret is: " + temp);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.format( "\n\nan runtime exception occured due to \n%s\n",e);
            System.out.println("enter at least 3 argument in ret method");
        } finally {
            int ans1 = a.sum(0,5,6);
            System.out.println("\nthe total sum of input argument in sum method is: " + ans1);
        }

    }
}
// i learned new thing that in string.format() we can use %S for upper case String and s% for string as it is
/*
This lecture introduces Lambda Expressions with return statements.

It explains how to:
Create a functional interface
Implement it using a lambda expression
Use both single-line and multi-line lambda syntax with return
Emphasis is on how return works and when braces {} and return are required. 

code 1:- 
    public class Demo {
        public static void main(String[] args) {
            A obj = (i, j) -> i + j;
            int result = obj.add(5, 3);
            System.out.println("Result: " + result); // Output: 8
        }
    }
code 2:- 
    public class Demo {
        public static void main(String[] args) {
            A obj = (i, j) -> {
                System.out.println("Adding numbers...");
                return i + j;
            };
            int result = obj.add(5, 3);
            System.out.println("Result: " + result); // Output: 8
        }
    }

*/