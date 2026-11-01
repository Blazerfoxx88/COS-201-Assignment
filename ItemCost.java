import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = input.nextLine();
        System.out.print("Enter price per unit: ");
        double price = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double total = price * quantity;

        System.out.println("Item: " + name);
        System.out.println("Unit price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + total);
        input.close();
    }
}
