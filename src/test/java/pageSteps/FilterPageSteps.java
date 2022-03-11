package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.FilterPage;

public class FilterPageSteps {

    FilterPage filterPage = new FilterPage();

    @Step("Check filter page title")
    public void checkFilterPageTitle() {
        filterPage.checkFilterPageTitle();
    }

    @Step("Click show car button")
    public void clickShowCarButton() {
        filterPage.clickShowCarButton();
    }
}
