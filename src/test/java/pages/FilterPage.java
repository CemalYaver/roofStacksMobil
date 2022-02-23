package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Helper;

public class FilterPage extends Helper {

    private final AndroidDriver driver;

    public FilterPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By textFilterTitle = By.xpath("//android.widget.TextView[@text='Filtreleme']");
    private final By buttonShowCar = By.id("ctaBtn");

    public void checkFilterPageTitle() {
        System.out.println("Check filter page title");
        waitUntilElementIsVisible(driver.findElement(textFilterTitle));
        Assert.assertEquals(driver.findElement(textFilterTitle).getText(), "Filtreleme");
    }

    public void clickShowCarButton() {
        System.out.println("Click show car button");
        driver.findElement(buttonShowCar).click();
    }
}
