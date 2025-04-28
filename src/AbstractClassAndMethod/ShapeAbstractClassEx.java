package AbstractClassAndMethod;
abstract class Shape{
    Shape(){
        System.out.println("I Am Constructor for Different Type of Shapes..");
    }
    abstract double circle(int radius);
    abstract int square(int side);
    abstract int rectangle(int length, int breadth);
}
class Area extends Shape{
    public double circle(int radius){
       double areaC=Math.PI*radius*radius;
       return areaC;
    }
    public int square(int side){
        int areaS=side*side;
        return areaS;
    }
    public int rectangle(int length, int breadth){
        int areaR=length*breadth;
        return areaR;
    }
}
public class ShapeAbstractClassEx {
    public static void main(String[] args) {
     Area a=new Area();
        System.out.println("Area of Circle:" +a.circle(5));
        System.out.println("Area of Square:" +a.square(5));
        System.out.println("Area of Rectangle:" +a.rectangle(5,4));
    }
}
