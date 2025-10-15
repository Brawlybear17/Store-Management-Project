/**
 * The Nuts class represents Nuts at a snack store
 */
public class Nuts extends Snack {

  private boolean isSalted;

  // No-argument constructor
  public Nuts() {
    super();
    isSalted = false;
  }

  // Parameterized constructor
  public Nuts(String name, double price, boolean isSalted) {
    super(name, price);
    this.isSalted = isSalted;
  }

  //returns if salted
  public boolean getSaltedStatus() {
    return isSalted;
  }

  // sets salted status
  public void setSaltedStatus(boolean isSalted) {
    this.isSalted = isSalted;
  }

  // returns tostring for salted
  public String toString() {
    return super.toString() + (isSalted ? " - Salted" : " - Unsalted");
  }
}
