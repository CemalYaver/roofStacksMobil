package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.CarDetailsPage;

public class CarDetailsPageSteps {

    CarDetailsPage carDetailsPage = new CarDetailsPage();

    @Step("Check car details page title")
    public void checkCarDetailsPageTitle() {
        carDetailsPage.carDetailsPageTitle();
    }

    @Step("Click basket button on car details page")
    public void clickBasketButtonOnCarDetailsPage() {
        carDetailsPage.clickBasketButtonOnCarDetailsPage();
    }
}
