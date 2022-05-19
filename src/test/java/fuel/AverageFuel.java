package fuel;

import org.junit.jupiter.api.Test;

public class AverageFuel {
    @Test
    public void fuelConsumption() {
        double a = 8.2;
        int b = 870;
        double c = (a * b) / 100;
        double d = 1.95;
        double roundIt = Math.round(c * 100.0) / 100.0;
        System.out.println("Fuel consumption on Opel (L): " + " " + roundIt + " " + "per 870 kilometers");
        System.out.println("Fuel costs on Opel: " + roundIt * d + " " + "euro");



    }
}
