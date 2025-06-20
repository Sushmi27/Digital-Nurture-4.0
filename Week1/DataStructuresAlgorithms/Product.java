package Week1.DataStructuresAlgorithms;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: ₹" + price);
    }
}