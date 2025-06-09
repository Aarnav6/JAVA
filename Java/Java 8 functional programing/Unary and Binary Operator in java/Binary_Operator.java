import java.util.function.BinaryOperator; 
public class Binary_Operator {
    public static void main(String[] args) {
        BinaryOperator<String> concat = (x,y) -> x+" "+y; // takes to input of same type and return type
        BinaryOperator<String> reverseConcat = (x,y) -> y+" "+x;
        System.out.println(concat.apply("hello","world")); 
        System.out.println(reverseConcat.apply("hello","world")); 
    }
}
// similar to how unary is used with respect to function ,
// we use Binary operator is used with respect to Bifunction