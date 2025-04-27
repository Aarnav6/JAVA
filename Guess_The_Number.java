import java.util.Random;
import java.util.Scanner;
class Game {
    private int RandomNum;
    private int UserGuess;
    private int nTurn; 
    private boolean set = false;
    final Scanner sc = new Scanner(System.in);
    public void NumGenrator () {
        Random rand = new Random();
        this.RandomNum = rand.nextInt(0,100);
    }
    public void TakeInput() {
        System.out.print("Take a Guess: ");
        this.UserGuess = sc.nextInt();
    }
    public void Check () {
        if(RandomNum == UserGuess) {
            System.out.format("you guessed it right , it took you %d Turns",nTurn+1);
           this.set = true;
        }
        else if (RandomNum > UserGuess) {
            System.out.println("your guess is too Low");
            this.set = false;
        }
        else if(RandomNum < UserGuess) {
            System.out.println("your guess is too High");
            this.set = false;
        }
    }
    public void Execute() {
        NumGenrator();
        do{
            TakeInput();
            Check();
            this.nTurn++;
        } // using do while loop since TakeInput and NumGenrator needs to run so that while Check run intialising the value of set to verify win or loose by the set varriable
        while(!this.set);
    }
    public void GameRule(){
        System.out.println("\\uD83D\\uDE00 Welcome To Our Game \uD83D\uDE00");
        System.out.println("\u2B50 Pick a Random Number between 0 to 100 \u2B50");
        System.out.println("\u2B50 if u win game will end but if dont then it will run util u guess the corect number \u2B50");
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        Game play = new Game();
        play.GameRule();
        play.Execute();
    }
}
