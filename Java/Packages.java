/*
    When you create a package in Java, you can use:
        javac -d . <filename>.java
    or to compile all Java files in the directory:
        javac -d . *.java

    You can create sub-packages using:
        package packageName.subPackageName;

    Classes with the same name can exist in different packages.

    Example of package declaration:
        package MyFiles.javaFiles;
    
    package MyFiles.javaFiles;
    public class loop {
        public void packageMethod() {
            System.out.println("method made by me from myPackage.javaFiles in loop class");
        }
    }

    You can import a package or directly access a class using its fully qualified name:
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.nextInt(); // method call
 
    using packages u can import it and make the object of method of classes you imported through package
*/