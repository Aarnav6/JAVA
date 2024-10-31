import java.io.File;

public class deleteJAV {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "D:/Code/Java"; // Change this to your desired path

        // Create a File object for the directory
        File directory = new File(directoryPath);

        // Check if the directory exists and is indeed a directory
        if (directory.exists() && directory.isDirectory()) {
            // Get all files in the directory
            File[] files = directory.listFiles();
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
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
