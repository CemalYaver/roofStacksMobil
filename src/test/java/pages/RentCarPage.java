package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Helper;

import java.util.List;

public class RentCarPage extends Helper {

   private final AndroidDriver driver;

    public RentCarPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By textboxSearch = By.id("searchTv");
    private final By textboxSearchInput = By.id("toolbarSearchInput");
    private final By textLocationItemHeading = By.xpath("//android.widget.TextView[@resource-id='com.edreams.travel:id/locationsItemHeading']");

    public void searchOnTheCarRentalPage(String search) {
        System.out.println("Searching on the car rental :" + search);
        driver.findElement(textboxSearch).click();
        driver.findElement(textboxSearchInput).sendKeys(search);
        List<MobileElement> results = driver.findElements(textLocationItemHeading);
        for (MobileElement result : results) {
            System.out.println("result: " + result.getText());
            if (result.getText().equalsIgnoreCase(search)) {
                result.click();
                break;
            }
        }
    }
}
