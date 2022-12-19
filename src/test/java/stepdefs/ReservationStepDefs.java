package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.reservation.Reservation;
import org.openqa.selenium.WebElement;
import pageobject.pages.BaseFunctions;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.TicketsHomePage;
import pageobject.pages.UserInfoPage;

import java.util.List;
import java.util.Map;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationStepDefs {
    private Reservation reservation;
    private BaseFunctions baseFunctions = new BaseFunctions();
    private TicketsHomePage homePage;
    private UserInfoPage infoPage;
    private SeatSelectionPage seatSelectionPage;

    private final String HOME_PAGE_URL = "http://qaguru.lv:8089/tickets";

    @Given("random client with:")
    public void create_client(Map<String, String> params){
        reservation = new Reservation("random", "random", params.get("discount"), params.get("flight_date"),
                params.get("airport_from"), params.get("airport_to"), parseInt(params.get("seat_number")),
                2,3, 2);

    }
    @Given("home page is opened")
    public void open_home_page() {
        baseFunctions.openUrl(HOME_PAGE_URL);
        homePage = new TicketsHomePage(baseFunctions);
    }
    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectAirports(reservation);
        homePage.pressGoBtn();
infoPage = new UserInfoPage(baseFunctions);
        }
        @Then("selected airports appears on client info page")
    public void check_airports() {
List<WebElement> airports = infoPage.getSelectedAirports();
            assertEquals(reservation.getDepartureAirport(), airports.get(0).getText(), "Incorrect dep airport");
            assertEquals(reservation.getArrivalAirport(), airports.get(1).getText(), "Incorrect arrival airport");
        }
        @When( "we are filling in passenger info form")
    public void fill_passenger_info_form() {
        infoPage.fillInInfoForm(reservation);

        }
    @When("we are clicking on Get Price link")
    public void get_price_click() {
        infoPage.clickGetPrice();
    }
    @Then("passenger name appears")
public void passenger_name_check() {
        assertEquals(reservation.getFirstName(), infoPage.passengerName(), "Wrong passenger name!");
    }
    @Then("price is: {int} EUR")
    public void check_price(int price) {
        assertEquals(price, infoPage.getPrice(), "Wrong price!");
    }
@When("we are pressing Book button")
    public void submit_info() {
        infoPage.book_btn_press();
        seatSelectionPage = new SeatSelectionPage(baseFunctions);
}
@Then("selecting seat number")
    public void seat_selection() {
seatSelectionPage.selectSeat(reservation.getSeatNumber());
}
    }

