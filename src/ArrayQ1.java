public class ArrayQ1 {
    public static void main(String[] args) {
        String[] Name={"Nikita","Sumit","Neha","Amit","Pratibha","Swarupa"};
        for(int i=Name.length-1; i>=0; i--) {
            System.out.println(Name[i]);
        }
        System.out.println("____________");
        float[] mark={90.80f,45.78f,80.98f,95.70f};
            System.out.println(mark.length);

            for(float element:mark){
                System.out.println(element);
            }
    }
}
