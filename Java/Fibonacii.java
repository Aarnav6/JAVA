/*
public class Fibonacii {
    public static void main(String args[]) {
        int sum=0;
        int prev=0;
        int next=1;
        int n=13;
        System.out.println("0"+"\n"+"1");
        for(int i=0 ; i<=n ; i++) {
            sum = prev + next;
            System.out.println(sum);
            prev = next;
            next = sum; 
        }
    }
}
*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public class Fibonacii {
    public static void fib(int i, int n, int prev, int next){
        if(i == n) {
            return;
        }
        int sum = prev + next;
        System.out.println(sum);
        prev = next;
        next = sum;
        fib(i+1, n, prev, next);
    }
    public static void main(String args[]) {
        System.out.println("0"+"\n"+"1");
        fib(0,10,0,1);
    }
}
*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

