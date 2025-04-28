public class PS_Query8 {
    public static void main(String[] args) {

        // Write a Java Program to find whether an array is sorted or not
        int [] array={12,34,56,78,24,21,63,13};
        boolean isSorted=true;
        for(int i=0; i<array.length-1;i++){
            if(array[i]>array[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("yeh..Sorted Array!!!");
        }
        else{
            System.out.println("Oops..Unsorted Array!!!");
        }
    }
}
