import java.util.Scanner;
public class Using_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter an intger: ");
        System.out.println(scanner.nextInt());  
        scanner.close(); // good practice to close the resource to prevent from leaking the data
    }   
}
/* notes:
 * scanner is good for small data reading since it parses internally and has many functionality
 * but we cant use it for big chunk inputs its slow and less efficient in comparision to buffer reader
 * also we do not need to care about the IOException being thrown
 */