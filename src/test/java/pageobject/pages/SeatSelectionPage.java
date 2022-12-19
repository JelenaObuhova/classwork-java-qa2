package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeatSelectionPage {
    private BaseFunctions baseFunctions;
private final By SEAT = By.xpath(".//div[@class = 'seat']");
private final By SELECTED_SEAT_NR = By.xpath(".//div[@class='line']");

    public SeatSelectionPage(BaseFunctions baseFunctions) {
        this.baseFunctions = baseFunctions;
    }
    public void selectSeat(int seatNr) {
baseFunctions.waitForElement(SEAT, 5);

        WebElement seatToChoose = null;
        for (WebElement we:baseFunctions.findElements(SEAT)) {
            if (Integer.parseInt(we.getText()) == seatNr) {
                seatToChoose = we;
                break;
            }
        }
        Assertions.assertNotNull(seatToChoose, "Cant find seat!");
        baseFunctions.click(seatToChoose);
    }

    public int getSelectedSeatNr() {
        String fullText = baseFunctions.findElement(SELECTED_SEAT_NR).getText();
       // fullText.substring(fullText.length() -2);
        fullText = StringUtils.substringAfter(fullText, ": ");
        return Integer.parseInt(fullText);
    }
}
