package OOPs_Practice;
class Employee{
    int age;
    int salary;
    String name;
     void getDetails(){
         System.out.println("Employee Name:" +name);
         System.out.println("Employee Age:" +age);
         System.out.println("Employee Salary:" +salary);
         System.out.println("_____________________________________________________");
     }
}
public class CustomClassDemo {
    public static void main(String[] args) {
        System.out.println("Here is Result for Custome Class Object");
        System.out.println("_____________________________________________________");
        Employee n=new Employee();
        Employee a=new Employee();
        n.name="Nikita";
        n.age=21;
        n.salary=450000;
        a.name="Amit";
        a.age=15;
        a.salary=120000;
        n.getDetails();
        a.getDetails();
    }

}
