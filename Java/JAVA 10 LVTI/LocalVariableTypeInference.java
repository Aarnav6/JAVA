public class LocalVariableTypeInference {
    private final int instanceVarriable = 51;
    public static void main(String[] args) {
        var a = 89;
        var b = 10;
        var c = a+b;
        System.out.println("var c = " + c);


        // var arr = {10,20,30,40,50}; this does not work with var
        var arr = new int[]{10,20,30,40,50}; // this is allowed
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n"); // to print next line after loop


        var obj = new LocalVariableTypeInference();
        System.out.println("instanceVarriable = " + obj.instanceVarriable);
    }
}
/*
 * IMPORTANT NOTE 1 :-
 *      only use var in local variables ,
 *      it cant be an static or instance variable (class - level variable)
 *      var can be used as he local variable name like int var = 5;
 *      it does not give error
 *          
 * IMPORTANT NOTE 2 :-
 *      class can never be named as var
 *      also others like enums etc can't be named as var
 *      can't be named as var
 *  
 * NOTE 3:- 
 *      YOU CAN USE ARRAY TYPE AS VAR IN DECLARATION
 *          eg. var ob = new className();
 *      YOU CAN USE OBJECT TYPE AS VAR IN DECLARATION
 *          eg. var arr = new int[10];
 *          eg. var arr = new int[]{10,20,30}; this is allowed
 *      BUT THIS CANT BE DONE : var arr = {10,20,30}; gives error
 */