package pageobject.pages;

import model.reservation.Reservation;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserInfoPage {
    private BaseFunctions baseFunctions;
    private final By AIRPORTS = By.xpath(".//span[@class = 'bTxt']");
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick = 'setLang();'] ");
    private final By RESPONSE_PRICE = By.id("response");
    private final By BOOK_BTN = By.id("book2");

    public UserInfoPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public List<WebElement> getSelectedAirports() {
return baseFunctions.findElements(AIRPORTS);
    }
    public void fillInInfoForm(Reservation reservation) {
baseFunctions.type(NAME, reservation.getFirstName());
baseFunctions.type(SURNAME, reservation.getLastName());
baseFunctions.type(DISCOUNT, reservation.getDiscount());
baseFunctions.type(ADULTS, reservation.getAdultsCount());
baseFunctions.type(CHILDREN, reservation.getChildCount());
baseFunctions.type(BAGS, reservation.getBagsCount());
baseFunctions.select(FLIGHT, reservation.getFlightDate());
    }
    public void clickGetPrice() {
        baseFunctions.click(GET_PRICE_BTN);
    }
    public String passengerName() {
        String response = baseFunctions.findElement(RESPONSE_PRICE).getText();
        return StringUtils.substringBetween(response, "Mr/Ms ", "!");
    }
 public int getPrice() {
     String response = baseFunctions.findElement(RESPONSE_PRICE).getText();
     return Integer.parseInt(StringUtils.substringBetween(response, "to  for",  " EUR"));
 }
 public void book_btn_press() {
        baseFunctions.click(BOOK_BTN);
 }
}

