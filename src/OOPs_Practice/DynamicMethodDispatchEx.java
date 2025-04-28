package OOPs_Practice;
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void callBy(){
        System.out.println("Call My Mother by my Phone");
    }
}
class SmartPhone extends Phone{
    public void showTime(){
        System.out.println("its 8 PM");
    }
    public void callBy(){
        System.out.println("Call my father by my Smartphone");
    }
    public void PlayMusic(){
        System.out.println("Play Music on my Smart Phone");
    }
}
public class DynamicMethodDispatchEx {
    public static void main(String[] args) {
    Phone obj=new SmartPhone();
    obj.callBy();
    obj.greet();
    }
}
