// code 1 :-
// import java.util.List;
// import java.util.Scanner;
// public class Streams {
//     final private static Scanner scanner = new Scanner(System.in);
//     public static String appender(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         System.out.format("enter what you want to append in name: %s ",s);
//         return sb.append(" ").append(scanner.nextLine()).toString();
//     }
//     public static void main(String[] args) {
//         List<String> name = List.of("aarnav", "anvesh", "amrit", "adhyatma", "aadarsh");
//         name.stream().map(Streams::appender).forEach(s -> System.out.println(s));
//         scanner.close();
//             // since an map uses an Funciton like funciton.Function from java 8 Function<> so,
//             // i created my own and tried to pass it and it worked
//     }
// }



// code 2 :-
// import java.util.List;
// public class Streams {
//     public static String appender(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         System.out.format("enter what you want to append in name: %s ",s);
//         return sb.append(" ").append("general").toString();
//     }
//     public static void main(String[] args) {
//         List<String> name = List.of("aarnav", "anvesh", "amrit", "adhyatma", "aadarsh");
//         name.stream().map(Streams::appender).forEach(s -> System.out.println(s));
//             // since an map uses an Funciton like funciton.Function from java 8 Function<> so,
//             // i created my own and tried to pass it and it worked
//     }
// }



// code 3 :-
// import java.util.List;
// public class Streams {
//     public static void main(String[] args) {
//         List<String> name = List.of("aarnav", "anvesh", "amrit", "adhyatma", "aadarsh");
//         try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
//             java.util.function.UnaryOperator<String> mapper = s -> {
//                 StringBuilder sb = new StringBuilder(s);
//                 System.out.format("enter what you want to append in name: %s ",s);
//                 return sb.append(" ").append(scanner.nextLine()).toString();
//             };
//             name.stream()
//                         .map(mapper)
//                         .forEach(s -> System.out.println(s));
//         }
//     }
// }



// what i realised while coding :- 
// i realised in code 2 that when u use the user input in code 1 it takes input for each value and display them imediately
// but in code 2 it doesent take input directly prints all value at once all of this works based upon the pipeline of stream and user input
// just remeber this happend for better understanding of streams in java (released the concept in java 8)
// in code 3 jusst used UnaryOperatsor (java.util.function.Function can also be used) for map in streams
// also in code 3 i used the all classes without import thats also possible 



/*
 * notes :-
 * In Java, streams are lazy, meaning intermediate operations like .map(),
 * .filter(), .sorted() do not execute immediately.
 * Instead, they build a pipeline of operations that are only triggered when a
 * terminal operation
 * (like .collect(), .forEach(), .count(), etc.) is called.
 * 
 * in java a stream can only be used once imagine like stream of water once u
 * took a glass of water the same can't be taken again since that water u took already flowed out
 * but u can chain like list.stream().filter().map()....
 * this way u can generate new stream until u use an terminating method
 * 
 * ✍️ Summary for Notes
 * Java Streams are lazy, meaning operations like .map() or .filter() are not
 * executed until a terminal operation is run.
 * 
 * This enables:
 * ✅ Performance boosts via short-circuiting
 * ✅ Avoiding unnecessary computation
 * ✅ Efficient execution through operation fusion
 * 
 * Terminal operations include: .collect(), .forEach(), .count(), .anyMatch(),
 * etc.
 * Lazy behavior helps build clean, efficient, and readable code.
 *
 * methods :-
 * .filter() this method needs an predicate to filter the stream on the basis of
 * the predicate
 * .map() takes an Function(an functional interface) in and returns a new pipe
 * line
 *
 */
