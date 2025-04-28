import java.util.Scanner;

public class PS_MethodForPattern {
//    *
//    *  *
//    *  *  *
//    *  *  *  *


//    static int pattern1(int n){
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//       }
//
//        return 0;
//                }


    // Problem Number 2: * * * *
//                   * * *
//                   * *
//                   *
//
//    static int pattern2(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    static int recFunSum(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + recFunSum(n - 1);
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int N = sc.nextInt();
        System.out.println(recFunSum(N));
    }
}



