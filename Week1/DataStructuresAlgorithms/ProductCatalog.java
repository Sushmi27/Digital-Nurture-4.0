package Week1.DataStructuresAlgorithms;

import Week1.DataStructuresAlgorithms.EcommercePlatformSearchFunction.Code.Main;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Main.Product> productList = new ArrayList<>();

    public void addProduct(Main.Product p) {
        productList.add(p);
    }

    public void searchByName(String keyword) {
        boolean found = false;
        System.out.println("Searching by Name: " + keyword);
        for (Main.Product p : productList) {
            if (p.getName().contains(keyword.toLowerCase())) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found with name: " + keyword);
        }
    }

    public void searchByPrice(double min, double max) {
        boolean found = false;
        System.out.println("Searching by Price Range: ₹" + min + " - ₹" + max);
        for (Main.Product p : productList) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found in this price range.");
        }
    }
}