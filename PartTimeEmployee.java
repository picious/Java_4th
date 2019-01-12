
public class PartTimeEmployee extends Employee {

  private double wage;

  public PartTimeEmployee(String name, String vat, double hours, double wage) {
    super(name, vat, hours);
    this.wage = wage;

  }

  public double calculateSalary() {
    double monthTotal = wage * getHours();
    if (monthTotal < 500) {
      return monthTotal * 1.2;
    } else {
      return monthTotal;
    }
  }

  public void printPayrollReport() {
    super.printPayrollReport();
    System.out.println("ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ ΩΡΟΜΙΣΘΙΟΥ ΥΠΑΛΛΗΛΟΥ");
    System.out.println("Ονοματεπώνυμο υπαλλήλου: " + getName());
    System.out.println("Αριθμός φορολογικού μητρώου: " + getVat());
    System.out.println("Ώρες εργασίας: " + getHours);
    System.out.println("Σύνολο μήνα: " + calculateSalary() + " Ευρώ");
    System.out.println("Παρατηρήσεις");
    System.out.println("Ωριαία αποζημίωση" + wage + " Ευρώ");

  }

  // Getters and Setters
  /**
   * @return the wage
   */
  public int getWage() {
    return wage;
  }

  /**
   * @param wage the wage to set
   */
  public void setWage(int wage) {
    this.wage = wage;
  }

}