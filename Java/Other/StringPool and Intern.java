/*
1. Background: Why String Pool and Interning Matter
In Java, Strings are immutable—once created, their value cannot be changed. This immutability allows Java to optimize memory by sharing identical string instances instead of creating duplicates.

Without such optimization, each occurrence of "hello" would create a new String object, leading to unnecessary memory use. This is where String Pool and String Interning become important.
2. What is the String Pool?
The String Pool (or String Constant Pool) is a special memory area in the Java heap for storing String literals and interned strings.

When you declare:
String s1 = "hello";
The JVM checks the pool:
- If "hello" exists, s1 points to the existing object.
- If not, it adds "hello" to the pool.

Why?
- To save memory by reusing existing strings.
- To improve performance by avoiding repeated object creation.
3. String Literals vs String Objects
String Literal:
- Created by assigning a value in double quotes.
- Stored directly in the String Pool.
Example:
String a = "Java";
String b = "Java";
System.out.println(a == b); // true

String Object (new keyword):
- Created using new String("...");
- Stored on the heap, not pooled unless explicitly interned.
Example:
String c = new String("Java");
System.out.println(a == c); // false
4. What is String Interning?
Interning means explicitly adding a string to the pool using the intern() method:
String s1 = new String("hello");
String s2 = s1.intern();

The intern() method:
- Returns the existing reference from the pool if available.
- Otherwise, adds the string to the pool and returns the new reference.

Why use intern()?
- Saves memory by reusing common strings.
- Enables faster equality checks using ==.

Example:
String s1 = new String("hello");
String s2 = "hello";
System.out.println(s1 == s2);          // false
System.out.println(s1.intern() == s2); // true
5. How Does the String Pool Work Internally?
- Implemented as a hash table in the JVM.
- On creation or interning, the string's hash code is computed and checked in the pool.
- Hash collisions are handled via chaining or buckets.
- Lookup is efficient due to hashing.
6. Where is the String Pool Stored?
- Before Java 7: Stored in PermGen space.
- Java 7+: Moved to the heap, making it eligible for garbage collection and avoiding PermGen overflows.
7. Memory and Performance Implications
Pros:
- Reduces duplicate String objects.
- Saves heap memory.
- Allows faster == comparisons for interned strings.

Cons:
- Interning a large number of unique strings can increase GC pressure.
- Best used when many identical strings are expected.
8. Code Example and Memory Visualization
public class StringPoolExample {
public static void main(String[] args) {
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");
String s4 = s3.intern();

System.out.println(s1 == s2); // true
System.out.println(s1 == s3); // false
System.out.println(s1 == s4); // true
}
}

Memory Table:
Object   | Location    | Notes
-------- | ----------- | -----------------------------
"hello" | String Pool | Created once
s1      | Reference   | Points to pool "hello"
s2      | Reference   | Points to pool "hello"
s3      | Heap Object | New object (not in pool)
s4      | Reference   | Interned, points to pool
9. Advanced Concepts
Interning and Substrings:
- Pre-Java 7: Substrings shared original char array, causing memory issues.
- Java 7+: Substrings have independent arrays.

Class Loaders and String Pool:
- String Pool is per JVM instance.
- Class loaders can cause duplicate pooled strings.

When to use intern():
- When expecting many repeated strings (e.g., tokens, keys).
- When optimizing for == comparisons.
10. Summary
Concept             | Description
-------------------|----------------------------------
String Pool        | Special memory area for literals
String Literal     | Automatically pooled
new String Object  | Heap object, not pooled
intern() Method    | Adds string to pool or returns existing
Benefits           | Memory savings, faster comparisons
Risks              | Overuse can pressure garbage collector
*/