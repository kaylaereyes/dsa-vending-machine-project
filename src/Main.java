public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        System.out.println("===== TEAM PROJECT: VENDING MACHINE SIMULATION =====\n");

        vendingMachine.displayArrayInventory();
        vendingMachine.buyUsingArray("A1", 2.00);

        System.out.println();

        vendingMachine.displayArrayListInventory();
        vendingMachine.buyUsingArrayList("B2", 2.50);

        System.out.println();

        vendingMachine.displayHashMapInventory();
        vendingMachine.buyUsingHashMap("C3", 2.00);

        System.out.println("\n===== ADDITIONAL TEST CASES =====");

        vendingMachine.buyUsingArray("Z9", 5.00);
        vendingMachine.buyUsingArrayList("A1", 1.00);
        vendingMachine.buyUsingHashMap("B2", 1.00);

        System.out.println("\nProgram completed successfully.");
    }
}
