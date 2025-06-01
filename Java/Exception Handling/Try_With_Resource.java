import java.util.Scanner;

public class Try_With_Resource {
    public static void main(String[] args) { // (try with resource) automatically closes
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("I'm taking an input as integer : ");
            System.out.println("you entered : " + scanner.nextInt());
        }

    }    
}
/*
import java.util.Scanner;
// actually here we're using try with finally and manually closing the resource 
// although it doesn't have any problem 
// but it's better to do it through try with resource in terms of readability and making your code less vulnerable
public class Try_With_Resource {
    public static void main(String[] args) { // (try with finally)
        Scanner scanner = new Scanner(System.in); // only creating variable
        try {
            System.out.println("I'm taking an input as integer : ");
            System.out.println("you entered : " + scanner.nextInt());
        }
        finally {
            scanner.close(); // manual closing in finally
        }
        
    }    
}
*/

/* notes :
 * 1:   
 * the main point is that it's a must to use try with finally or try with resource to close the resource from leaking
 * I used to think why can't we close openly in main or in any method. Reason to my doubt was that if we do it inside 
 * any method openly and an error comes, that will stop the resource from being closed if that line is not reached, 
 * so it will let the resource leak. So you should always close and clear resources in this manner
 * 
 * 2:   
 * now since it's better to let it automatically close and it's better in readability, just use try with resource block
 */
