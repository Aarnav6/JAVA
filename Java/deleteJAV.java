import java.io.File;

public class deleteJAV {
    public static void main(String[] args) {

        String directoryPath1 = "D:/Code/C++";
        String directoryPath2 = "D:/Code/java";
        String directoryPath3 = "D:/Code/Temporarycodes";
        String directoryPath4 = "D:/Code/Unicodes";

        File directory1 = new File(directoryPath1);
        File directory2 = new File(directoryPath2);
        File directory3 = new File(directoryPath3);
        File directory4 = new File(directoryPath4);

        if (directory1.exists() && directory1.isDirectory()) {
            File[] files = directory1.listFiles();
            if (files != null) {
                for (File file : files) {
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
        }
        if (directory2.exists() && directory2.isDirectory()) {
            File[] files = directory2.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".class")) {
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        }
        if (directory3.exists() && directory3.isDirectory()) {
            // Get all files in the directory
            File[] files = directory3.listFiles();
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
                    if (file.isFile() && file.getName().endsWith(".exe")) {
                        // Delete the file
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }
                }
            }
        }
        if (directory4.exists() && directory4.isDirectory()) {
            // Get all files in the directory
            File[] files = directory4.listFiles();
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
                    if (file.isFile() && file.getName().endsWith(".exe")) {
                        // Delete the file
                        if (file.delete()) {
                            System.out.println("Deleted: " + file.getName());
                        } else {
                            System.out.println("Failed to delete: " + file.getName());
                        }
                    }                
                }
            }
        }
    } 
}
