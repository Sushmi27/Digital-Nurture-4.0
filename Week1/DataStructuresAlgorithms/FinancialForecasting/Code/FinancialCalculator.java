package Week1.DataStructuresAlgorithms.FinancialForecasting.Code;

public class FinancialCalculator {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }
}
