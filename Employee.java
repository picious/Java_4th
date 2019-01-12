public abstract class Employee {

  private String name;
  private String vat;
  private double hours;

  public Employee(String name, String vat, double hours) {
    this.name = name;
    this.vat = vat;
    this.hours = hours;
  }

  public abstract double calculateSalary();
  public abstract void printPayrollReport();

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the vat
   */
  public String getVat() {
    return vat;
  }

  /**
   * @param vat the vat to set
   */
  public void setVat(String vat) {
    this.vat = vat;
  }

  /**
   * @return the hours
   */
  public double getHours() {
    return hours;
  }

  /**
   * @param hours the hours to set
   */
  public void setHours(double hours) {
    this.hours = hours;
  }

}