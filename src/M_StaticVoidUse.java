import java.sql.SQLOutput;

public class M_StaticVoidUse {
     void joke(){
        System.out.println("Your are Good for yourself !!!");
    }
    static void Name(){
         String name=" Nikita!!";
        System.out.println(name);
    }

    int changeArr(int [] arr){
         arr[0]=98;
         return 0;
    }

    public static void main(String[] args) {
        M_StaticVoidUse obj=new M_StaticVoidUse();
        obj.joke();
        Name();
        int [] array={67,89,78,57,90};
    obj.changeArr(array);
        System.out.println("Array Value at 0 index is now:" + array[0]);
    }
}
