package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.SearchPage;
import utils.driver.Driver;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(Driver.driver);

    @Step("Click chooses any pick-up and return date on the car rental page delivery date:<deliveryDate> date of return:<dateOfReturn>")
    public void clickChoosesDeliveryDateAndReturnDate(String deliveryDate, String dateOfReturn) {
        searchPage.clickChoosesDeliveryDateAndReturnDate(deliveryDate, dateOfReturn);
    }

    @Step("Click the search car button on search page")
    public void clickTheSearchCarButton() {
        searchPage.clickTheSearchCarButton();
    }

    @Step("Check search result page")
    public void checkSearchResultPage() {
        searchPage.checkSearchResultPage();
    }

    @Step("Click filter page button")
    public void clickFilterPageButton() {
        searchPage.clickFilterPageButton();
    }

    @Step("Click first car on the search result page")
    public void clickFirstCarOnTheSearchResultPage() {
        searchPage.clickFirstCarOnTheSearchResultPage();
    }
}
