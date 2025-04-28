public class PS_Query5 {
    public static void main(String[] args) {
        //Write a Java Program to Reverse an array

        int[] array={12,34,45,67,78,89};
        int l =array.length;
        System.out.println("Real Array Before Reverse:");
        for(int element:array){
            System.out.print(element + " ");
        }
        System.out.println("\n");
        int n= Math.floorDiv(l,2);
        int temp;
        for(int i=0; i<n; i++){
            temp=array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }
        System.out.println("Reverse Array is Printed Below:");
        for(int ele:array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
