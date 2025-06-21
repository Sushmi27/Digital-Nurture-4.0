package Week1.DesignPatterns.ObserverPattern.Code;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer user1 = new MobileApp("Sushmitha");
        Observer user2 = new WebApp("Krishna");

        stockMarket.registerObserver(user1);
        stockMarket.registerObserver(user2);

        stockMarket.setStock("TCS", 3545.50);
        stockMarket.setStock("INFY", 1452.75);

        stockMarket.removeObserver(user2);
        stockMarket.setStock("WIPRO", 502.00);
    }
}
