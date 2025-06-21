package Week1.DesignPatterns.DependencyPattern.Code;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Customer ID: " + id + ", Name: " + name);
    }
}
