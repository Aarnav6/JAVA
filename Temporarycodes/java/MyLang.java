import java.util.Scanner;
class MyLang {

    private static Scanner sc = new Scanner(System.in);

    private static String Arry[] = new String[100];

    public static String[] getArray() {
        System.out.println("Enter Your Text Bellow:- ");
        for(int i=0 ; i<=Arry.length ; i++) {
        Arry[i] = sc.nextLine();
        }
        return Arry;
    }

    public static void coderL1 () {
        for(int i=0 ; i<Arry.length ; i++) {
            StringBuilder sb = new StringBuilder(Arry[i]);
            for(int j=0 ; j<sb.length()/2 ; j++) {
                int lastIndex = sb.length()-1;
                char first = sb.charAt(j);
                char last = sb.charAt(lastIndex-j);
                sb.setCharAt(j, first);
                sb.setCharAt(j, first);

            }   
        }
    }
}