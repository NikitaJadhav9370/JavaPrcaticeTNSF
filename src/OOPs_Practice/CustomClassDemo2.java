package OOPs_Practice;
import java.util.*;
class Employee2{
    int salary;
    String name;

    public int getSalary() {
        System.out.println("Salary:" +salary);
        return salary;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getName(){
        System.out.println("Name: "+name);
        return name;
    }
}
class Cellphone{
    String ring;
    String vibrate;
    String call;

    public void getCall() {
        System.out.println("Calling Her");
    }
    public void getRing(){
        System.out.println("Ringing.....");
    }
    public void getVibrate(){
        System.out.println("Vibrating...");
    }
}

class Square{
    int side;

    public int areaOfSq(){
        int area=side*side;
        System.out.println("Area Of Square: " +area);
        return area;
    }

    public int perimeterOfSq(){
        int peri=4*side;
        System.out.println("perimeter of Square: "+peri);
        return peri;
    }
}

class Rectangle{
    int length;
    int width;

    public int areaOfRect(){
        int rectArea=length*width;
        System.out.println("Area of Rectangle: "+rectArea);
        return rectArea;
    }
    public int periOfRect(){
        int rectPeri=2*(length+width);
        System.out.println("Perimeter of Rectangle: "+rectPeri);
        return rectPeri;
    }
}

class Circle {
    int radius;
    float pi = 3.14f;

    public void areaofC() {
        float areaOfCicle = pi * (radius * radius);
        System.out.println("Area of Cicle: " + areaOfCicle);
    }

    public void periOfC() {
        float PeriOfCicle = 2 * pi * radius;
        System.out.println("Perimeter of Cicle: " + PeriOfCicle);
    }
}
class Tommy{
        public void hit(){
            System.out.println("Hitting To Enemy...");
        }
        public void run(){
        System.out.println("Running Towards Enemy...");
        }
        public void fire(){
            System.out.println("Firing on Enemy...");
        }
}
public class CustomClassDemo2 {
    public static void main(String[] args) {
        System.out.println("____________________________________________");
        Employee2 emp=new Employee2();
        emp.salary=200000;
        emp.getSalary();
        emp.setName("Nikita");
        emp.getName();
        System.out.println("____________________________________________");

        Cellphone ph=new Cellphone();
        ph.getCall();
        ph.getRing();
        ph.getVibrate();
        System.out.println("____________________________________________");

        Square sq=new Square();
        sq.side=4321;
        sq.areaOfSq();
        sq.perimeterOfSq();
        System.out.println("____________________________________________");

        Rectangle rect=new Rectangle();
        rect.length=12;
        rect.width=10;
        rect.areaOfRect();
        rect.periOfRect();

        System.out.println("____________________________________________");
        Circle c=new Circle();
        c.radius=12;
        c.areaofC();
        c.periOfC();

        System.out.println("____________________________________________");
        Tommy t=new Tommy();
        t.hit();
        t.run();
        t.fire();
    }
}
