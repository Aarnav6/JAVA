class try_catch {
    public static void main(String[] args) {
        try {
        int num = 5/0;
        System.out.println("its try block");  
        }
        catch (ArithmeticException e){
        System.out.println("its an errror");
        }
    }
}