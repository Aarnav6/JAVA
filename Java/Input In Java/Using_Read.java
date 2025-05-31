import java.io.IOException;
import java.util.Scanner;  // i was not meant to use it here just using to show the input buffer and for help
public class Using_Read {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException { // forcing jvm to handle exception this is bad practice , using just for learning
        System.out.print("enter a number: ");
        int num = System.in.read(); // reads in ascii value but only of 1 character remaning are sored in a input buffer
        String inputBuffer = scanner.nextLine(); // i was not meant to use it here just using to show the input buffer and for help
        System.out.println("value of 1st character as ascii through read() method :- " + num);
        System.out.println("actual value was entred was num - 48 = " + (num - 48));
        System.out.println("remaing in the input buffer as string:- " + inputBuffer);
        System.in.close(); // good practice to close the resource to prevent from leaking the data
    }
    /* notes :
     * so the problem here being was that we can only read a single character at a time 
     * so we needed something read bigger inputs
     * also we need to care about the IOException being thrown
     */
}