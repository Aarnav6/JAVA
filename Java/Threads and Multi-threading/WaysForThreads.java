// In java there are 2 method to create thread
// Both are give bellow 
// In 2nd mehtod You can use lambda function to make it more better and efficient 

/*

// 1.extending to thread class method

class ByExtendingToThread extends Thread {
    final private String name;
    public ByExtendingToThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.name);
            try {
                Thread.sleep(1); // sleep for 1 millisecond
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class WaysForThreads extends Thread {
    public static void main(String[] args) {
        ByExtendingToThread t1 = new ByExtendingToThread("thread one");
        ByExtendingToThread t2 = new ByExtendingToThread("thread two");

        t1.start();
        t2.start();
    }
}



// 2. by Implementing a class To funcitnoal interface Runnable

class ByImplementingToRunnable implements Runnable {
    final private String name;
    public ByImplementingToRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.name);
            try {
                Thread.sleep(1); // sleep for 1 millisecond
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class WaysForThreads extends Thread {
    public static void main(String[] args) {
        
        ByImplementingToRunnable obj1 = new ByImplementingToRunnable("obj1");
        ByImplementingToRunnable obj2 = new ByImplementingToRunnable("obj2");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}



//2. better version of 2nd method by directly by using lambda expression to implement the functional interface runnable

public class WaysForThreads {
    public static void main(String[] args) {
        
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("thread 1st running");
                try {
                    Thread.sleep(1); // sleep for 1 millisecond
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("thread 2nd running");
                try {
                    Thread.sleep(1); // sleep for 1 millisecond
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
    
 
*/