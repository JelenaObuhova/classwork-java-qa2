package fuel;

import org.junit.jupiter.api.Test;

import java.util.Scanner;


public class MilesPerGallon {
    @Test
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Miles travelled : ");
        double miles = scan.nextDouble();
        System.out.println("Gallons : ");
        double gallons = scan.nextDouble();
        System.out.println("miles per gallons = " + distance(miles, gallons));
    }

    static double distance(double m, double g) {
        return m / g;
    }
}


