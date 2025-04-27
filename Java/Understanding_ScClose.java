import java.util.Scanner;

public class Understanding_ScClose {
    public static void main(String[] args) {

        /*
         Alert!!!!  this code will throw error its just for genral understanding purpose of scanner.close() or sc.clsoe()
         */
        int val;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value: ");
        val = scanner.nextInt();
        scanner.close();
        System.out.println("you entred " + val);
        
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("enter another value: ");
        //val = sc.nextInt(); this line here will not run here because of sc.close() in 12th line so
        val = scanner1.nextInt(); // so i created new object
        scanner1.close(); //but its not working the reason being sc.close() closes underlying input stream, so close scanner only when your finished taking inputs
        System.out.println("you entred " + val);

    }
} 