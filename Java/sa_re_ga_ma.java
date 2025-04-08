public class sa_re_ga_ma
{
public static void main(String args[])
{
    int n = 8;   // value of row
    int i;      // for loop to not loose memory
    
    System.out.print("\n \n \n"); // to print some extra lines at the start for spacing the output lower
    
   
    for (i = 1; i <= n; i++)  // row for upper loop before reversing
    {
        
        for (int j = 1; j <= n - i; j++) // loop to print spaces
        {
            System.out.print("   ");
        }


        for (int j = 1; j <= i; j++) // loop for upper
        {
        switch (j) {
                    case 1, 8 -> System.out.print("sa ");
                    case 2 -> System.out.print("re ");
                    case 3 -> System.out.print("ga ");
                    case 4 -> System.out.print("ma ");
                    case 5 -> System.out.print("pa ");
                    case 6 -> System.out.print("dh ");
                    case 7 -> System.out.print("ni ");
                    default -> System.out.print("error generated ");
                    }
        }
        
        for (int j = i - 1; j >= 1; j--) // loop for upper 
        {
        switch (j) {
                    case 1,8 -> System.out.print("sa ");
                    case 2 -> System.out.print("re ");
                    case 3 -> System.out.print("ga ");
                    case 4 -> System.out.print("ma ");
                    case 5 -> System.out.print("pa ");
                    case 6 -> System.out.print("dh ");
                    case 7 -> System.out.print("ni ");
                    default -> System.out.print("error generated ");
                    }
        }
        System.out.println();
    }


    for (i = n-1 ; i>=1 ; i--)  //row for lower loop after reversing
    {
        
        for (int j = 1; j <= n - i; j++) // loop to print spaces
        {
            System.out.print("   ");
        }


        for (int j = 1; j <= i; j++) // loop for lower
        {
        switch (j) {
                    case 1,8 -> System.out.print("sa ");
                    case 2 -> System.out.print("re ");
                    case 3 -> System.out.print("ga ");
                    case 4 -> System.out.print("ma ");
                    case 5 -> System.out.print("pa ");
                    case 6 -> System.out.print("dh ");
                    case 7 -> System.out.print("ni ");
                    default -> System.out.print("error generated ");
                    }
        }
        for (int j = i - 1; j >= 1; j--)  // loop for lower
        { 
        switch (j) {
                    case 1,8 -> System.out.print("sa ");
                    case 2 -> System.out.print("re ");
                    case 3 -> System.out.print("ga ");
                    case 4 -> System.out.print("ma ");
                    case 5 -> System.out.print("pa ");
                    case 6 -> System.out.print("dh ");
                    case 7 -> System.out.print("ni ");
                    default -> System.out.print("error generated ");
                    }
        }
        System.out.println();
    }
}
}
