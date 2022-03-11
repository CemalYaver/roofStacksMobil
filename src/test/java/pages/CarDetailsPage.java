package pages;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Helper;
import utils.driver.Driver;

public class CarDetailsPage extends Helper {

    public CarDetailsPage() {
        super(Driver.driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Araç Detayları']")
    private WebElement textCarDetailsTitle;

    @AndroidFindBy(id = "vehicleSummarySwitch")
    private WebElement buttonBasket;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.edreams.travel:id/priceTitle']")
    private WebElement txtpriceTitle;

    public void carDetailsPageTitle() {
        System.out.println("Car details page title");
        waitUntilElementIsVisible(textCarDetailsTitle);
        Assert.assertEquals(textCarDetailsTitle.getText(), "Araç Detayları");
    }

    public void clickBasketButtonOnCarDetailsPage() {
        System.out.println("Click basket button on car details page");
        Assert.assertEquals(txtpriceTitle.getText(), ScenarioDataStore.get("Price of the first car"));
        buttonBasket.click();

    }
}
