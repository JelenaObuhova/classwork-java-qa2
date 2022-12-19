package homework1;

import org.junit.jupiter.api.Test;

public class Deduction {
    @Test
    public void objects() {
        Car opel = new Car();
        opel.setBrand("Opel");
        opel.setModel("Signum");
        opel.setEngine(" 3.0 cdti");
        opel.setConsumption("8.2 l");
        opel.setFuelTank("60 l");
        opel.setFuel("diesel");

        Car subaru = new Car();
        subaru.setBrand("Subaru");
        subaru.setModel("XV");
        subaru.setEngine("1.6");
        subaru.setConsumption("7.9 l");
        subaru.setFuelTank("60 l");
        subaru.setFuel("petrol");

        Car mitsubishi = new Car();
        mitsubishi.setBrand("Mitsubishi");
        mitsubishi.setModel("Eclipse");
        mitsubishi.setEngine("2.4");
        mitsubishi.setConsumption("7.0 l");
        mitsubishi.setFuelTank("60 l");
        mitsubishi.setFuel("petrol");

        System.out.println(opel.getBrand() + " " + opel.getModel() + ';' + " " + "Engine:"  + opel.getEngine() + ';' + " " +"Average fuel consumption: " + opel.getConsumption() + ';' + " " + opel.getFuel() + ';' + " " + "Fuel tank size: "+ opel.getFuelTank());
        System.out.println(subaru.getBrand() + " " + subaru.getModel() + ';' + " " + "Engine: " + subaru.getEngine() + ';' + " " +"Average fuel consumption: " + subaru.getConsumption() +';' + " " + subaru.getFuel() + ';' + " " +"Fuel tank size: " + subaru.getFuelTank());
        System.out.println(mitsubishi.getBrand() + " " + mitsubishi.getModel() +';' + " " + "Engine: " + mitsubishi.getEngine() + ';' + " "+"Average fuel consumption: " + mitsubishi.getConsumption() +';' + " " + mitsubishi.getFuel() +';' + " " +"Fuel tank size: " + mitsubishi.getFuelTank());

        Train express = new Train();
        express.setTrainNumber(23660);
        express.setTrainDirection("Skulte");
        express.setFuel("diesel");

        Train usual = new Train();
        usual.setTrainNumber(67530);
        usual.setTrainDirection("Valga");
        usual.setFuel("diesel");

        System.out.println("Train Nr: " + express.getTrainNumber()+ ';' + " " + "The final stop: " + express.getTrainDirection()+';' + " " + "Fuel type: " + express.getFuel());
        System.out.println("Train Nr: " + usual.getTrainNumber()+';' + " "+ "The final stop: " + usual.getTrainDirection()+';' + " "+ "Fuel type:" + usual.getFuel());

    }
}
