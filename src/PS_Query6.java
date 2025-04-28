import java.util.Arrays;

public class PS_Query6 {
    public static void main(String[] args) {

        // Write a java program to find the maximum element from an array
        int[] marks={1,46,67,43,23,45,90,97,65};
        int max=0;
        for(int ele:marks){
            if(ele>max){
                max=ele;
            }
        }
        System.out.println("Maximum Element in an Array:" +max);
        }
    }

