import java.util.function.Function; 
import java.util.function.UnaryOperator; 
public class Unary_Operator {
    public static void main(String[] args) {
        UnaryOperator<Integer> cube = x -> x*x*x;
        UnaryOperator<Integer> square = x -> x*x;
        Function<Integer, Integer> cubeThenSquare = cube.andThen(square);
        System.out.println(cube.apply(3)); //27
        System.out.println(square.apply(3)); //9
        System.out.println(cubeThenSquare.apply(3)); //3*3*3 = 27 , 27*27 = 729
    }
}
// this extends function and can be used instead of cases where input type and output type are same <Input , Output>
// remeber u cant directly chain UnaryOperator it gives error use Funciton for
