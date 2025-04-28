package AbstractClassAndMethod;
interface Bicycle{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void bowHornTruck();
    void bowHornScooty();
}
class AtlasBicycle implements Bicycle,Horn{
    int speed=5;
    public void applyBreak(int decrement) {
      speed=speed-decrement;
        System.out.println(speed);
    }
    public void speedUp(int increment){
        this.speed=speed+increment;
        System.out.println(speed);
    }
    public void bowHornTruck(){
        System.out.println("Poo Poo Poo.....");
    };
    public void bowHornScooty(){
        System.out.println("Pi Pi Pi.....");

    };
}
public class InterfaceInAbstractClassEx {
    public static void main(String[] args) {
       AtlasBicycle a=new AtlasBicycle();
       a.applyBreak(2);
       a.speedUp(3);
       a.bowHornTruck();
       a.bowHornScooty();
    }
}
