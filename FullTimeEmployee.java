public class FullTimeEmployee extends Employee {

  private double monthlySalary;
  private double contribution;

  public FullTimeEmployee(String name, String vat, double monthlySalary, double contribution) {
    super(name, vat);
    this.monthlySalary = monthlySalary;
    this.contribution = contribution;

  }

  public void printDemo() {
    super.printDemo();
    System.out.println("extra Print " + getName() + " " + monthlySalary + "  " + contribution);

  }

}