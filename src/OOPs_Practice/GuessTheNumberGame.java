package OOPs_Practice;

import java.util.Random;
import java.util.Scanner;
 class GuessGame{
     public int number;
     public int inputNum;
     public int noOfGuess=0;

     public int getNoOfGuess(){
         return noOfGuess;
     }

     public void setNoOfGuess(int noOfGuess) {
         this.noOfGuess = noOfGuess;
     }
     GuessGame(){
         Random r=new Random();
         this.number=r.nextInt(100);
     }
     int takeUserInput(){
         System.out.println("Guess the Number...");
         Scanner sc=new Scanner(System.in);
         inputNum = sc.nextInt();
         return inputNum;
     }
     boolean inCorrectNum(){
         noOfGuess++;
         if(inputNum==number){
             System.out.format("Yes you guessed it correct!!, it was %d\nyou guessed it in %d attempts \n", number,noOfGuess);
             return true;
         }
         else if(inputNum<number){
             System.out.println("Number is too low!!!");
         }
         else {
             System.out.println("Number is too High!!!");
         }
         return false;
     }
 }

public class GuessTheNumberGame {
    public static void main(String[] args) {
        GuessGame game=new GuessGame();
        boolean b=false;
        while (!b) {
            game.takeUserInput();
            b = game.inCorrectNum();
            System.out.println(b);
        }
    }
}
