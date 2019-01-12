
public class PartTimeEmployee extends Employee {

  private double wage;

  /*
   * Τα δεδομένα που θα διαχειρίζεται η κλάση PartTimeEmployee θα είναι το
   * ονοματεπώνυμο του υπαλλήλου, ο αριθμός φορολογικού μητρώου, η ωριαία
   * αποζημίωση και ο αριθμός των ωρών εργασίας στη διάρκεια ενός μήνα
   */
  public PartTimeEmployee(String name, String vat, double wage) {
    super(name, vat, 0);
    this.wage = wage;

  }

   /* Υπολογισμός και επιστροφή του συνόλου για τον τρέχοντα μήνα */
  public double calculateSalary() {
    double monthTotal = wage * getHours();
    if (monthTotal < 500) {
      return monthTotal * 1.2;
    } else {
      return monthTotal;
    }
  }

  public void printPayrollReport() {

    System.out.println("ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ ΩΡΟΜΙΣΘΙΟΥ ΥΠΑΛΛΗΛΟΥ");

    System.out.println("Ώρες εργασίας: " + getHours());
    System.out.println("Σύνολο μήνα: " + calculateSalary() + " Ευρώ");
    System.out.println("Παρατηρήσεις");
    System.out.println("Ωριαία αποζημίωση " + wage + " Ευρώ" + "\n");

  }

  // Getters and Setters
  /**
   * @return the wage
   */
  public double getWage() {
    return wage;
  }

  /**
   * @param wage the wage to set
   */
  public void setWage(double wage) {
    this.wage = wage;
  }

}