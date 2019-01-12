public class Main {

  public static void main(String[] args) {
    
    PayrollRegistry branch1 = new PayrollRegistry("Εγνατία", "Θεσσαλονίκη", "120");
    branch1.addEmployee(new PartTimeEmployee("Γιωργος", "123", 1000));
    branch1.addEmployee(new FullTimeEmployee("Γιωργος2", "123", 1000));


    branch1.updateMonthHours("Δεκεμβριος", "2018");
    branch1.printPayroll("Δεκεμβριος", "aYear");
  } 

}