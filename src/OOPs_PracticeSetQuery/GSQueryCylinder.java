package OOPs_PracticeSetQuery;
class Cylinder{
   private int radius;
   private int height;
   private double pi=Math.PI;
    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int r){
        this.radius=r;
    }
    public double VolumeOfCylinder(){
        double volume=pi*(radius*radius)*height;
        return volume;
    }
    public double AreaOfCylinder(){
        double area=(2*pi*radius*height)+(2*pi*(radius*radius));
        return area;
    }
}
public class GSQueryCylinder {
    public static void main(String[] args) {
Cylinder c=new Cylinder();
c.setHeight(12);
c.setRadius(9);
        System.out.println("Height is: " +c.getHeight());
        System.out.println("Radius is: " +c.getRadius());
        System.out.println("Volume of Cylinder is: "+c.VolumeOfCylinder());
        System.out.println("Area of Cylinder is: "+c.AreaOfCylinder());
    }
}
