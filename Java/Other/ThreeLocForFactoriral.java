public class ThreeLocForFactoriral {
    public static void main(String[] args) {
        int i=1, f=1;
        for(;i<=5;f*=i,i++);
        System.out.println(f);
    }
}
/*
    //  in c language we can just do
    //  just replace n with the value of which we need factorial
    int i=1, f=1;
    for(;i<=n;f*=i,i++);
    printf(f);

*/
 