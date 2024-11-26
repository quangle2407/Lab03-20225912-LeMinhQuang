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
    /*
     * public void displayCart() {
     * System.out.println("Cart contains " + qtyOrdered + " items:");
     * for (DigitalVideoDisc disc : itemsOrdered) {
     * System.out.println(disc);
     * }
     * System.out.println("Total cost: " + totalCost());
     * }
     */
    /*public void displayCart() {
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


    */

public void findDVDById(int id) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getId() == id) {
                System.out.println("DVD found:");
                System.out.printf("ID: %d - Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n",
                        disc.getId(),
                        disc.getTitle(),
                        disc.getCategory(),
                        disc.getDirector(),
                        disc.getLength(),
                        disc.getCost());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void findDVDByTitle(String keywords) {
        String[] keywordArray = keywords.toLowerCase().split("\\s+"); // Convert the string of keywords into an array of
                                                                      // separate words, and split them with space
                                                                      // characters
        boolean found = false;

        System.out.println("Search results for keywords: \"" + keywords + "\":");
        for (DigitalVideoDisc disc : itemsOrdered) {
            String titleLower = disc.getTitle().toLowerCase(); // Convert the title to lowercase
            for (String keyword : keywordArray) {
                if (titleLower.contains(keyword)) {
                    System.out.printf("ID: %d - Title: %s - Category: %s - Director: %s - Length: %d - Price: %.2f $\n",
                            disc.getId(),
                            disc.getTitle(),
                            disc.getCategory(),
                            disc.getDirector(),
                            disc.getLength(),
                            disc.getCost());
                    found = true;
                    break; // Stop checking with other keywords if one has been matched
                }
            }
        }
        if (!found) {
            System.out.println("No DVD found matching the keywords: \"" + keywords + "\"");
        }
    }
}
