import java.util.*;

public class StoreManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        boolean exit = false;
        do {
            System.out.println("1. Add a product");
            System.out.println("2. Remove a product");
            System.out.println("3. List all products");
            System.out.println("4. Search a product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    store.addProduct(new Product(id, name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int removeId = scanner.nextInt();
                    store.removeProduct(removeId);
                    break;
                case 3:
                    store.listAllProducts();
                    break;
                case 4:
                    System.out.print("Enter product ID: ");
                    int searchId = scanner.nextInt();
                    store.searchProduct(searchId);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (!exit);
    }
}
