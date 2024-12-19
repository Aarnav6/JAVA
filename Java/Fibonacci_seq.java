class Fibonacci_seq {
    public static void main(String[] args) {
        int sum;
        int prev=0;
        int next=1;
        for(int i=0 ; i<30 ; i++) {
            sum = prev + next;
            System.out.println(sum);
            prev = next;
            next = sum; 
        }
    }
}