public class PS_Query1 {
    public static void main(String[] args) {
        // Create an Array of 5 float and Calculate there sum
        float[] marks={1.2f,2.3f,4.5f,6.7f,8.9f};
        float sum=0;
        for (float element:marks){
            sum =sum+element;
        }
        System.out.println("The Value of sum is : " +sum);
    }
}
