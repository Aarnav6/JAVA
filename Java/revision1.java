
class patterns {
    public static void threeD_pyramid() {
        int n = 20;
        for (int i=1 ; i<=n ; i++) {
            ////////////////////////////////////////////////////// inner1
            for (int j=1 ; j<n-i ; j++) {
                System.out.print(" ");
            }
            ///////////////////////////////////////////////////// inner2
            for (int j=1 ; j<=i ; j++) {
                if(j==i){
                System.out.print("-");
                } else {
                System.out.print("F ");
                }
            }
            ///////////////////////////////////////////////////// inner2
            for (int j=2 ; j<=i ; j++) {
                System.out.print("-");
            }
                System.out.println();
        }
    }

    public static void butterfly() {
        int n = 5;
        int i;
        for (i=0 ; i<=n ; i++) {

            for (int j=0 ; j<=i ; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j=0 ; j<spaces ; j++) {
                System.out.print(" ");
            }
            for (int j=0 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=n ; i>=0 ; i--) {

            for (int j=0 ; j<=i ; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j=0 ; j<spaces ; j++) {
                System.out.print(" ");
            }
            for (int j=0 ; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void palindrome_numerical_pyramid () {
        int n=5;
        for (int i=1 ; i<=n ; i++) {
            for (int j=1 ; j<=n-i ; j++) {
                System.out.print("  ");
            }
            for (int j=i ; j>=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j=1 ; j<=i ; j++) {
                if (!(j==1)) {
                System.out.print(j+" ");
                }
            }
                        //or we can do this
                        // for (int j=2 ; j<=i ; j++) {
                        //     System.out.print(j+" ");
                        // }
            System.out.println();
        }
    }
}

@SuppressWarnings("unused")
class revision1 extends patterns
{
    public static void main(String args[])
    {
        patterns.threeD_pyramid();
        patterns.butterfly();
        patterns.palindrome_numerical_pyramid();
    }
}