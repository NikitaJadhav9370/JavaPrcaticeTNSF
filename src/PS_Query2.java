import java.util.Scanner;
public class PS_Query2 {
    public static void main(String[] args) {
        // Write a program to find out whether a given
        // integer is present in an array or not
        Scanner sc=new Scanner(System.in);
        int[] marks={12,23,34,45,56,78,90,35,86,37};
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        boolean isInArray = false;

        for(int ele:marks){
            if(num==ele){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Yes!! Element Present in Array..");
            }
        else{
            System.out.println("Sorry!! Element is Not Present in Array..");

            }

    }
}
