class Counter {
public static int unsynchronizedCount=0;
public static int synchronizedCount=0;
public static void unsynchronizedIncreament () { unsynchronizedCount++; }
public static synchronized void synchronizedIncreament () { synchronizedCount++; }
}
public class RaceInThreads {
    public static void main(String[] args) {
    
        try {
            Runnable r1 = () -> { for(int i=0 ; i<900000 ; i++) Counter.unsynchronizedIncreament(); };
            Runnable r2 = () -> { for(int i=0 ; i<900000 ; i++) Counter.unsynchronizedIncreament(); };
            Runnable r3 = () -> { for(int i=0 ; i<900000 ; i++) Counter.synchronizedIncreament(); };
            Runnable r4 = () -> { for(int i=0 ; i<900000 ; i++) Counter.synchronizedIncreament(); };
            
            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);
            Thread t3 = new Thread(r3);
            Thread t4 = new Thread(r4);
            
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            
            System.out.println( "value of unsynchronized Increament method by r1 and r2 thread is : " + Counter.unsynchronizedCount);
            System.out.println( "value of synchronized Increament method by r3 and r4 thread is   : " + Counter.synchronizedCount);
        } catch (InterruptedException ex) {
            System.out.println("thread was interrupted"); 
        }
    }
}
/*
 * race condion in threads occur due to non synchronization
 * 
 * can happen when multiple thread acess mutable varriable or object at the same time
 * due to this it might loose some operations and can give inconsistent results
 */