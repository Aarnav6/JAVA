import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysToCreateStreams {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        
        //1. from collections
        List<String> list = List.of("a","b","c");
        Stream<String> stream1 = list.stream();

        //2. from arrays
        String[] arr = {"a","b","c"};
        Stream<String> stream2 = Arrays.stream(arr);

        //3. Using Stream.of()
        Stream<String> stream3 = Stream.of("a","b","c");
        IntStream intStream = IntStream.of(1,2,3,4);

        //4. using Stream.builder()
        Stream<String> stream4 = Stream.<String>builder()
                                        .add("a")
                                        .add("b")
                                        .add("c")
                                        .build();
                                        
        //5.Using Stream.generate() (infinite stream)
        Stream<Double> stream5 = Stream.generate(Math :: random).limit(5);
        
        //6.Using Stream.iterate() (infinite stream with seed)
        Stream<Integer> stream6 = Stream.iterate(0, n -> n + 2).limit(5);

        // 7. From Files (java.nio.file.Files.lines)
        Path path = Paths.get("file.txt");
        try (Stream<String> lines = Files.lines(path)) {
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //8. From a Pattern (Splitting a String)
        Stream<String> stream = Pattern.compile(",").splitAsStream("a,b,c");

        //9. Using Collectors (To create stream from map's keys/values/entries)
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

    }
}

/*
    * ✅ Summary Table :- 
    *
    * Source	                            Stream Type
    *
    * collection.stream()	                Object Stream
    * Arrays.stream()	                    Object / Primitive Stream
    * Stream.of(...)	                    Object Stream
    * Stream.builder()	                    Object Stream
    * Stream.generate()	                    Infinite Object Stream
    * Stream.iterate()	                    Infinite Object Stream
    * Files.lines()	Stream of file lines
    * Pattern.splitAsStream()	            Stream from string split
    * IntStream.range()	Primitive           IntStream
    * map.keySet().stream()                 Stream from map structures
 */