// import java.util.Scanner;

// public class  String_Builder {


//     static void String_Reverse1() {
//         System.out.println("RUNNING STRING_REVERSE1()"); 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string"); 
//         String S = sc.nextLine();
//         String Str = "";
//         for (int i=S.length()-1; i>=0 ; i--)
//         {
//             Str += S.charAt(i);
//         }  
//             System.out.println(Str);
//     }

//     static void String_Palindrome() {
//         System.out.println("RUNNING STRING_PALINDROME()"); 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string"); 
//         String S = sc.nextLine();
//         String Str = "";
//         for (int i=S.length()-1; i>=0 ; i--)
//         {
//             Str = Str + S.charAt(i);
//         }  
//         if(S.compareTo(Str) == 0)
//         {
//             System.out.println("is pallindrome");
//         } else{
//             System.out.println("is not pallindrome");
//         }
//     }

//     static void String_Reverse2 () {
//         System.out.println("RUNNING STRING_REVERSE2()"); 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the string");
//         String S = sc.nextLine();
//         StringBuilder SB = new StringBuilder(S);
//         int Loop_length = SB.length() / 2 ;
//         for(int i=0 ; i<Loop_length ; i++)
//         {
//             int front = i;
//             int back = SB.length()-1-i;
//             char frontChar = SB.charAt(front);
//             char backChar = SB.charAt(back);
//             SB.setCharAt(front, backChar);
//             SB.setCharAt(back, frontChar);
//         }
//         System.out.println(SB);
//     }



//     public static void main(String args[]) {

//         // 1-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         // declaration of  String Temp_Tower = "hi";    
//         // use next for a single word user input in java
//         // use nextLine for a line user input in java
//         // string count space as well



//         // 2 concatenation means adding strings--------------------------------------------------------------------------------------------------------------------------------------------------------
//         String Fname = "Aarnav";
//         String Lname = "Sharma";
//         String Fullname = Fname + " " + Lname;
//         System.out.println(Fullname);



//         // 3 use of .length() -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         //returns length of string you can say no. of element not index so .length() gives index of the last element +
//         System.out.println(Fullname.length()); 



//         // 4 use of charAt() -------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         for (int i=0 ; i<Fullname.length() ; i++)
//         {
//             System.out.println(Fullname.charAt(i));
//         }



//         // 5 use of .compareTo()-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         // String1 > String2 : Return any +ve value 
//         // String1 = String2 : Return 0
//         // String1 < String2 : Return any -ve value
//         String A = "ZB";
//         String B = "aZ";

//         if (A.compareTo(B) == 0) {
//             System.out.println("both strings are equal");
//         }
//         else {
//             if (A.compareTo(B) > 0) {
//                 System.out.println("the string A is bigger than string B");
//                 System.out.println("which is " + A);
//             }
//             else if (A.compareTo(B) < 0) {
//                 System.out.println("the string B is bigger than string A");
//                 System.out.println("which is " + B);
//             }
//         }
        

//         // 6 use of .substring()-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//         /*
//         string.substring(begning index , ending index); 
//         if we do not give ending index it will automatically take it as the last element of string
//         String substring(int beginIndex)    --------------------------------method 1
//         String substring(int beginIndex, int endIndex) ---------------------method 2
//         beginIndex:- The starting index (inclusive), meaning the character at this position will be included.
//         endIndex:-   The ending index (exclusive), meaning the character at this position will NOT be included.
//         DOUBT CLEARED :-
//         joa .length() deta woa no. of elements hota hai and jaisai ki indexing 0 se hoti hai 
//         toa automatically last ke element ka index + 1 ban jata hai jis wjah se last element kat-ta nhi hai substring() ke exclusive ending index mein  
//         */
//         String str = "Aarnav Sharma";
//         String hold1 = str.substring(2);
//         String hold2 = str.substring(7,str.length());
//         System.out.println(hold1);
//         System.out.println(hold2);
    


//         // ================================================================STRING BUILDER============================================================
//         String strr1 = "RAISTAR";
//         StringBuilder sb = new StringBuilder(strr1); // alternate way StringBuilder sb = new StringBuilder("RAISTAR")


//         // 8 use of .chatAt from StringBuilder
//         System.out.println("currently string is "+ sb);
//         System.out.println("using sb.charAt(3) :-- "+ sb.charAt(3));

//         System.out.println("\n \n \n");

//         // 9 use of setcharAt from StringBuilder
//         System.out.println("currently string is "+ sb);
//         sb.setCharAt(0,'P'); // will overwrite the above the existing char 
//         System.out.println("using sb.setCharAt(0,'P') :-- "+ sb);

//         System.out.println("\n \n \n");

//         // 10 use of .insert from StringBuilder
//         System.out.println("currently string is "+ sb);
//         sb.insert(4,"SRE"); // whatever is in given index it will add/insert the given char just before the char at that given index 
//         System.out.println("using sb.insert(4,'SRE') :-- "+ sb);

//         System.out.println("\n \n \n");
        
//         // 11 use of .delete from StringBuilder
//         // ending index is exclusive
//         System.out.println("currently string is "+ sb);
//         sb.delete(2, 5);
//         System.out.println("using sb.delete(2, 5) :-- "+ sb);//ending index is exclusive
        
//         System.out.println("\n \n \n");
        
//         // 11 use of .append from StringBuilder
//         System.out.println("currently string is "+ sb);
//         System.out.println("using sb.append(can be char or a string) :-- "+ sb);
//         sb.append(' ');
//         sb.append('i');
//         sb.append('s');
//         sb.append(' ');
//         sb.append('G');
//         sb.append('.');
//         sb.append('O');
//         sb.append('.');
//         sb.append('A');
//         sb.append('.');
//         sb.append('T');
//         System.out.println(sb);
//         System.out.println("\n \n \n");
//         String_Reverse1();
//         String_Palindrome();
//         String_Reverse2();
//     }
// }