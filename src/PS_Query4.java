public class PS_Query4 {
    public static void main(String[] args) {
        // Create a Java Program to Add two Matrix of size 2*3

        int[][] matrix1 = {{1,2,3},
                          {12,5,6}};

        int[][] matrix2 = {{0,9,13},
                          {4,23,5}};

        int[][] result = {{0,0,0},
                         {0,0,0}};
        for(int i=0; i< matrix1.length;i++){
            for(int j=0; j<matrix2[i].length; j++){
                System.out.printf("The Matrix row and Column i=%d and j=%d\n" , i, j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i=0; i< matrix1.length;i++){
            for(int j=0; j<matrix2[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println(" ");
        }


//        int [][] marks = new int[2][3];
//        int sum=0;
//        marks[0][0]=10;
//        marks[0][1]=20;
//        marks[0][2]=30;
//        marks[1][0]=40;
//        marks[1][1]=50;
//        marks[1][2]=60;
//
//        for(int i=0; i<marks.length; i++){
//            for(int j=0; j<marks[i].length; j++){
//                System.out.print(marks[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

    }
}
