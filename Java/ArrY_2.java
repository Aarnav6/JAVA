class ArrY2 {

    public static int arry[] = new int [5];
    public static int arry1[] = arry; //refrenced or refrencing wowwwwwwwwwwwwwwwWWWWWWWWWWWW!!!!!
    public static int[] F1 () {
        return arry;
    }

    public static void main(String args[])
    {
        ArrY2.arry1[1]=5;
        System.out.println(F1()[1]);
    }
}