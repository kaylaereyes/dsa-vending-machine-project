import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        while (true) {
            vm.displayItems();

            System.out.println("\nEnter item number to buy (-1 to exit): ");
            int choice = input.nextInt();

            if (choice == -1) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Insert money: ");
            double money = input.nextDouble();

            vm.buyItem(choice, money);
        }

        input.close();
    }
}
