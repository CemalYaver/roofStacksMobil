package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Helper;
import utils.driver.Driver;

import java.util.List;

public class RentCarPage extends Helper {

    public RentCarPage() {
        super(Driver.driver);
    }

    @AndroidFindBy(id = "searchTv")
    private MobileElement textboxSearch;

    @AndroidFindBy(id = "toolbarSearchInput")
    private MobileElement textboxSearchInput;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.edreams.travel:id/locationsItemHeading']")
    private List<MobileElement> textLocationItemHeading;

    public void searchOnTheCarRentalPage(String search) {
        System.out.println("Searching on the car rental :" + search);
        waitUntilElementIsVisible(textboxSearch);
        textboxSearch.click();
        textboxSearchInput.sendKeys(search);
        for (MobileElement result : textLocationItemHeading) {
            System.out.println("result: " + result.getText());
            if (result.getText().equalsIgnoreCase(search)) {
                result.click();
                break;
            }
        }
    }
}
