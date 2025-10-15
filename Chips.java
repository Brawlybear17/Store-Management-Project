
public class Chips extends Snack {

  private boolean isSpicy;

  // No-argument constructor
  public Chips() {
    super();
    isSpicy = false;
  }

  // Parameterized constructor
  public Chips(String name, double price, boolean isSpicy) {
    super(name, price);
    this.isSpicy = isSpicy;
  }

  //returns if spicy
  public boolean getSpicyStatus() {
    return isSpicy;
  }

  // true or false for spicy
  public void setSpicyStatus(boolean isSpicy) {
    this.isSpicy = isSpicy;
  }

  // helps print for whats needed in chip section
  public String toString() {
    return super.toString() + (isSpicy ? " - Spicy" : " - Regular");
  }
}
