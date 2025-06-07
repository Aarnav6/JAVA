import java.util.*;

public class Loops_3 {
    public static void main(String args[]) {
        try(Scanner ob = new Scanner(System.in)) {

            
            // to check if a number is prime from lecture 4 homeowork just for fun im did it
            System.out.println("enter the number to check its prime or not ");
            int k = ob.nextInt();
            boolean isPrime1 = true;
            int value = 0;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    value = i;
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) {
                System.out.println("its a prime number");
            } else {
                System.out.println("its not prime number its divisble by " + value);
            }
            
            // advanced version from my idea small game
            int divisior = -1 ; // -initialized with -1 for cases if divisor if not initialized
            while (true) {
                System.out.println("enter the number: ");
                int input = ob.nextInt();
                boolean isPrime2 = true;
                for (int i = 2; i < input; i++) {
                    if (input % i == 0) { // input got divided by an integer less than it
                        divisior = i;
                        isPrime2 = false;
                        break;
                    }
                }
                if (isPrime2) {
                    System.out.println("yay! its prime number");
                } else {
                    System.out.println("Sorry! its not prime number its divisble by: " + divisior + " when multiplied with " + input/divisior);
                    break;
                }
            }
            
            
            //                     |    *****
            //                     |   *****
            //                     |  *****
            //                     | *****
            //                     |*****
            int n=5;
            for(int i=1 ; i<=n ; i++ )
            {
                for (int j=1 ; j<=n-i ; j++)
                {
                    System.out.print(" ");
                }
                for (int j=1 ; j<=n ; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            
            System.out.println("enter the no. of row for triangle");
            int row = ob.nextInt();
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= row - i; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        continue;
                    }
                System.out.print(j + " ");
            }
                System.out.println();
            }

            System.out.println("enter the no. of row for triangle");
            int rw = ob.nextInt();
            for (int i = 1; i <= rw; i++) {
                for (int j = 1; j <= row - i; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}