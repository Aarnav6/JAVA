public class Lec6
{
public static void main(String args[])
{

// -------------------------- pattern 1st of 6th lecture
    

    int row=4;

    for (int i=1 ; i<=row ; i++ )
    {
        for(int j=1 ; j<=i ; j++)
        {
            System.out.print("*");
        }

        int space = (2*row)-(2*i); //formulla for space

        for(int j=1 ; j<=space ; j++)
        {
            System.out.print(" ");
        }
        for(int j=1 ; j<=i ; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

// reversing loop above to gain lower part

for (int i=row ; i>=1 ; i-- )
{
    for(int j=1 ; j<=i ; j++)
    {
        System.out.print("*");
    }

    int space = (2*row)-(2*i); //formulla for space

    for(int j=1 ; j<=space ; j++)
    {
        System.out.print(" ");
    }
    for(int j=1 ; j<=i ; j++)
    {
        System.out.print("*");
    }
    System.out.println();
}


    System.out.println("\n\n\n");


// -------------------------- pattern 1st of 6th lecture

}
}
