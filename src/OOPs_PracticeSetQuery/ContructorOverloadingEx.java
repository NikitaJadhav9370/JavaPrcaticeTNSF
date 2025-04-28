package OOPs_PracticeSetQuery;
class RectAngle{
    private int length;
    private int breath;

    public RectAngle(){
        this.length=4;
        this.breath=6;
    }
    public RectAngle(int l,int b){
     this.length=l;
     this.breath=b;
    }
    public int printDetails(){
        System.out.println(length);
        System.out.println(breath);
        return 0;
    }
}
public class ContructorOverloadingEx {
    public static void main(String[] args) {
    RectAngle ra=new RectAngle(12,34);
    ra.printDetails();
    }
}
