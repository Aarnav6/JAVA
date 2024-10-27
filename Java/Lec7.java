import java.util.InputMismatchException;
import java.util.Scanner;

public class Lec7 {
    public static void sum()
    {
        Scanner ob = new Scanner(System.in);
        try
        {
            int sum,a,b;
            System.out.println("enter the value");
            a = ob.nextInt();
            b = ob.nextInt();
            sum = a + b;
            System.out.println(sum);  
        }
        catch(InputMismatchException  e)
        {
                String c = ob.nextLine();
                String d = ob.nextLine();
                String f = c+d;
                System.out.println(f);
        }
    }
	public static void main(String agrs[])
	{
        sum();
    }
}