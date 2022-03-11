package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Helper;
import utils.driver.Driver;

import java.util.List;

public class HomePage extends Helper {

    public HomePage() {
        super(Driver.driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.edreams.travel:id/title']")
    private List<MobileElement> buttonCategoryTitle;

    public void clickCategoryMenu(String category) {
        System.out.println("Click category " + category);
        for (MobileElement categoryTitle : buttonCategoryTitle) {
            if (categoryTitle.getText().equalsIgnoreCase(category)) {
                categoryTitle.click();
                break;
            }
        }
    }
}
