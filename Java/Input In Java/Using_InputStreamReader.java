import java.io.IOException;
import java.io.InputStreamReader;

public class Using_InputStreamReader {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("enter some letters: ");
            int input = isr.read();
            while(isr.ready()) {
                System.out.println((char) input);
                input = isr.read();
            }
        }
        catch(IOException e) {
            System.out.println("exception caught: "+ e.getMessage());
        }
    }
}