public class CartTest {
	public static void main(String[] args) {
		// Create a new cart
		Cart cart = new Cart();

		// Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);

		// Test the print method
		cart.displayCart();
		// Test the search method with ID
		System.out.println("Testing findDVDById:");
		cart.findDVDById(1); // Search with ID = 1
		cart.findDVDById(4); // Search DVD which doesn't exist

		// Test the search method with title keywords
		System.out.println("\nTesting findDVDByTitle:");
		cart.findDVDByTitle("Lion"); // Search with keyword "Lion"
		cart.findDVDByTitle("Science"); // Search with keyword "Science"
		cart.findDVDByTitle("Adventure"); // Search with keyword which isn't in any titles
	}

}
