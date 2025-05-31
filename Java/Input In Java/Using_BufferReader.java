import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Using_BufferReader {
    public static void main(String[] args) throws IOException { // forcing jvm to handle exception this is bad practice , using just for learning
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        // can also be written as BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter a number: ");
        String inputString = bf.readLine();
        int num = Integer.parseInt(inputString);
        // can also be written as int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close(); // good practice to close the resource to prevent from leaking the data
    }
}
/* notes :
 * we have that bigger input taking way 
 * but it needs an object of InputStreamReader
 * whereas the InputStreamReader needs Object of InputStream
 * which we saw earlier was in decalred as static inside system class
 * so we pass it to InputStreamReader
 * also we need to care about the IOException being thrown
 */