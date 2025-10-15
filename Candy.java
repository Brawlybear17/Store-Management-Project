/**
 * The Candy class represents a candy snack
 */
public class Candy extends Snack {

  private boolean isChocolate;

  // No-argument constructor
  public Candy() {
    super();
    isChocolate = false;
  }

  // Parameterized constructor
  public Candy(String name, double price, boolean isChocolate) {
    super(name, price);
    this.isChocolate = isChocolate;
  }

  // returns if chocolate
  public boolean getChocolateStatus() {
    return isChocolate;
  }

  // sets chocolate
  public void setChocolateStatus(boolean isChocolate) {
    this.isChocolate = isChocolate;
  }

  // returns super to string
  public String toString() {
    return super.toString() + (isChocolate ? " - Chocolate" : " - Sweet");
  }
}
