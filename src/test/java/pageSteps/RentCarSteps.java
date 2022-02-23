package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.RentCarPage;
import utils.driver.Driver;

public class RentCarSteps {

    RentCarPage rentCarPage = new RentCarPage(Driver.driver);

    @Step("Search on the car rental page:<search>")
    public void searchOnTheCarRentalPage(String search) {
        rentCarPage.searchOnTheCarRentalPage(search);
    }
}
