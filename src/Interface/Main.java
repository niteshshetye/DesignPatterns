package Interface;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        float ans = calculator.calculateTax();
        System.out.println("Interface: " + ans);
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}