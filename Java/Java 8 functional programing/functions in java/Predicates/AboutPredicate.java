import java.util.function.Predicate;
public class AboutPredicate {
    public static void predicateMethod() {
        Predicate<Integer> isPositiveOrZero = x -> x>=0;
        
        Predicate<String> startsWithA = s -> s.toLowerCase().charAt(0) == 'a';
        
        Predicate<String> endsWithV = s -> s.toLowerCase().charAt(s.length()-1) == 'v';
        
        Predicate<String> and = startsWithA.and(endsWithV);
        
        Predicate<String> or  = startsWithA.or(endsWithV);
        
        Predicate<String> negate = startsWithA.negate();
        
        Predicate<Object> compare = Predicate.isEqual("Accept Any Type Of Objects Here"); //can give any type of object to compare eg. i used String  
        
        System.out.println(isPositiveOrZero.test(54)); // true case
        System.out.println(isPositiveOrZero.test(-54)); // false case
        
        System.out.print("\n \n");

        System.out.println(startsWithA.test("Aarnav")); // true case
        System.out.println(startsWithA.test("ZAarnav")); // false case
        
        System.out.print("\n \n");

        System.out.println(endsWithV.test("Aarnav")); // trure case
        System.out.println(endsWithV.test("AarnavL")); // false case
            
        System.out.print("\n \n");

        System.out.println(and.test("Aarnav")); // true case
        System.out.println(and.test("Aarnavs")); // false case
        
        System.out.print("\n \n");

        System.out.println(or.test("Aarnav")); // true case
        System.out.println(or.test("lAarnavk")); // false case
        
        System.out.print("\n \n");
        
        System.out.println(negate.test("faasd")); // true case
        System.out.println(negate.test("Aarnav")); //false case
        
        System.out.print("\n \n");

        System.out.println(compare.test("Accept Any Type Of Objects Here")); // test case for true
        System.out.println(compare.test("this is false case")); // test case for false
    }
    public static void main(String[] args) {
        AboutPredicate.predicateMethod(); 
    }
}

/* notes :
 * it is an funcitional interface since its sam (single abstract method) which is boolean test()
 * it does have multiple other default and static 
 * which does not affect its ability of being called functional interface
 * single most important line is :- 
 * predicate is an generic type boolean valued funcitonal interface
 */