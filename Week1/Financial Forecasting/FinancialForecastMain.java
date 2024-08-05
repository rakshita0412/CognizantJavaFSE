package Ex7;

public class Main {
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();
        double currentValue = 25000;
        double growthRate = 0.09; // 5%
        int years = 15;

        double futureValue = forecast.forecastValue(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
