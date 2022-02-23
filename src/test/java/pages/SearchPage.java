package pages;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Helper;

public class SearchPage extends Helper {

    private final AndroidDriver driver;

    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By textboxDateChoose = By.id("search_view_dates_edit_text");
    private final By buttonCalendarContinue = By.id("calendar_save");
    private final By buttonSearchCar = By.id("search_driver_CTA_search");
    private final By textSearchResultTitle = By.xpath("//android.widget.TextView[@text='Arama sonuçları']");
    private final By buttonFilter = By.id("resultsFiltersButton");
    private final By buttonFirstCar = By.xpath("//androidx.cardview.widget.CardView[@content-desc='carBlock 1']");
    private final By textFirstCarPrice = By.xpath("(//android.widget.TextView[@content-desc='txtCarBlockPrice'])[1]");

    public void clickChoosesDeliveryDateAndReturnDate(String deliveryDate, String dateOfReturn) {
        System.out.println("Click chooses pickup and return date");
        driver.findElement(textboxDateChoose).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='day- " + deliveryDate + "']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='day- " + dateOfReturn + "']")).click();
        driver.findElement(buttonCalendarContinue).click();
    }

    public void clickTheSearchCarButton() {
        System.out.println("Click search car button");
        waitUntilElementIsClickable(driver.findElement(buttonSearchCar)).click();
    }

    public void checkSearchResultPage() {
        System.out.println("Check search result page");
        waitUntilElementIsVisible(driver.findElement(textSearchResultTitle));
        Assert.assertEquals(driver.findElement(textSearchResultTitle).getText(), "Arama sonuçları");
    }

    public void clickFilterPageButton() {
        System.out.println("Click filter button");
        waitUntilElementIsClickable(driver.findElement(buttonFilter)).click();
    }

    public void clickFirstCarOnTheSearchResultPage() {
        System.out.println("Click first car on the search result page");
        ScenarioDataStore.put("Price of the first car", driver.findElement(textFirstCarPrice).getText());
        waitUntilElementIsClickable(driver.findElement(buttonFirstCar)).click();
    }
}
