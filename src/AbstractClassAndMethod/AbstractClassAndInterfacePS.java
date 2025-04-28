package AbstractClassAndMethod;

//Example No 1 ANd 2
abstract class Pen{
    abstract void write();
    abstract  void reFill();
}
class NewPen extends Pen{
    public void write() {
        System.out.println("Writing With My Pen");
    }
    public void reFill(){
        System.out.println("ReFilling My Pen");
    }
    void changeNib() {
        System.out.println("Changing Nib");
    }
}

//Example No. 3
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface BasicAnimal{
    void eat();
}
class Human extends Monkey implements BasicAnimal{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting chwingum");
    }
    public void eat(){
        System.out.println("Eating Meal");
    }
}
public class AbstractClassAndInterfacePS {
    public static void main(String[] args) {
//       NewPen cello=new NewPen();
//        cello.reFill();
//        cello.write();
//        cello.changeNib();
        Human chiku = new Human();
        chiku.jump();
        chiku.eat();
        chiku.bite();
    }
}
