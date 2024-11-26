
public class Aims {

	public Aims() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		// Display the cart before removal
        System.out.println("\n--- Cart before removing a disc ---");
        anOrder.displayCart();

        // Test removing an existing DVD (Star Wars)
        System.out.println("\nTrying to remove 'Star Wars'...");
        anOrder.removeDigitalVideoDisc(dvd2);

        // Display the cart after removing the DVD
        System.out.println("\n--- Cart after removing 'Star Wars' ---");
        anOrder.displayCart();

        // Test removing a non-existent DVD (should display a message)
        System.out.println("\nTrying to remove 'Star Wars' again...");
        anOrder.removeDigitalVideoDisc(dvd2);
	}

}