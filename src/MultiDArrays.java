public class MultiDArrays {
    public static void main(String[] args) {
        int[][] MultiDArr= new int[2][3];
        MultiDArr[0][0]=100;
        MultiDArr[0][1]=101;
        MultiDArr[0][2]=102;
        MultiDArr[1][0]=200;
        MultiDArr[1][1]=201;
        MultiDArr[1][2]=202;
        for(int i=0; i<MultiDArr.length; i++){
            for(int j=0; j<MultiDArr[i].length; j++){
                System.out.print(MultiDArr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
