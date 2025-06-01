import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class MyFileWorker {
    public static void fileWriter(File file , Scanner scanner) throws IOException {
        if(!file.exists()) {
            System.out.println("file does not exist");
            return;
        }
        if(!file.isFile()) {
            System.out.println(file.getName() + " is not a file");
            return;
        }
        if(!file.canWrite()) {
            System.out.println("is not a writable file");
            return;
        }
        try (FileWriter fileWriter = new FileWriter(file , true)) { // append mode is on (true)
            String text;
            System.out.println("Type to enter text file type or else type exit to stop writing :-");
            while(!(text = scanner.nextLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(text);
                fileWriter.write("\n");
            }
            System.out.println("Sucessfully written to file ✅");
            System.out.println("\n");
        }
    }

    public static File filePathAndNameIntializer(Scanner scanner) {
        String filePath;
        String fileName;
            System.out.print("enter the directory path :");
            filePath = scanner.nextLine();
            System.out.print("enter the fileName with Extension : ");
            fileName = scanner.next();
        File file = new File(filePath,fileName);
        if (file.isDirectory()) {
            System.out.println(file.getName() + " is an Directory");
        } else if (file.isFile()) {
            System.out.println(file.getName() + " is an Regular File");
        }
        System.out.println("\n");
        return file;
    }

    public static void fileCreator(File file) throws IOException {
        if (file.createNewFile()) {
            System.out.println("Sucessfully created the file ✅");
        } else {
            System.out.println("The file already exist's cant create file with same name and extension");
        }
        System.out.println("\n");
    }

    public static void fileReaderThroughScanner(File file) {
        if(!file.canRead()) {
            System.out.println("file is not readable");
        }
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void fileReaderThroughBufferedReader(File file) {
        if(!file.canRead()) {
            System.out.println("file is not readable");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String text;
            while((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }
        } catch (IOException e) {
            System.out.print(e);
        } 
    }
    public void ReadingChoice(File file , Scanner scanner) {
        System.out.println("Enter 0  to exit without reading");
        System.out.println("Enter 1 if u want to read through Scanner");
        System.out.println("Enter 2 if u want to read through Buffered Reader");
        byte input = (byte) scanner.nextInt();
        switch (input) {
            case 0 -> {} // does nothing and just return
            case 1 -> MyFileWorker.fileReaderThroughScanner(file);
            case 2 -> MyFileWorker.fileReaderThroughBufferedReader(file);
            default-> System.out.println("Wrong Input");
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner  = new Scanner(System.in)){
            File file = filePathAndNameIntializer(scanner);
            MyFileWorker.fileCreator(file);
            MyFileWorker.fileWriter(file,scanner);
            MyFileWorker.fileReaderThroughScanner(file);
            MyFileWorker.fileReaderThroughBufferedReader(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}