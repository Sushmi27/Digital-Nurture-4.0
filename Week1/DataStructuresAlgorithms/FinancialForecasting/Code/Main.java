package Week1.DataStructuresAlgorithms.FinancialForecasting.Code;

public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue = FinancialCalculator.calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
