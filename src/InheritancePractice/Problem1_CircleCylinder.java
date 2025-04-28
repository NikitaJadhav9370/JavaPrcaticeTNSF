package InheritancePractice;

import java.util.Scanner;

class Circle{
    public int radius;
     Circle(int r){
        this.radius=r;
     }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle{
    int height;
    Cylinder1(int r, int h){
        super(r);
        this.height=h;

    }
    public double volume1() {
        return Math.PI*this.radius*this.radius*this.height;

    }
}
public class Problem1_CircleCylinder {
    public static void main(String[] args) {
    Circle c=new Circle(2);
    Cylinder1 cy=new Cylinder1(3,4);
        System.out.println("Area of Circle is:" +c.area());
        System.out.println("Area of Circle is:" +cy.volume1());
    }

}

