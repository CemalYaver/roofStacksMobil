package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Helper;

import java.util.List;

public class HomePage extends Helper {

    private final AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By buttonCategoryTitle = By.xpath("//android.widget.TextView[@resource-id='com.edreams.travel:id/title']");

    public void clickCategoryMenu(String category) {
        System.out.println("Click category " + category);
        waitUntilElementIsVisible(driver.findElement(buttonCategoryTitle));
        List<MobileElement> categoryMenu = driver.findElements(buttonCategoryTitle);
        for (MobileElement categoryTitle : categoryMenu) {
            if (categoryTitle.getText().equalsIgnoreCase(category)) {
                categoryTitle.click();
                break;
            }
        }
    }
}
