/*
class student {
    final private int[] phone = {7,4,5,6};

    final public int[] getPhone() {
        return phone;
    }
}

public class TheArrayDought {
    public static void main(String[] args) {
        student f = new student(); 
        f.getPhone()[0] = 456; // why is this allowed while being final how can a value be changed 
                              //what manner or method is this to assign a value to array
        System.out.println(f.getPhone()[0]); //prints 7
    }
}
    ITS BASICALLY BECAUSE WERE RETURNING REFRENCE AND IT IN SIMPLIFIED MANNER LOOK LIKE TJIS :-
    int[] arr = f.getPhone();  // returns the array
    arr[0] = 456;              // modifies first element


    🔍 Explanation of final with arrays:

    final private int[] phone = {7, 4, 5, 6};
    This means:

    The reference variable phone cannot point to another array.

    But the contents (elements) of the array can still be changed.

    So, this is allowed:

    phone[0] = 456; // ✅ modifies the array's content
    But this is not allowed:

    phone = new int[]{1, 2, 3, 4}; // ❌ illegal, because 'phone' is final
    📌 So what is f.getPhone()[0] = 456; doing?
    This line:
    f.getPhone()[0] = 456;
    Calls the method getPhone() which returns a reference to the array stored in phone.
    You then access index 0 and modify it directly.
    Even though the reference phone in the student class is final, the array it points to can be changed unless you take specific steps to prevent that (see below).
💡                                                          How to prevent such changes? (Making truly immutable)
                                                             To make sure outside code cannot modify the array:

                                                             final public int[] getPhone() {
                                                                 return phone.clone(); // return a copy instead of the original
                                                             }

                                                             Or even better (read-only access):

                                                             import java.util.Arrays;
                                                             final public List<Integer> getPhone() {
                                                                 return Collections.unmodifiableList(Arrays.asList(7, 4, 5, 6));
                                                             }
                                                             ✅ Summary
                                                             Concept	Behavior
                                                             final int[] phone = {...}	You cannot reassign phone to another array.
                                                             phone[0] = 456;	✅ Allowed — you are modifying the contents, not the reference.
                                                             f.getPhone()[0] = 456;	✅ Allowed — getPhone() returns the actual array reference.
                                                             Prevent modification	Return a clone or unmodifiable copy instead of the actual array.

 */


 /*
                                THE ACTUAL USE OF FINAL KEYWORD IN ARRAYS EXAMPLE GIVEN BELLOW

                                public class Configuration {
                                    private static final String[] SERVER_SETTINGS = {"localhost", "8080", "TCP"};
                                
                                    public static String[] getServerSettings() {
                                        return SERVER_SETTINGS;
                                    }
                                
                                    public static void main(String[] args) {
                                        String[] currentSettings = Configuration.getServerSettings();
                                        System.out.println(java.util.Arrays.toString(currentSettings));
                                
                                        // Trying to reassign would cause an error if SERVER_SETTINGS was a local final variable
                                        // SERVER_SETTINGS = new String[]{"127.0.0.1", "80", "UDP"}; // Not allowed if SERVER_SETTINGS is final
                                    }
                                }
*/