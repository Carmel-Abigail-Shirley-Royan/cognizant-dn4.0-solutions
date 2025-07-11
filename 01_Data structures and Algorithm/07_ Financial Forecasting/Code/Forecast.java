package forecast;

public class Forecast {

 public static double calculateFutureValue(double initialValue, double growthRate, int years) {
     if (years == 0) {
         return initialValue;
     }

     return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
 }

 public static void main(String[] args) {
     double initialValue = 10000;  
     double annualGrowthRate = 0.05;  
     int forecastYears = 5;

     double futureValue = calculateFutureValue(initialValue, annualGrowthRate, forecastYears);

     System.out.printf("Forecasted Value after %d years: ₹%.2f\n", forecastYears, futureValue);
 }
}
