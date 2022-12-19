package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By SEARCH_INPUT_FIELD = By.id("q");
private BaseFunctions baseFunctions;

    public HomePage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void acceptCookies() {
        baseFunctions.click(ACCEPT_COOKIES_BTN);

    }
    public void searchFor(String textToFind){
        baseFunctions.type(SEARCH_INPUT_FIELD, textToFind);
        baseFunctions.pressKey(SEARCH_INPUT_FIELD,Keys.ENTER);

    }
}
