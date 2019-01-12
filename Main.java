public class Main {

  public static void main(String[] args) {

    PayrollRegistry branch1 = new PayrollRegistry("Εγνατία", "Θεσσαλονίκη", "120");
    branch1.addEmployee(new PartTimeEmployee("Νικολάου Γιώργος", "067832710", 5));
    branch1.addEmployee(new FullTimeEmployee("Μανδέλης Γιώργος", "067832711", 1300));

    branch1.updateMonthHours("Δεκεμβριος", "2018");
    branch1.printPayroll("Δεκεμβριος", "2018");
  }

}