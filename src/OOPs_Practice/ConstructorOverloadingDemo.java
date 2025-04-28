package OOPs_Practice;
class EmployeeMain{
    int id;
    String name;
    int salary;

    public EmployeeMain(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public EmployeeMain(int id,String name){
        this.id=id;
        this.name=name;
    }
    public EmployeeMain(int sal){
        salary=sal;
    }
    public int getDetails(){
        System.out.println("Name: " +name);
        System.out.println("Id: " +id);
        System.out.println("Salary: "+salary);
        return id;
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        EmployeeMain emp=new EmployeeMain(12,"Nikita",4500000);
        EmployeeMain emp1=new EmployeeMain(12000);
        emp.getDetails();

        }
    }

