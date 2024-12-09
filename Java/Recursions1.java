class Recursions1 {
    public static void recursive_forward(int n) {
        if(n == 6) {                                            // this is called base case
            return;
        }
        System.out.print(n + "\t");                             // this runs while method is added in stack memory (construction of method) remember !!!
        recursive_forward(n+1);
    }
    public static void recursive_backward(int n) {              
        if(n == 6) {                                            // this is called base case
            return;
        }
        recursive_backward(n+1);
        System.out.print(n+"\t");                              // this runs when when the method pop's from stack memory (this can be called as Method Unwiding) remember !!! 
    }
        public static void recursive_bothSide(int n) {           
        if(n == 6) {                                             // this is called base case
            return;
        }
        System.out.print(n+"\t");                              // this runs while method is added in stack memory (construction of method) remember !!!
        recursive_bothSide(n+1);
        System.out.print(n+"\t");                              // this runs when when the method pop's from stack memory (this can be called as Method Unwiding) remember !!! 
    }
    public static void main (String args[]) {
        int argument = 1;
        System.out.println("using forward method");
        recursive_forward(argument);
        System.out.print("\n");

        System.out.println("using backward method");
        recursive_backward(argument);
        System.out.print("\n");

        System.out.println("using bothSide method");
        recursive_bothSide(argument);
        System.out.print("\n");
    }
}