package pageobject.pages;

import model.reservation.Reservation;
import org.openqa.selenium.By;

public class TicketsHomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private BaseFunctions baseFunctions;

    public TicketsHomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }

    public void selectAirports(Reservation reservation) {
        baseFunctions.select(FROM, reservation.getDepartureAirport());
        baseFunctions.select(TO, reservation.getArrivalAirport());
    }
    public void pressGoBtn(){
        baseFunctions.click(GO_BTN);
    }
}
