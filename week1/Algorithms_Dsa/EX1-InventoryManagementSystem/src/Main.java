public class Main{
     public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        // Add Products
        manager.add(
                new Product(101, "Laptop", 10, 50000));
        manager.add(
                new Product(102, "Mobile", 20, 20000));
        manager.add(
                new Product(103, "Keyboard", 50, 1000));

        System.out.println("\nAll Products:");
        manager.display();

        // Update Product
        System.out.println("\nUpdating Product...");
        manager.update(101, 15, 55000);

        // Delete Product
        System.out.println("\nDeleting Product...");
        manager.delete(102);

        System.out.println("\nUpdated Inventory:");
        manager.display();
    }
}