package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkLocators {
    private final String HOME_PAGE = "http://1a.lv";
    private final By MAIN_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By SITE_INFO = By.xpath(".//a[@href = '/order_search']");
    private final By SEARCH_ICON = By.xpath(".//i[@class = 'main-search-submit__icon icon-svg']");
    private final By LIKED_ITEMS = By.xpath(".//i[@class = 'favorite-items__icon icon-svg']");
    private final By LATVIAN_LANGUAGE = By.xpath(".//a[@hreflang = 'lv']");
    private final By RUSSIAN_LANGUAGE = By.xpath(".//a[@hreflang = 'ru']");
    private final By COOKIE_MESSAGE = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SUBMENU_PC = By.xpath(".// a[@href = '/c/datortehnika-preces-birojam/2pd']");
    private final By SUBMENU_PC_DETAILS = By.xpath(".// a[@href = '/c/datoru-komponentes-tikla-produkti/2pe']");
    private final By SUBMENU_PHONES_AND_APPLE = By.xpath(".// a[@href = '/c/telefoni-plansetdatori-apple-veikals/2pc']");
    private final By SUBMENU_TV_GAMES = By.xpath(".// a[@href = '/c/tv-audio-video-spelu-konsoles/2pf']");
    private final By OFFERS_CAROUSEL = By.id("welcome-carousel");


    @Test
    public void pageAppear() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get(HOME_PAGE);


    }
}


