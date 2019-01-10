public class Employee {

  private String name;
  private String vat;

  public Employee(String name, String vat) {
    this.name = name;
    this.vat = vat;
  }

  public void printDemo() {
    System.out.println("Employee: " + name + " with vat: " + vat);

  }

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

}