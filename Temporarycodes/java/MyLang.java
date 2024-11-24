import java.util.Scanner;
class MyLang {

    final private static Scanner sc = new Scanner(System.in);

    private static String Arry[];

    public static String[] getArray() {
        System.out.print("enter the number of words:- ");
        int Size = sc.nextInt();
        sc.nextLine(); // Clear Input Buffer
        Arry = new String[Size];
        System.out.println("Enter Your Text bellow:-");
        for(int i=0 ; i<Arry.length ; i++) {
        Arry[i] = sc.nextLine();
        }
        return Arry;
    }

    public static void coderL1 () {
        for(int i=0 ; i<Arry.length ; i++) {
            //takes string to string builder
            StringBuilder sb = new StringBuilder(Arry[i]);
            //loop for coderl1 to swap change order
            for(int j=0 ; j<sb.length()/2 ; j++) {
                //holdin index's
                int BeginingIndex=j;
                int EndingIndex = sb.length()-1-j;
                //holding char WRT thier index's
                char firstChar = sb.charAt(BeginingIndex);
                char lastChar = sb.charAt(EndingIndex);
                // swapping
                sb.setCharAt(BeginingIndex,lastChar);
                sb.setCharAt(EndingIndex, firstChar);
            }
            if(i==0){
            System.out.print("coded message:- " + sb + " "); // prinitng string builder
            }
            else{
                System.out.print(sb + " ");
            }
        }
    }
    public static void main(String[] args) {
        getArray();
        coderL1();
    }
}