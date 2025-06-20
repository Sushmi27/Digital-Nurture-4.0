package Week1.DataStructuresAlgorithms.EcommercePlatformSearchFunction.Code;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(new Product(201, "iPhone 14", 79999));
        catalog.addProduct(new Product(202, "Samsung Galaxy", 69999));
        catalog.addProduct(new Product(203, "OnePlus 12", 59999));
        catalog.addProduct(new Product(204, "Realme Watch", 2999));
        catalog.addProduct(new Product(205, "Boat Earphones", 1499));

        catalog.searchByName("watch");
        catalog.searchByName("iPhone");

        catalog.searchByPrice(1000, 3000);
        catalog.searchByPrice(60000, 90000);
    }
}
