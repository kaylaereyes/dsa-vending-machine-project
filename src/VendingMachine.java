import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> items;

    public VendingMachine() {
        items = new ArrayList<>();

        // starter items
        items.add(new Item("Soda", 1.50, 5));
        items.add(new Item("Chips", 1.25, 5));
        items.add(new Item("Candy", 1.00, 5));
    }

    public void displayItems() {
        System.out.println("\n--- VENDING MACHINE ---");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println(i + ": " + item.getName()
                    + " ($" + item.getPrice() + ") - Qty: " + item.getQuantity());
        }
    }

    public void buyItem(int index, double money) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        Item item = items.get(index);

        if (item.getQuantity() == 0) {
            System.out.println("Sorry, item is out of stock.");
            return;
        }

        if (money < item.getPrice()) {
            System.out.println("Not enough money.");
            return;
        }

        item.reduceQuantity();
        double change = money - item.getPrice();

        System.out.println("You bought " + item.getName());
        System.out.println("Change: $" + String.format("%.2f", change));
    }
}
