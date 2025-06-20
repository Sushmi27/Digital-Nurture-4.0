package Week1.DesignPatterns.AdapterPattern.Code;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor paypalProcessor = new PayPalAdapter();
        paypalProcessor.processPayment(1000);

        PaymentProcessor stripeProcessor = new StripeAdapter();
        stripeProcessor.processPayment(2500);
    }
}
