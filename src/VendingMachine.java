import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    private String[] arrayCodes;
    private String[] arrayNames;
    private double[] arrayPrices;
    private int[] arrayQuantities;

    private ArrayList<Item> arrayListInventory;
    private HashMap<String, Item> hashMapInventory;

    public VendingMachine() {
        loadArrayInventory();
        loadArrayListInventory();
        loadHashMapInventory();
    }

    private void loadArrayInventory() {
        arrayCodes = new String[]{"A1", "B2", "C3"};
        arrayNames = new String[]{"Coke", "Chips", "Candy"};
        arrayPrices = new double[]{1.50, 2.00, 1.25};
        arrayQuantities = new int[]{5, 4, 6};
    }

    private void loadArrayListInventory() {
        arrayListInventory = new ArrayList<>();
        arrayListInventory.add(new Item("A1", "Coke", 1.50, 5));
        arrayListInventory.add(new Item("B2", "Chips", 2.00, 4));
        arrayListInventory.add(new Item("C3", "Candy", 1.25, 6));
    }

    private void loadHashMapInventory() {
        hashMapInventory = new HashMap<>();
        hashMapInventory.put("A1", new Item("A1", "Coke", 1.50, 5));
        hashMapInventory.put("B2", new Item("B2", "Chips", 2.00, 4));
        hashMapInventory.put("C3", new Item("C3", "Candy", 1.25, 6));
    }

    public void displayArrayInventory() {
        System.out.println("Array-Based Inventory:");
        for (int i = 0; i < arrayCodes.length; i++) {
            System.out.println(arrayCodes[i] + " - " + arrayNames[i] + " ($" +
                    String.format("%.2f", arrayPrices[i]) + ") Quantity: " + arrayQuantities[i]);
        }
    }

    public void displayArrayListInventory() {
        System.out.println("ArrayList-Based Inventory:");
        for (Item item : arrayListInventory) {
            System.out.println(item);
        }
    }

    public void displayHashMapInventory() {
        System.out.println("HashMap-Based Inventory:");
        for (Item item : hashMapInventory.values()) {
            System.out.println(item);
        }
    }

    public void buyUsingArray(String code, double payment) {
        System.out.println("\nTesting Array-Based Implementation:");
        for (int i = 0; i < arrayCodes.length; i++) {
            if (arrayCodes[i].equalsIgnoreCase(code)) {
                processArrayPurchase(i, payment);
                return;
            }
        }
        System.out.println("Invalid selection.");
    }

    private void processArrayPurchase(int index, double payment) {
        if (arrayQuantities[index] <= 0) {
            System.out.println(arrayNames[index] + " is out of stock.");
        } else if (payment < arrayPrices[index]) {
            System.out.println("Insufficient funds. $" +
                    String.format("%.2f", arrayPrices[index] - payment) + " more needed.");
        } else {
            arrayQuantities[index]--;
            System.out.println("Dispensing " + arrayNames[index] + "...");
            System.out.println("Change returned: $" + String.format("%.2f", payment - arrayPrices[index]));
        }
    }

    public void buyUsingArrayList(String code, double payment) {
        System.out.println("\nTesting ArrayList-Based Implementation:");
        for (Item item : arrayListInventory) {
            if (item.getCode().equalsIgnoreCase(code)) {
                processItemPurchase(item, payment);
                return;
            }
        }
        System.out.println("Invalid selection.");
    }

    public void buyUsingHashMap(String code, double payment) {
        System.out.println("\nTesting HashMap-Based Implementation:");
        Item item = hashMapInventory.get(code.toUpperCase());

        if (item == null) {
            System.out.println("Invalid selection.");
        } else {
            processItemPurchase(item, payment);
        }
    }

    private void processItemPurchase(Item item, double payment) {
        if (!item.isAvailable()) {
            System.out.println(item.getName() + " is out of stock.");
        } else if (payment < item.getPrice()) {
            System.out.println("Insufficient funds. $" +
                    String.format("%.2f", item.getPrice() - payment) + " more needed.");
        } else {
            item.reduceQuantity();
            System.out.println("Dispensing " + item.getName() + "...");
            System.out.println("Change returned: $" + String.format("%.2f", payment - item.getPrice()));
        }
    }
}
