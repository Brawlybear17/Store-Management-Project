/*
 * Snack class is the super class for sub classes
 * Represents the Snack Store
 */
public class Snack {

  private String name;
  private double price;

  // No-argument constructor
  public Snack() {
    name = "Unknown";
    price = 0.0;
  }

  // Parameterized constructor
  public Snack(String name, double price) {
    this.name = name;
    this.price = price;
  }

  //sets name
  public String getName() {
    return name;
  }

  //gets price
  public double getPrice() {
    return price;
  }

  //sets price
public void setPrice(double price) {
    this.price = price;
  }

// writes what will be printed
  public String toString() {
    return name + " ($" + price + ")";
  }
}
