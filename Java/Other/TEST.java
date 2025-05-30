public class TEST {
    private int heloBhai;
    public void check(int heloBhai){
        this.heloBhai = heloBhai;
    }
    public static void main(String[] args) {
        TEST A = new TEST();  
        A.check(5);
        System.out.println(A.heloBhai);
    }
}