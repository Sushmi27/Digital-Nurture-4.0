package Week1.DesignPatterns.StrategyPattern.Code;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.executePayment(2500.00);

        context.setStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(1500.00);
    }
}