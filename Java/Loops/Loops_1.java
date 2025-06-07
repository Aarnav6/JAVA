/*
import java.util.Scanner;

public class Loops_1 {

    public static void main(String agrs[]) {
        int row, col, n, counter = 0;
        
        // Use try-with-resources to suppress warnings for unclosed resources
        try (
            Scanner sc  = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            Scanner sc4 = new Scanner(System.in);
            Scanner sc5 = new Scanner(System.in);
            Scanner sc6 = new Scanner(System.in)
        ) {

            //----------------------------------pattern 1 (solid polygon)
            System.out.print("enter the numeber of row for solid polygon:- ");
            row = sc.nextInt();
            System.out.print("enter the numeber of column for solid polygon:- ");
            col = sc.nextInt();
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 2 (hollow polygon)
            System.out.print("enter the numeber of row for howllow polygon :- ");
            row = sc.nextInt();
            System.out.print("enter the numeber of column for howllow polygon:- ");
            col = sc.nextInt();
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    if (i == 1 || j == 1 || i == row || j == col) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 3 (pyramid)
            System.out.print("enter the length of pyramid :- ");
            n = sc2.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 4 (inverted pyramid)
            System.out.print("enter the length of inverted pyramid :- ");
            n = sc2.nextInt();

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 5 (staircase)
            System.out.print("enter the length of staircase :- ");
            n = sc3.nextInt();

            for (int i = 1; i <= n; i++) // outer loop for rows
            {
                for (int j = 1; j <= n - i; j++) // inner loop 1 for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) // inner loop 2 for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 6 (inverted staircase)
            System.out.print("enter the length of inverted staircase :- ");
            n = sc3.nextInt();

            for (int i = n; i >= 1; i--) // outer loop for rows
            {
                for (int j = 1; j <= n - i; j++) // inner loop 1 for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) // inner loop 2 for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n");

            // same pattern 6 with my way of doing it pattern 6 (inverted staircase)
            System.out.println("same pattern as above but with my way of doing it");
            for (int i = 1; i <= n; i++) // outer loop for rows
            {
                for (int j = 1; j <= i; j++) // inner loop 1 for spaces
                {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n - i; j++) // inner loop 2 for stars
                {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 7 (numerical pyramid)
            System.out.println("enter the length of numerical pyramid");
            n = sc3.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 8 (inverted numerical pyramid)
            System.out.println("enter the length of inverted numerical pyramid");
            n = sc4.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 9 (floyds triangle)
            System.out.println("enter the length of floyds triangle");
            n = sc5.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }

            System.out.println("\n\n\n");

            //----------------------------------pattern 10 (0,1 triangle)
            System.out.println("enter the row length for 0,1 triangle");
            n = sc6.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    // remember the operator precedence of modulo is greater than +,-
                    if ((i + j) % 2 == 0) // to check if odd or even
                    {
                        System.out.print("1 "); // if even
                    } else {
                        System.out.print("0 "); // if odd
                    }
                }
                System.out.println();
            }

            // same pattern as above but in my way of doing it pattern 10 (0,1 triangle)
            System.out.println("same pattern as above but with my way of doing it");
            counter = 2;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (counter % 3 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                    counter++;
                }
                System.out.println();
            }

        } // try-with-resources block ends here, and all Scanner objects are automatically closed
    }
}
*/