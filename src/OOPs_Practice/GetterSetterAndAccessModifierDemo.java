package OOPs_Practice;
class MyEmployee{
    private int id;
    private String name;

    public int setId(int i){
       id=i;
       return i;
    }
    public int getId(){
        return id;
    }
    public String setName(String n){
        name=n;
        return n;
    }
    public String getName(){
        return name;
    }
}
public class GetterSetterAndAccessModifierDemo {
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        System.out.println("ID: "+emp.setId(12));
        System.out.println("Name: "+emp.setName("Nikita"));
    }
}
