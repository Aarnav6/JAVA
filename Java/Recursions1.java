class Recursions1 {
    public static void recursive_forward(int n) {
        if(n == 6) {                                        // this is called base case
            return;
        }
        System.out.println(n);                              // this runs while method is added in stack memory (construction of method) remember !!!
        recursive_forward(n+1);
    }
    public static void recursive_backward(int n) {          // this is called base case
        if(n == 6) {
            return;
        }
        recursive_backward(n+1);
        System.out.println(n);                              // this runs when when the method pop's from stack memory (this can be called as Method Unwiding) remember !!! 
    }
    public static void main (String args[]) {
        int argument = 1;
        recursive_forward(argument);
        recursive_backward(argument);
    }
}