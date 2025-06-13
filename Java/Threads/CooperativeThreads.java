// i wrote this code to simulate how threads work simultaneously
public class CooperativeThreads {
    private final Object sharedLock = new Object();
    private boolean turnOfThread1 = true; // control which thread should work

    public void methodA(String threadName) {
        for (int i = 1; i <= 5; i++) {
            synchronized (sharedLock) {
                try {
                    while ((threadName.equals("Thread-1") && !turnOfThread1) ||
                           (threadName.equals("Thread-2") && turnOfThread1)) {
                        sharedLock.wait(); // Not this thread's turn → release lock, wait
                    }

                    // Do the work
                    System.out.println(threadName + " doing part " + i);

                    // Switch turn and notify
                    turnOfThread1 = !turnOfThread1;
                    sharedLock.notifyAll();

                    // Optionally simulate work
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        CooperativeThreads demo = new CooperativeThreads();

        Thread t1 = new Thread(() -> demo.methodA("Thread-1"));
        Thread t2 = new Thread(() -> demo.methodA("Thread-2"));

        t1.start();
        t2.start();
    }
}
