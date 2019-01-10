public class PartTimeEmployee extends Employee {

  private int hourlyAllowance;
  private int workingHours;

  public PartTimeEmployee(String name, String vat, int hourlyAllowance, int workingHours) {
    super(name, vat);
    this.hourlyAllowance = hourlyAllowance;
    this.workingHours = workingHours;

  }

  public void printDemo() {
    super.printDemo();
    System.out.println("extra Print " + hourlyAllowance + "  " + workingHours);

  }

}