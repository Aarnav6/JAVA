/* Notes:

 * Iterable is the **superinterface** of the Collection framework in Java.
 * It allows the use of the enhanced for-loop (for-each loop).
 *
 * Collection is a **subinterface** of Iterable.
 * It defines basic methods like add(), remove(), size(), and iterator().
 *
 * Java Collection Framework Hierarchy Diagram (Extremely spaced and corrected)
 *
 *                                                                     Iterable
 *                                                                        |
 *                                                                        |
 *                                                                   Collection
 *                                                                        |
 *                      -----------------------------------------------------------------------------------------------------------
 *                      |                                                 |                                                       |
 *                     List                                             Set                                                    Queue
 *              (ordered, allows duplicates)                    (no duplicates)                                      (FIFO, some allow LIFO)
 *                      |                                                 |                                                       |
 *                -------------------                            -----------------------------------                            -----------------------------------
 *                |        |        |                            |                |                |                            |                 |               |          
 *             ArrayList LinkedList Vector                    HashSet       LinkedHashSet       SortedSet                    PriorityQueue      LinkedList      Deque  
 *                                     |                        |                                  |                                                              |            
 *                                   Stack                 (unordered)                         NavigableSet                                                    ArrayDeque        
 *                           (extends Vector - LIFO)                                               |                                               
 *                                                                                               TreeSet                                                                                                 
 *                                                                   
 *
 * Notes:
 * - Iterable: top-level superinterface. Enables enhanced for-loops.
 * - Collection: defines base methods like add(), remove(), size(), iterator().
 *
 * - List: ordered, allows duplicates.
 *   - ArrayList: resizable array.
 *   - LinkedList: doubly-linked list.
 *   - Vector: synchronized array-like list (legacy).
 *   - Stack: extends Vector (LIFO stack, legacy).
 *
 * - Set: does not allow duplicates.
 *   - HashSet: backed by HashMap, unordered.
 *   - LinkedHashSet: maintains insertion order.
 *   - SortedSet: interface for sorted sets.
 *     - NavigableSet: extension that adds navigation methods.
 *       - TreeSet: implements NavigableSet, backed by Red-Black Tree.
 *
 * - Queue: typically FIFO.
 *   - PriorityQueue: priority-based ordering.
 *   - Deque: double-ended queue (FIFO or LIFO).
 *     - ArrayDeque: resizable-array implementation of Deque.
 *
 * Additional:
 * - Map (HashMap, TreeMap, etc.) is NOT part of Collection interface hierarchy.
 */
