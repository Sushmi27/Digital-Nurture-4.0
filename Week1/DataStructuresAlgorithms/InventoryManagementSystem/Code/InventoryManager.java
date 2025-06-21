package Week1.DataStructuresAlgorithms.InventoryManagementSystem.Code;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added.");
    }

    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayAll() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        for (Product p : inventory.values()) {
            p.display();
        }
    }
}