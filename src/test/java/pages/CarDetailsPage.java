package pages;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Helper;

public class CarDetailsPage extends Helper {

    private final AndroidDriver driver;

    public CarDetailsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By textCarDetailsTitle = By.xpath("//android.widget.TextView[@text='Araç Detayları']");
    private final By buttonBasket = By.id("vehicleSummarySwitch");
    private final By txtpriceTitle = By.xpath("//android.widget.TextView[@resource-id='com.edreams.travel:id/priceTitle']");

    public void carDetailsPageTitle() {
        System.out.println("Car details page title");
        waitUntilElementIsVisible(driver.findElement(textCarDetailsTitle));
        Assert.assertEquals(driver.findElement(textCarDetailsTitle).getText(), "Araç Detayları");
    }

    public void clickBasketButtonOnCarDetailsPage() {
        System.out.println("Click basket button on car details page");
        Assert.assertEquals(driver.findElement(txtpriceTitle).getText(), ScenarioDataStore.get("Price of the first car"));
        driver.findElement(buttonBasket).click();

    }
}
