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
 // Method to add multiple DigitalVideoDiscs to the cart
    /*
     * public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
     * for (DigitalVideoDisc disc : dvdList) {
     * if (qtyOrdered < MAX_NUMBERS_ORDERED) {
     * itemsOrdered.add(disc);
     * qtyOrdered++;
     * System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
     * } else {
     * System.out.println("The cart is full. Cannot add the disc \"" +
     * disc.getTitle() + "\".");
     * break;
     * }
     * }
     * }
     */

    // Method to add an arbitrary number of DigitalVideoDiscs
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(disc);
                qtyOrdered++;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
            } else {
                System.out.println("The cart is full. Cannot add the disc \"" + disc.getTitle() + "\".");
                break; // Stop adding more discs since the cart is full
            }
        }
    }

    // Method to add 2 DigitalVideoDiscs to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(dvd1);
            qtyOrdered++;
            System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is almost full. Cannot add more items.");
        }
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(dvd2);
            qtyOrdered++;
            System.out.println("The disc \"" + dvd2.getTitle() + "\" has been added.");
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
    /*
     * public void displayCart() {
     * System.out.println("Cart contains " + qtyOrdered + " items:");
     * for (DigitalVideoDisc disc : itemsOrdered) {
     * System.out.println(disc);
     * }
     * System.out.println("Total cost: " + totalCost());
     * }
     */
    public void displayCart() {
        System.out.println("Cart contains " + qtyOrdered + " items:");
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.println(disc);
            System.out.printf("%d. DVD - %s - %s - %s - %d: %.2f $\n",
                    index++,
                    disc.getTitle(),
                    disc.getCategory(),
                    disc.getDirector(),
                    disc.getLength(),
                    disc.getCost());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.printf("Total cost: %.2f\n", totalCost());
        System.out.println("****************************************************");
    }

}