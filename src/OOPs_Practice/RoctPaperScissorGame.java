package OOPs_Practice;

import java.util.Random;
import java.util.Scanner;

public class RoctPaperScissorGame {
    public static void main(String[] args) {
        int rock=0;
        int paper=1;
        int scissor=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: 0 for Rock , 1 for Paper , 2 for Scissor");
        int myInput=sc.nextInt();

        Random r = new Random();
        int compInput=r.nextInt(3);

        if(myInput==compInput){
            System.out.println("Its Draw!!!!");
        }
        else if(myInput==0 && compInput==2 || myInput==1 && compInput==0 || myInput==2 && compInput==1){
            System.out.println("Yeh, You Win!!!!");
        }else{
            System.out.println("Computer Win!!!!");
        }
        System.out.println("Computer Choice is: "+compInput);
    }
}
