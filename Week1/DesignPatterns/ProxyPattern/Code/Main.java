package Week1.DesignPatterns.ProxyPattern.Code;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        System.out.println("Accessing image1 for the first time:");
        image1.display();

        System.out.println("\nAccessing image1 again:");
        image1.display();

        System.out.println("\nAccessing image2 for the first time:");
        image2.display();
    }
}
