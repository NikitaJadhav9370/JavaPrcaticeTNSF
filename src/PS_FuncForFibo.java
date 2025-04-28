import java.sql.SQLOutput;
import java.util.Scanner;

public class PS_FuncForFibo {
    int fibo (int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        PS_FuncForFibo obj= new PS_FuncForFibo();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int N=s.nextInt();
        System.out.println(obj.fibo(N));
    }
}
