import java.util.*;
public class Loops_HW
{
public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);


// to check if a number is prime from lecture 4 homeowork just for fun im did it
// System.out.println("enter the number to check its prime or not ");
// int k = ob.nextInt();
// boolean isprime=true;
// int value=0;

// for (int i=2 ; i<k ; i++)
// {
// if (k%i == 0)
//     {
//         value=i;
//         isprime = false;
//         break;
//     } 

// }
// if (isprime)
// {
//     System.out.println("yay! its prime number");
// } else{
//     System.out.println("Sorry! its not prime number its divisble by" +value);
// }
// */


// /*

// advanced version from my idea small game
// System.out.println("enter the number: ");
// int l = ob.nextInt();
// while (true) 
// {
//     int value=0;
//     boolean isprime=true;
//     System.out.print("enter the number again: ");
//     l = ob.nextInt();
//     for (int i=2 ; i<l ; i++)
// {
// if (l%i == 0)
//     {
//         value=i;
//         isprime = false;
//         break;
//     } 
    
// }
// if (isprime)
// {
//     System.out.println("yay! its prime number");
// } else{
//     System.out.println("Sorry! its not prime number its divisble by: " +value);
//     break;
// }
// }

/*

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
*/
    
// System.out.println("enter the no. of row for triangle");    
// int row = ob.nextInt();
// for (int i=1 ; i<=row ; i++)
// {
//     for (int j=1 ; j<=row-i ; j++)
//     {
//         System.out.print("  ");
//     }
//     for (int j=i ; j>=1 ; j-- )
//     {
//         System.out.print(j+" ");
//     }
//     for (int j=1 ; j<=i ; j++ )
//     {
//         if (j==1) 
//         {
//             continue;
//         }
//         System.out.print(j + " ");
//     }
//     System.out.println();

// }

// System.out.println("enter the no. of row for triangle");    
// int rw = ob.nextInt();
// for (int i=1 ; i<=rw ; i++)
// {
//     for (int j=1 ; j<=row-i ; j++)
//     {
//         System.out.print(" ");
//     }
//     for (int j=i ; j>=1 ; j-- )
//     {
//         System.out.print(i+" ");
//     }

//     System.out.println();
// }

ob.close();
}
}