import java.util.InputMismatchException;
import java.util.Scanner;

class Lec8 {
    public static Scanner sc = new Scanner(System.in);

    // que1
    public static void Que1() {
        System.out.println("enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = (a + b + c) / 3.0;
        System.out.println(average);
    }

    // que2
    public static void Que2() {
        int counter = 0;
        int sum = 0;
        System.out.println("enter the number:- ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                counter++;
                sum += i;
            }
        }
        System.out.println("there are " + counter + " odd number betweeen 0 and " + n + " and their sum is " + sum);
    }
 
    // que3
    public static void Que3() {
        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("wrong input !");
        } else if (age < 18) {
            System.out.println("sorry you cant vote grow upto age of 18");
        } else if (age >= 18) {
            System.out.println("sure go ahead you can vote");
        } else if (age>=100) {
            System.out.println("you are way to old stay in house");
        }else {
            System.out.println("error genrated try again later !");
        }

    }

    // que 7
    public static void Que7() {
        int Pcount = 0;
        int Ncount = 0;
        int Zeros = 0;

        while (true) {

            System.out.println("enter any number except 777 but if u want to stop enter 777");
            int n = sc.nextInt();

            if (n == 777) {
                break;
            } 
            
            else {
                    if(n>0)
                    {
                        Pcount++;
                    }
                else if (n<0)
                    {
                        Ncount++;
                    }
                else if (n==0)
                    {
                        Zeros++;
                    }
                System.out.println("the number of positive integer entred is: " + Pcount);
                System.out.println("the number of negative integer entred is: " + Ncount);
                System.out.println("the number of zeros entred is:" + Zeros);
            }
        }
    }


    // que8
    public static void que8() {

        System.out.println("enter the number ");
        double x = sc.nextDouble();

        System.out.println("enter the power");
        int n = sc.nextInt();

        double power = 1;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                power *= x;
            }
        } else if (n < 0) {
            for (int i = n; i < 0; i++) {
                power /= x;
            }
        } else if (n == 0) {
            System.out.println("1");
        }
        System.out.println("the number to the power is: " + power);
    }

    // que9
    public static void que9() {
        int x;
        int y = 0;
        System.out.println("enter the two integer");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            x = a;
        } else {
            x = b;
        }
        for (int c = 2; c <= x; c++) {
            if ((a % c == 0) && (b % c == 0)) {
                y = c;
            }
        }
        System.out.println("the greatest integer is: " + y);
    }

    public static void que10()
    { 
        short counter = 0;
        int sum;
        int prev1 = 0;
        int prev2 = 1;
        System.out.println("enter number of terms for fibonacii series");
        int n = sc.nextInt();
        try {

            System.out.println("Printing the fibonacci Series till Provided no. of tems");
            for (int i=1 ; i<=n ; i++)
                {
                    switch (i)
                            {
                                case 1 -> {
                                    counter++;
                                    System.out.println("0");
                                    continue;
                                }
                                case 2 -> {
                                    counter++;
                                    System.out.println("1");
                                    continue;
                                }
                            }
                    counter++;
                    sum = prev1 + prev2;
                    prev1 = prev2;
                    prev2 = sum;
                    System.out.println("term 1 = " + counter + sum);
                }
        } 
            catch (InputMismatchException e) 
            {
                System.out.println("error occured");
            }
    }
    
    ////////////////////////////// main function

    public static void main(String args[]) {
        Que1();
        Que2();
        Que3();
        Que7();
        que8();
        que9();
        que10();
    }
}