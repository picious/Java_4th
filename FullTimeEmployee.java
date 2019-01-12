public class FullTimeEmployee extends Employee {

  private double monthlySalary;
  private double contribution;

  /**
   * Τα δεδομένα που θα διαχειρίζεται η κλάση FullTimeEmployee θα είναι το
   * ονοματεπώνυμο του υπαλλήλου, ο αριθμός φορολογικού μητρώου, ο μηνιαίος
   * μισθός, ο αριθμός των ωρών εργασίας πέραν του ωραρίου (υπερωρίες) στη
   * διάρκεια ενός μήνα και η συνεισφορά στο σωματείο υπαλλήλων.
   */
  public FullTimeEmployee(String name, String vat, double monthlySalary) {
    super(name, vat, 0);
    this.monthlySalary = monthlySalary;

  }

  /** Υπολογισμός και επιστροφή του συνόλου για τον τρέχοντα μήνα */
  public double calculateSalary() {
    double monthTotal = monthlySalary * ((0.005 * getHours()) + 1);
    if (monthTotal > 1500) {
      contribution = monthTotal * 0.1;
      return monthTotal = monthTotal - (monthTotal * 0.1);
    } else {
      return monthTotal;
    }

  }

  /** Εκτύπωση κατάσταση μισθοδοσίας */
  public void printPayrollReport() {

    System.out.println("ΚΑΤΑΣΤΑΣΗ ΜΙΣΘΟΔΟΣΙΑΣ ΥΠΑΛΛΗΛΟΥ ΠΛΗΡΟΥΣ ΑΠΑΣΧΟΛΗΣΗΣ");
    System.out.println("Ονοματεπώνυμο υπαλλήλου: " + getName());
    System.out.println("Αριθμός φορολογικού μητρώου: " + getVat());
    System.out.println("Ώρες εργασίας: " + getHours());
    System.out.println("Σύνολο μήνα: " + calculateSalary() + " Ευρώ");
    System.out.println("Παρατηρήσεις");
    System.out.println("Οι ώρες εργασίας αναφέρονται σε τυχόν υπερωρίες");
    System.out.println("Μηνιαίος μισθός = " + monthlySalary + " Ευρώ");
    System.out.println("Συνεισφορά για το σωματείο υπαλλήλων = " + contribution + " Ευρώ" + "\n");

  }

}