// implementing the synchronize block in this code :

public class SynchronizedBlock {

    private final Object sharedLock = new Object();  // shared lock object

    public void methodA() {
        synchronized (sharedLock) {
            System.out.println(Thread.currentThread().getName() + " entered methodA");
            for(int i=1 ; i<=50 ; i++) {
                System.out.print(i + "\t" );
            }
            System.out.println(Thread.currentThread().getName() + " leaving methodA");
        }
    }

    public static void main(String[] args) {
        SynchronizedBlock demo = new SynchronizedBlock();

        Thread t1 = new Thread(() -> demo.methodA(), "Thread-1");
        Thread t2 = new Thread(() -> demo.methodA(), "Thread-2");

        t1.start();
        t2.start();
    }
}
