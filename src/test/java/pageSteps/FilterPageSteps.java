package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.FilterPage;
import utils.driver.Driver;

public class FilterPageSteps {

    FilterPage filterPage = new FilterPage(Driver.driver);

    @Step("Check filter page title")
    public void checkFilterPageTitle() {
        filterPage.checkFilterPageTitle();
    }

    @Step("Click show car button")
    public void clickShowCarButton() {
        filterPage.clickShowCarButton();
    }
}
