package pageobject.tests;

import org.junit.jupiter.api.Test;
import pageobject.pages.BaseFunctions;
import pageobject.pages.HomePage;

public class CatalogTests {
    private final String HOME_PAGE_URL = "http://1a.lv";
    private final String PRODUCT_TO_FIND = "Apple";

    @Test
    public void productDetailsCheck() {
        BaseFunctions baseFunctions = new BaseFunctions();
        baseFunctions.openUrl(HOME_PAGE_URL);

        HomePage homePage = new HomePage(baseFunctions);
        homePage.acceptCookies();
        homePage.searchFor(PRODUCT_TO_FIND);



    }
}
