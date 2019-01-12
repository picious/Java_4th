import java.util.Scanner;
public class PayrollRegistry {

  private String[] employees;
  private int counter;

  /*
  * Πεδία για την αποθήκευση της διεύθυνσης (πόλη, δρόμος, αριθμός) του υποκαταστήματος
  * και των υπαλλήλων της (πεδίο τύπου Employee[]). 
  * Θεωρείστε ότι ένα υποκατάστημα μπορεί να έχει το πολύ 50 υπαλλήλους.
  */
  //Constructor
  public PayrollRegistry() {
    employees = new String[50];
    counter = 0;

  }

/*
 * Μέθοδο addEmployee που δέχεται μέσω παραμέτρου ένα αντικείμενο-υπάλληλο 
 * και τον αποθηκεύει στον πίνακα
 */
  public void addEmployee(String employee) {
    if (counter < employees.length) {
      employees[counter] = employee;
      counter++;
    }
  }

  /*
   * Μέθοδο updateMothHours που δέχεται τον μήνα και το έτος ως ένα αλφαριθμητικό και διασχίζει τον πίνακα ζητώντας από τον χρήστη να εισάγει από το πληκτρολόγιο τις ώρες εργασίας του κάθε υπαλλήλου εμφανίζοντας το μήνυμα:
   * Δώσε τον αριθμό των ωρών για τον υπάλληλο <όνομα-υπαλλήλου>:
   * και καλώντας τη μέθοδο setHours για την ενημέρωση του αριθμού ωρών εργασίας (ή υπερωρίας).
   */
  public void updateMonthHours(Sting year, String month) {
    Scanner input = new Scanner(System.in);

    System.out.println("Δώσε τον αριθμό των ωρών για τον υπάλληλο: ");
    String aReply = input.nextLine();
    // String to int in order to make it [i] index 
    // Call setHours για ενημέρωση των ωρών εργασίας
  }
  
  /* Μέθοδο printPayroll που δέχεται τον μήνα και το έτος ως ένα αλφαριθμητικό και 
   * διασχίζει τον πίνακα καλώντας τη μέθοδο εκτύπωσης της κατάστασης μισθοδοσίας
   * και την κατάλληλη μέθοδο για τον μηδενισμό των ωρών για κάθε υπάλληλο.  
   */
  public void printPayroll() {

  }


}