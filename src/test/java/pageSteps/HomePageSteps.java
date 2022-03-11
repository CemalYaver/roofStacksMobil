package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Step("Click category menu:<category>")
    public void clickCategoryMenu(String category) {
        homePage.clickCategoryMenu(category);
    }
}
