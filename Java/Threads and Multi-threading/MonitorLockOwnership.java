/*
 *   i actually realised this concept of owning the lock,'
 *   when i was stuck in a leet code problem 1114. Print in Order for topic Concurency
 *   so, 
 *   understand this that lock is not automatically given to any thread when needed by an method 
 *   like in case thread calls wait() 
 *   instead, 
 *   the lock can only be given to an thread when it enters an synchronized block or synchronized method
 *   
 *       for example check the code given bellow 
 *       the given code will throw an Runtime Excetion 
 *       so dont run it but just to understand since it does not use synchronized block or synchronized method
 *       and calls wait() the lock isn't owned by thread an throws an exception
 *       the code :-
 * 
 *              public class MonitorLockOwnership {
 *                  private boolean checkFirst;
 *                  private boolean checkSecond;
 *              
 *                  public MonitorLockOwnership() {
 *                      this.checkFirst = false;
 *                      this.checkSecond = false;
 *                  }
 *                  
 *                  public void first(Runnable printFirst) throws InterruptedException {    
 *                      printFirst.run();
 *                      checkFirst = true;
 *                  }
 *              
 *                  public void second(Runnable printSecond) throws InterruptedException {
 *                      while (!checkFirst) {
 *                          Thread.currentThread().wait();
 *                      }
 *                      this.notify();
 *                      printSecond.run();
 *                      checkSecond = true;
 *                  }
 *                  
 *                  public void third(Runnable printThird) throws InterruptedException {
 *                      while (!checkSecond) {
 *                          Thread.currentThread().wait();
 *                      }
 *                      this.notify();
 *                      printThird.run();
 *                  }
 *                  public static void main(String[] args) throws InterruptedException {
 *                      var obj1 = new MonitorLockOwnership();
 *                      var obj2 = new MonitorLockOwnership();
 *                      var obj3 = new MonitorLockOwnership();
 *              
 *                      Thread t1  = new Thread (
 *                          () -> {
 *                              try {
 *                                  obj1.first(() -> System.out.println("first"));
 *                              } catch (InterruptedException ex) {
 *                                  ex.printStackTrace();
 *                              }
 *                          } , "thread~t1"
 *                      );
 *              
 *                      Thread t2  = new Thread(
 *                          () -> {
 *                              try {
 *                                  obj2.second(() -> System.out.println("second"));
 *                              } catch (InterruptedException ex) {
 *                                  ex.printStackTrace();
 *                              }
 *                          } , "thread~t2"
 *                      );
 *              
 *                      Thread t3  = new Thread (
 *                          () -> {
 *                              try {
 *                                  obj3.third(() -> System.out.println("third"));
 *                              } catch (InterruptedException ex) {
 *                                  ex.printStackTrace();
 *                              }
 *                          } , "thread~t3"
 *                      );
 *              
 *                      t1.start();
 *                      t2.start();
 *                      t3.start();
 *                  }
 *              }
 *              
 *              basically :
 *              public static void main(String[] args) throws InterruptedException {
 *                  var obj = new MonitorLockOwnership();
 *                  Runnable r1 = () -> {
 *                      try {
 *                          obj.first(() -> System.out.println("first"));
 *                      } catch (InterruptedException ex) {
 *                          ex.printStackTrace();
 *                      }
 *                  };
 *                  Runnable r2 = () -> {
 *                      try {
 *                          obj.second(() -> System.out.println("second"));
 *                      } catch (InterruptedException ex) {
 *                          ex.printStackTrace();
 *                      }
 *                  };
 *                  Runnable r3 = () -> {
 *                      try {
 *                          obj.third(() -> System.out.println("third"));
 *                      } catch (InterruptedException ex) {
 *                          ex.printStackTrace();
 *                      }
 *                  };
 *              
 *                  Thread t1  = new Thread(r1);
 *                  Thread t2  = new Thread(r2);
 *                  Thread t3  = new Thread(r3);
 *              
 *                  t1.start();
 *                  t2.start();
 *                  t3.start();
 *              }
 *                  
*/