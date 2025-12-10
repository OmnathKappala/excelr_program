import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        list.add(new Employee("Alice",75000,5)); //
        list.add(new Employee("BOb",75000,5));
        list.add(new Employee("Alice",86500,5));
        list.add(new Employee("Charlie",90000,9));
        list.add(new Employee("Alpha",86500,5));
        System.out.println(list);
        Comparator<Employee>comparator;

        list.sort(
            (e1,e2)->{
                 int num=Double.compare(e2.experience,e1.experience); // descending
                 if(num==0){
                    num=Double.compare(e2.Salary,e1.Salary); // descending
                 
                 if(num==0){
                    num=e1.name.compareTo(e2.name); // ascending
                 }
                }
                return num;


        }
         
        );
        System.out.println(list);
    }
}
class Employee{
    String name;
    double Salary;
    double experience;
    public Employee(String name, double Salary, double experience) {
        this.name = name;
        this.Salary = Salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", Salary=" + Salary + ", experience=" + experience + "]\n";
    }
    
}
