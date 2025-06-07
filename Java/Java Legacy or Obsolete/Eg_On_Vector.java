 
/*
    *    
    *                                About Java Legacy or Obsolete:-
    *    
    *    What is Java legacy or obsolete in Java?
    *    Legacy or obsolete means old classes or APIs that are no longer recommended because better alternatives exist.
    *    
    *    Why is Vector considered legacy in Java?
    *    Vector is synchronized by default, which makes it slower in most cases compared to newer alternatives.
    *    
    *    Since Vector is synchronized, why should we avoid it?
    *    Because its synchronization is coarse-grained and often unnecessary, causing performance overhead in single-threaded or low-contention scenarios.
    *    
    *    What can we use instead of Vector to have synchronization when needed?
    *    Use ArrayList for unsynchronized use, and if synchronization is needed, wrap it using Collections.synchronizedList(new ArrayList<>()) or use CopyOnWriteArrayList from java.util.concurrent for better concurrency control.
    *
    *       better syncronised examples :- 
    *       
    *       1. Making an ArrayList synchronized using Collections.synchronizedList:-
    *           //This wraps the ArrayList with synchronized methods
    *           //Synchronization is explicit and more flexible than Vector.
    *           import java.util.ArrayList;
    *           import java.util.Collections;
    *           import java.util.List;
    *           public class SynchronizedArrayListExample {
    *               public static void main(String[] args) {
    *                   List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
    *                   syncList.add(1);
    *                   syncList.add(2);
    *                   syncList.add(3);
    *                   System.out.println("Synchronized ArrayList elements: " + syncList);
    *               }
    *           }
    *       
    *       2. CopyOnWriteArrayList for better concurrency:-
    *           // Provides thread safety with better performance in scenarios with more reads than writes.
    *           // Ideal for concurrent applications.        
    *           import java.util.concurrent.CopyOnWriteArrayList;
    *           public class CopyOnWriteArrayListExample {
    *               public static void main(String[] args) {
    *                   CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
    *                   cowList.add(1);
    *                   cowList.add(2);
    *                   cowList.add(3);
    *                   System.out.println("CopyOnWriteArrayList elements: " + cowList);
    *               }
    *           }
    */  