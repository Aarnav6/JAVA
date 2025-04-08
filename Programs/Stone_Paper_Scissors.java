import java.util.Random;
import java.util.Scanner;
class Stone_Paper_Scissors {
    private static String comp;
    public static int check1(String in) {
        in = in.toLowerCase();
        int temp = 999;
        switch(in) {
            case "stone" ->{
                if(comp.equalsIgnoreCase("paper")){
                    temp = 0;
                }
                else if(comp.equalsIgnoreCase("scissor")){
                    temp = 1;
                }
                else if(comp.equalsIgnoreCase("stone")){
                    temp = 2;
                }
            }
            case "paper" ->{;
                if(comp.equalsIgnoreCase("paper")){
                    temp = 2;
                }
                else if(comp.equalsIgnoreCase("scissor")){
                    temp = 0;
                }
                else if(comp.equalsIgnoreCase("stone")){
                    temp = 1;
                }
            }
            case "scissor" ->{
                if(comp.equalsIgnoreCase("paper")){
                    temp = 1;
                }
                else if(comp.equalsIgnoreCase("scissor")){
                    temp = 2;
                }
                else if(comp.equalsIgnoreCase("stone")){
                    temp = 0;
                }
            }
        }
        return temp;
    }
    public static void check2 (int res) {
        switch(res) {
            case 0 -> System.out.printf("You Lose, Computer picked: %s \n",comp);
            case 1 -> System.out.printf("You Won, Computer lost by picking %s \n",comp);
            case 2 -> System.out.println("Match Draw \n");
            case 999 -> System.out.println("Wrong Input String \n");
        }
    }
    public static void compIntialisor() {
        Random random = new Random();
        String arr[] = {"STONE","PAPER","SCISSOR"};
        comp = arr[random.nextInt(arr.length-1)];
        }
    public static void Executor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter No. of Rounds: ");
        int iteration = sc.nextInt();
        for(int i=0 ; i<iteration ; i++) {
            System.out.print("enter your move: ");
            String input = sc.next();
            compIntialisor();
            int result = check1(input);
            check2(result);
        }
        sc.close();
    }
    public static void main(String[] args) {
        Stone_Paper_Scissors.Executor();
        }
}