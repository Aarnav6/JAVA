import java.io.*;
// import java.io.File;
// import java.io.IOException;
// import java.io.FileOutputStream;
// import java.io.FileInputStream;
// import java.io.ObjectOutputStream;
// import java.io.ObjectInputStream;

public class Serialization_And_Deserialization {
    final private static String fileName = "TempText.txt";
    final private static String filePath = ".";

    private static void write() {
        var file = new File(filePath,fileName);
        try (var oos = new ObjectOutputStream(new FileOutputStream(file))) {
            if(file.canWrite()) {
                //the method from object output stream is used to seriallize data but,
                // it is required that class whoose object youre passing must implements java.io.Serializable;(Interface)
                oos.writeObject(new Employee(1,"nat","seceret123")); //data serialization
                // smimilarly we can deserialize it using ObjectInputStream(new FileInputStream).readObject()
            }
        } catch (IOException e) {
            System.out.println("caught IO Exception : " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("caught error : " + e.getMessage());
            e.printStackTrace();
        }

        try (var ois = new ObjectInputStream(new FileInputStream(file))) {
            var emp = (Employee) ois.readObject();
            System.out.println("id : " + emp.getId());
            System.out.println("name : " + emp.getName());
            System.out.println("password : " + emp.getPassword()); // its null since its transient
        } catch (IOException e) {
            System.out.println("caught IO Exception : " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("caught error : " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Serialization_And_Deserialization.write();
    }
}

/*
 * notes :-
 * in java when u pass an object it can't directly be passed you must serialize it hence it means converting it into byte stream
 * then the pass it onto other system, file or wherever you want to recive it then deserialize it and then use it
 * 
 * What is serialization in Java?
 * Serialization is the process of turning an object’s state (its fields) into a sequence of bytes.
 * 
 * Deserialization: (is the inverse) reconstructing an object from a byte stream.
 * 
 * Java’s built‑in mechanism uses:
 *    java.io.ObjectOutputStream to write objects
 *    java.io.ObjectInputStream to read them back
 * 
 * Why serialize?
 * Persistence: save object graphs to disk (e.g. caching, game saves).
 * Communication: send objects over the network (RMI, HTTP, socket streams).
 * Deep copy: clone an object graph by round‑tripping through bytes.
 * Key takeaways
 *    You only need implements Serializable (plus an optional serialVersionUID) to allow Java’s default serialization.
 *    String concatenation converted your Employee into a String, so no exception was thrown—because String already is Serializable.
 *    Use transient on any fields you don’t want in the byte stream better for security and saves space of transient field (e.g. passwords).
 *       transient keyword can only be used in intance 
 *       transient keyword is not allowed in local or static since they dont belong to object
 *    Serialize only what you truly need—over‑serializing can bloat files or leak sensitive data.
 */
