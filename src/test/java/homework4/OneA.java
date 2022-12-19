package homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OneA {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final String CATALOG_URL = "https://www.1a.lv/c/auto-un-moto-preces/riepas/ziemas-riepas/3ev";
    private final String MENU_ITEM_TO_OPEN = "Auto un moto preces";
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]");
    private final By MENU = By.xpath(".//div[@class = 'submenu-lvl1 submenu-lvl1--invisible submenu-lvl1--index']");
    private final By CATALOG_ITEM = By.xpath(".//div[contains(@class, 'catalog-taxons-product--grid-view')] ");
    private final By CATALOG_ITEM_NAME = By.xpath(".//a[@class = 'catalog-taxons-product__name']");
    private final By PRICE = By.xpath(".//span[@class='product-price-details__price-number']");
    private WebDriver browser;

    @BeforeEach
    public void general() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();
    }

    @Test
    public void menuOneA() {
        List<WebElement> menuItems = browser.findElement(MENU).findElements(MENU_ITEM);

        for (WebElement we : menuItems) {
            if (we.getText().equals(MENU_ITEM_TO_OPEN)) {
                we.click();
                break;
            }
        }
    }

    @Test
    public void catalogOneA() {
        List<WebElement> menuItems = browser.findElement(MENU).findElements(MENU_ITEM);
        browser.get(CATALOG_URL);

        List<WebElement> catalogItems = browser.findElements(CATALOG_ITEM);

        try {
            catalogItems.get(8).click();
        } catch (ElementClickInterceptedException e) {
            catalogItems.get(8).click();
        }
        catalogItems.get(8).findElement(CATALOG_ITEM_NAME).click();
        System.out.println(browser.findElement(PRICE).getText());
    }
}