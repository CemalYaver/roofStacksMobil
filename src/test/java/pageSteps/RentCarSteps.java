package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.RentCarPage;

public class RentCarSteps {

    RentCarPage rentCarPage = new RentCarPage();

    @Step("Search on the car rental page:<search>")
    public void searchOnTheCarRentalPage(String search) {
        rentCarPage.searchOnTheCarRentalPage(search);
    }
}
