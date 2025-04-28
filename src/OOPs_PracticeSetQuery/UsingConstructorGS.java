package OOPs_PracticeSetQuery;
class Cylinder2{
    private int r;
    private int h;

    public Cylinder2(int rad, int hei){
        r=rad;
        h=hei;
    }
    public int getR(){
        return r;
    }
    public int getH(){
        return h;
    }
}
public class UsingConstructorGS {
    public static void main(String[] args) {
    Cylinder2 cy=new Cylinder2(12,9);
        System.out.println(cy.getH());
        System.out.println(cy.getR());
    }
}
