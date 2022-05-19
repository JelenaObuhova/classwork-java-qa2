package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopTest {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final By SEARCH_INPUT_FIELD = By.id("q");
    private final By PRODUCT_TYPE = By.xpath(".//span[@class = 'single-title']");

    @Test
    public void searchFieldsCheck() {
        System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE_URL);

        WebElement searchField = browser.findElement(SEARCH_INPUT_FIELD);
        searchField.sendKeys("Apple");
        searchField.sendKeys(Keys.ENTER);
    }
}


//*[@id="landing-apple"]/div[3]/div[2]/div[1]/div[1]/span
//Absolute path:
//Earth/Europe/Latvia/Riga/Center/Valdemara38/406-4
//html/body/div[5]/div[7]/.......span

//Relative path:
//Center/Valdemara38/406-4



//Xpath:
//<span class="single-title">Apple Watch</span>
// //*
//*[@id="landing-apple"]/div[3]/div[2]/div[1]/div[1]/span - DON'T DO THIS
// .//span[@class = 'single-title'] - DO THIS!
//<div class="ldg-apl-single" data-category="watch">
//<span class="single-title">Apple Watch</span></div>
// .//div[@data-category = 'watch']
// .//div[contains(@class, 'single')]