

class VarArgs {

    public int sum (int... arry) { // varargs symbol always fowllows with the data type of cara args
        System.out.println("running through default");
        int result = 0;
        for(int i : arry) {  // for loop which itrates over arays from i to arry
        // System.out.println(i); // basically i gives directly the values of array
            result += i;
        }
        return result;
    }
    public int sum (float x,int... arry) { // varargs symbol always fowllows with the data type of cara args
        System.out.println("running through overload 1");
        int result = 0;
        for(int i : arry) {  // for loop which itrates over arays from i to arry
        // System.out.println(i); // basically i gives directly the values of array
            result += i;
        }
        return result;
    }
    public int sum (String n ,int... arry) { // varargs symbol always fowllows with the data type of cara args
        System.out.println("running through overload 2");
        int result = 0;
        for(int i : arry) {  // for loop which itrates over arays from i to arry
        // System.out.println(i); // basically i gives directly the values of array
            result += i;
        }
        return result;
    }
    // overloading varargs can be ambgious if same type of data type in both varargs and other varriable 
    public static void main(String[] args) {
        VarArgs ob = new VarArgs();
        System.out.println(ob.sum(4,3,9999));
        System.out.println(ob.sum(2.0f,4,3,9999));
        System.out.println(ob.sum("name",4,3,9999));
    }
}

/*

// NOTE :-

// Placement: ... must directly follow the type (e.g., int...).

// Spacing: No space between the "..." and the "data type" (e.g., int... numbers).

// Position: Varargs must always be the last parameter in the method signature.

// Multiple varargs are not allowed in java since varargs are the last parameter 

// might give the ambiguity error in java if overloaded in wrong manner

*/