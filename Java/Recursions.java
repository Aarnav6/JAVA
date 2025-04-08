/*
public class Recursions {
    public static int calcFactorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
}
*/
//////////////////////////////////////////

import java.util.Scanner;
public class Recursions {
    public static int power(int num , int pow) {
        if(num == 0) {
            return 0;
        }
        else if(pow == 0) {
            return 1;
        }
        int res = num * power(num , pow-1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();
        System.out.print("enter the power: ");
        int power = sc.nextInt();
        int ans = power(number , power);
        System.out.println("Ans is: " + ans);
        sc.close();
    }
}