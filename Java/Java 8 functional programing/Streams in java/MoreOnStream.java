/*
//code 1:- 
import java.util.stream.Stream;
public class MoreOnStream {
    public static void main(String[] args) {
    int res = Stream.iterate(100 , n -> n>=0, n -> n-15) // condition is like loop check in notes bellow
                    .limit(10000) // max stream size is 1000
                    .filter(n -> n %2==0)
                    .map(n -> n+1)
                    .reduce((a,b) -> a>b ? a : b).get();
    System.out.println(res);
// *                                         reduce to single value (eg. getting max value in stream)
// *                                         this takes BinaryOpertor <Starting stream value , next to it stream value>  like (a,b) so a is first and b is next to it value
// *                                         and performs the operations wrriten in BinaryOperator then 
// *                                         for it on each value and return a single value reduced
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
//code 2:- 
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class MoreOnStream {
    public static void main(String[] args) {
    List<Integer> list = Stream.iterate(100 , n -> n>=0, n -> n-15) // condition is like loop check in notes bellow
                    .limit(10000) // max stream size is 1000
                    .filter(n -> n %2==0)
                    .map(n -> n+1)
                    .sorted()
                    .collect(Collectors.toList());
    System.out.println(list);
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 *  notes: 
 *  Stream.iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
 *  ✅ Parameters:
 *  Parameter	Description
 *  seed	    The initial (first) value in the stream
 *  hasNext	    A condition (like a loop's end condition) – if false, stops the stream
 *  next        A function that produces the next element from the previous one
 * 
 * if youre  using parllel stream use forEachOrdered() for correct excution 
 * it ensures the output will be ordered and not cause problem due to parllel execution
 *
 */