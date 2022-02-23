package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HomePage;
import utils.driver.Driver;

public class HomePageSteps {

    HomePage homePage = new HomePage(Driver.driver);

    @Step("Click category menu:<category>")
    public void clickCategoryMenu(String category) {
        homePage.clickCategoryMenu(category);
    }
}
