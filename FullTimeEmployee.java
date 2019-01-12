public class FullTimeEmployee extends Employee {

  private double monthlySalary;
  private double contribution;
  private double overtime;

  public FullTimeEmployee(String name, String vat, double monthlySalary) {
    super(name, vat, 0);
    this.monthlySalary = monthlySalary;
    

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
    
    System.out.println("ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ ΥΠΑΛΛΗΛΟΥ ΠΛΗΡΟΥΣ ΑΠΑΣΧΟΛΗΣΗΣ");
    System.out.println("Ονοματεπώνυμο υπαλλήλου: " + getName());
    System.out.println("Αριθμός φορολογικού μητρώου: " + getVat());
    System.out.println("Ώρες εργασίας: " + getHours());
    System.out.println("Σύνολο μήνα: " + calculateSalary() + " Ευρώ");
    System.out.println("Παρατηρήσεις");
    System.out.println("Οι ώρες εργασίας αναφέρονται σε τυχόν υπερωρίες");
    System.out.println("Μηνιαίος μισθός = " + monthlySalary + " Ευρώ");
    System.out.println("Συνεισφορά για το σωματείο υπαλλήλων = " + contribution + " Ευρώ");
    
  }



}