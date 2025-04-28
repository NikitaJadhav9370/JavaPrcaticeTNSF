package OOPs_Practice;
/*   Example No. 1!!!!!!!!!!!!
class Base{
    int x;
public void printme(){
    System.out.println("Inheritance Example!!!");
}
    public int setX(int x){
       this.x=x;
       return x;
    }
    public int getX(){
        System.out.println("I am X from Base Class " +x);
        return x;
    }
}
class Child extends Base{
    int y;

    public int getY() {
        System.out.println("I am Y from Child Class " +y);
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
*/

class Animal{
    String name;
    String color;

    public String setName(String name){
        this.name=name;
        return name;
    }
    public String getName(){
        System.out.println("Name: "+name);
        return name;
    }
    public String setColor(String color){
        this.color=color;
        return name;
    }
    public String getColor(){
        System.out.println("Color: "+color);
        return color;
    }
}
class Dog extends Animal{
    String variety;
    int quantity;

    public int getQuantity() {
        System.out.println("Quantity: "+quantity);
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getVariety() {
        System.out.println("Variety: "+variety);
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
public class Inheritance_Java {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setName("Kimmi");
        a.getName();
       Dog d=new Dog();
       d.setColor("Brown and White");
       d.getColor();
       d.setQuantity(1);
       d.getQuantity();
       d.setVariety("Dog");
       d.getVariety();


//    Base b=new Base();
//    Child c=new Child();
//    b.setX(5);
//    b.getX();
//    c.setY(10);
//    c.getY();
//    c.setX(100);
//    c.getX();
    }

}
