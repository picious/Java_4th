import java.util.ArrayList;

public class PayrollRegistry {

  public static void main(String[] args) {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    employees.add(new Employee("John", "1211"));
    employees.add(new Employee("John2", "2222"));
    employees.add(new Employee("John3", "3333"));
    employees.add(new FullTimeEmployee("John4", "3333", 222, 333));

    for (int i = 0; i < employees.size(); i++)
      employees.get(i).printDemo();

  }

}