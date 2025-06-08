import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
public class UsingConsumer {
    public static void main(String[] args) {
        // consumer can be used if want to do something wihtout the ouput 
        // pass argument something perform something and no return
        Consumer<Integer> consumeVarriable = s -> System.out.println("prints this : " + s);
        Consumer<List<String>> consumeList = list -> { for(String str : list) { System.out.print(str + " "); } };
        List<String> list = Arrays.asList("um" ,"i" , "dont" , "know", "what" , "to" ,"add"); 
        
        consumeVarriable.accept(32);
        consumeList.accept(list);

        //using andThen in Consumer (it must to have same type) 
        // remeber type of all consumers while using andThen must be same
        Consumer<Integer> cons1 = x -> System.out.println(x+1);
        Consumer<Integer> cons2 = x -> System.out.println(x+1);
        Consumer<Integer> cons3 = x -> System.out.println(x+1);
        Consumer<Integer> cons4 = x -> System.out.println(x+1);
        Consumer<Integer> consumeAll = cons1.andThen(cons2).andThen(cons3).andThen(cons4);
        consumeAll.accept(5);
    }
}
