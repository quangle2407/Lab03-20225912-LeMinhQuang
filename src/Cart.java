import java.util.ArrayList;

public class Cart {
    // Maximum number of DVDs allowed in the cart
    public static final int MAX_NUMBERS_ORDERED = 20;

    // List to store DigitalVideoDisc objects
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    // Tracks the quantity of items in the cart
    private int qtyOrdered = 0;

    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more items.");
        }
    }

    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not in the cart.");
        }
    }

    // Method to calculate the total cost of all DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    // Method to display the current cart status
    public void displayCart() {
        System.out.println("Cart contains " + qtyOrdered + " items:");
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.println(disc);
        }
        System.out.println("Total cost: " + totalCost());
    }
}