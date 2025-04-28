public class PS_Query3 {
    public static void main(String[] args) {
        // Write a program to calculate the average of an array containing
        // marks of all students on physics using for each loop

        int [] markInPhysics={89,78,67,87,88,80,78,85};
        float sum=0;
        int lengthOfArr=markInPhysics.length;
        for (int ele:markInPhysics){
            sum=sum+ele;
        }
        float average=sum/lengthOfArr;
        System.out.println("Average of marks in physics is of " +lengthOfArr +" Students is: " +average );
    }
}
