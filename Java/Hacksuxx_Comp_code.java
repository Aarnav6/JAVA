class Hacksuxx_Comp_Code {
    public static void main(String[] args) {
        int[4] arry = {1,2,3,4};
        int counter=1;
        for(int i : arry) {
            if(i!= counter){
                System.out.println("False");
                break;
            }
            else{
                System.out.println("True");
            }
            counter++;
        }
    }
}