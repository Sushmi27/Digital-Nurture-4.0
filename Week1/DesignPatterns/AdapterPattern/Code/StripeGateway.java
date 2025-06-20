package AdapterPattern;

public class StripeGateway {
    public void stripePay(double amount) {
        System.out.println("Payment of Rs." + amount + " processed via Stripe.");
    }
}