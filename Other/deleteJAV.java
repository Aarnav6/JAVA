import java.io.File;

public class deleteJAV {
    public static void main(String[] args) {
        
        // Specify the directory path
        String directoryPath1 = "D:/Code/C++";
        String directoryPath2 = "D:/Code/java";
        String directoryPath3 = "D:/Code/java/Other";

        // Create a File object for the directory
        File directory1 = new File(directoryPath1);
        File directory2 = new File(directoryPath2);
        File directory3 = new File(directoryPath3);

        // Check if the directory exists and is indeed a directory
        if (directory1.exists() && directory1.isDirectory()) {
            // Get all files in the directory
            File[] files = directory1.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Check if the file ends with .class
                    if (file.isFile() && file.getName().endsWith(".exe")) {
                        // Delete the fi2le
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        } // 1st if closed
        if (directory2.exists() && directory2.isDirectory()) {
            // Get all files in the directory
            File[] files = directory2.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Check if the file ends with .class
                    if (file.isFile() && file.getName().endsWith(".class")) {
                        // Delete the file
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        } // 2nd if closed
        if (directory3.exists() && directory3.isDirectory()) {
            // Get all files in the directory
            File[] files = directory3.listFiles();
            if (files != null) {
                for (File file : files) {
                    // Check if the file ends with .class
                    if (file.isFile() && file.getName().endsWith(".class")) {
                        // Delete the fi2le
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        } // 3rd if closed
    } //main closed 
} // class closed
