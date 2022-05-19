package homework2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizAir {
    private final String HOME_PAGE = "http://www.qaguru.lv:8089/tickets/step2.php?afrom=CPT&bfrom=BCN";
    private final By YOUR_NAME = By.id("name");
    private final By YOUR_SURNAME = By.id("surname");
    private final By DISCOUNT_CODE = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By LUGGAGE = By.id("bugs");
    private final By FLIGHTS = By.id("flight");
    private final By DATE = By.id("flight");
    private final By GET_PRICE = By.xpath(".//span[@onclick = 'setLang();']");

    @Test
    public void fillingInFields() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);

        WebElement nameField = browser.findElement(YOUR_NAME);
        nameField.sendKeys("Jelena");
        nameField.sendKeys(Keys.ENTER);

        WebElement surnameField = browser.findElement(YOUR_SURNAME);
        surnameField.sendKeys("Obuhova");
        surnameField.sendKeys(Keys.ENTER);

        WebElement discountField = browser.findElement(DISCOUNT_CODE);
        discountField.sendKeys("QaGuruBest");
        discountField.sendKeys(Keys.ENTER);

        WebElement numberOfPeople = browser.findElement(ADULTS);
        numberOfPeople.sendKeys("2");
        numberOfPeople.sendKeys(Keys.ENTER);

        WebElement numberOfChildren = browser.findElement(CHILDREN);
        numberOfChildren.sendKeys("0");
        numberOfChildren.sendKeys(Keys.ENTER);

        WebElement luggageField = browser.findElement(LUGGAGE);
        luggageField.sendKeys("1");
        luggageField.sendKeys(Keys.ENTER);

        WebElement selectFlight = browser.findElement(FLIGHTS);
        selectFlight.click();

        Select dateSelect = new Select(browser.findElement(DATE));
        dateSelect.selectByIndex(4);

        WebElement getPrice = browser.findElement(GET_PRICE);
        getPrice.click();


    }
}
