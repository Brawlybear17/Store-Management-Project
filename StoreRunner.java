public class StoreRunner {
  public static void main(String[] args) {

    // Create snack objects
    Chips chips1 = new Chips("Hot Cheetos", 1.75, true);
    Candy candy1 = new Candy("Skittles", 1.25, false);
    Nuts nuts1 = new Nuts("Almonds", 2.50, true);

    // Test Chips
    System.out.println(chips1.getPrice());
    System.out.println(chips1.getName());
    chips1.setSpicyStatus(false);
    System.out.println(chips1.getSpicyStatus());
    System.out.println(chips1);

    System.out.println();

    // Test Candy
    System.out.println(candy1.getPrice());
    System.out.println(candy1.getName());
    candy1.setChocolateStatus(true);
    System.out.println(candy1.getChocolateStatus());
    System.out.println(candy1);

    System.out.println();

    // Test Nuts
    System.out.println(nuts1.getPrice());
    System.out.println(nuts1.getName());
    nuts1.setSaltedStatus(false);
    System.out.println(nuts1.getSaltedStatus());
    System.out.println(nuts1);
  }
}
