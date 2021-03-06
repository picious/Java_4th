﻿import java.util.Scanner;

/**
 * Ορίστε μια κλάση, έστω PayrollRegistry, κάθε αντικείμενο της οποίας θα
 * λειτουργεί ως μητρώο των στοιχείων μισθοδοσίας των υπαλλήλων ενός
 * υποκαταστήματος της προαναφερθείσας αλυσίδας πολυκαταστημάτων
 */
public class PayrollRegistry {

  private Employee[] employees;
  private static int size = 50;
  private int counter = 0;
  private String address;
  private String city;
  private String number;

  /**
   * Πεδία για την αποθήκευση της διεύθυνσης (πόλη, δρόμος, αριθμός) του
   * υποκαταστήματος και των υπαλλήλων της (πεδίο τύπου Employee[]). Θεωρείστε ότι
   * ένα υποκατάστημα μπορεί να έχει το πολύ 50 υπαλλήλους.
   */
  // Constructor
  public PayrollRegistry(String address, String city, String number) {
    this.address = address;
    this.city = city;
    this.number = number;
    employees = new Employee[size];

  }

  /**
   * Μέθοδο addEmployee που δέχεται μέσω παραμέτρου ένα αντικείμενο-υπάλληλο και
   * τον αποθηκεύει στον πίνακα
   */
  public void addEmployee(Employee employee) {
    if (counter < size) {
      employees[counter] = employee;
      counter++;
    }
  }

  /**
   * Μέθοδο updateMothHours που δέχεται τον μήνα και το έτος ως ένα αλφαριθμητικό
   * και διασχίζει τον πίνακα ζητώντας από τον χρήστη να εισάγει από το
   * πληκτρολόγιο τις ώρες εργασίας του κάθε υπαλλήλου εμφανίζοντας το μήνυμα:
   * Δώσε τον αριθμό των ωρών για τον υπάλληλο <όνομα-υπαλλήλου>: και καλώντας τη
   * μέθοδο setHours για την ενημέρωση του αριθμού ωρών εργασίας (ή υπερωρίας).
   */
  public void updateMonthHours(String month, String year) {
    Scanner input = new Scanner(System.in);
    System.out.println("***** ΕΝΗΜΕΡΩΣΗ ΩΡΩΝ ΓΙΑ ΤΟΝ ΜΗΝΑ " + month.toUpperCase() + " " + year + " ***********" + "\n");
    for (int i = 0; i < counter; i++) {
      Employee e = employees[i];
      System.out.print("Δώσε τον αριθμό των ωρών για τον υπάλληλο " + e.getName() + " : ");
      String aReply = input.nextLine();
      e.setHours(Double.parseDouble(aReply));
    }
    System.out.println("***** ΤΕΛΟΣ ΕΝΗΜΕΡΩΣΗΣ ***********" + "\n");

  }

  /**
   * Μέθοδο printPayroll που δέχεται τον μήνα και το έτος ως ένα αλφαριθμητικό και
   * διασχίζει τον πίνακα καλώντας τη μέθοδο εκτύπωσης της κατάστασης μισθοδοσίας
   * και την κατάλληλη μέθοδο για τον μηδενισμό των ωρών για κάθε υπάλληλο.
   */
  public void printPayroll(String aMonth, String aYear) {
    System.out.println("******** ΜΙΣΘΟΔΟΣΙΑ ΓΙΑ  " + aMonth.toUpperCase() + "  " + aYear + " ***************");
    System.out.println("ΥΠΟΚΑΤΑΣΤΗΜΑ: " + city + ",  " + address + " " + number + "\n");

    for (int i = 0; i < counter; i++) {
      Employee e = employees[i];
      e.printPayrollReport();
      e.setHours(0);
    }
  }

}