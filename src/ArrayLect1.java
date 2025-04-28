public class ArrayLect1 {
    public static void main(String[] args){

        //There are Three main ways to declare,memory allocation
        // and initialization in Java

        // [_1_]
        /*

        int [] Marks=new int[5];
        Marks[0]=100;
        Marks[1]=200;
        Marks[2]=300;
        Marks[3]=400;
        Marks[4]=500;
        System.out.println(Marks[4]);

         */
       // Marks[5]=600;---> Throw and error array element out of boundry

        // [_2_]
        /*

        int [] Marks
        Marks=new int[5];
        Marks[0]=100;
        Marks[1]=200;
        Marks[2]=300;
        Marks[3]=400;
        Marks[4]=500;
        System.out.println(Marks[4]);

         */

        // [_3_]

        int [] Marks={100,200,300,400,500};
        int length=Marks.length;
        System.out.println(length);
        System.out.println(Marks[1]);


        String[] Students=new String[4];
        Students[0]="Neha";
        Students[1]="Nikita";
        Students[2]="Sumit";
        Students[3]="Amit";
        System.out.println(Students.length);
        System.out.println(Students[1]);

        System.out.println("_________________");

        for (int i=0; i<Marks.length; i++) {
            System.out.println(Marks[i]);
        }





    }
}
