public class FullTimeEmployee extends Employee {

  private double monthlySalary;
  private double contribution;
  private double overtime;

  public FullTimeEmployee(String name, String vat, double hours, double monthlySalary, double contribution,
      double overtime) {
    super(name, vat, hours);
    this.monthlySalary = monthlySalary;
    this.contribution = contribution;

  }

  public double calculateSalary() {
    double monthTotal = monthlySalary * ((0.005 * getHours()) + 1);
    if (monthTotal > 1500) {
      return monthTotal = monthTotal - (monthTotal * 0.1);
    } else {
      return monthTotal;
    }
  }

  public void printPayrollReport() {
    super.printPayrollReport();
    System.out.println("ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ ΩΡΟΜΙΣΘΙΟΥ ΥΠΑΛΛΗΛΟΥ");
    System.out.println("Ονοματεπώνυμο υπαλλήλου: " + getName());
    System.out.println("Αριθμός φορολογικού μητρώου: " + getVat());
    System.out.println("Ώρες εργασίας: " + getHours());
    System.out.println("Σύνολο μήνα: " + (fullTimeEmployee.calculateSalary()) + " Ευρώ");
    System.out.println("Παρατηρήσεις");
    System.out.println("Ωριαία αποζημίωση" + wage + " Ευρώ");

  }

}