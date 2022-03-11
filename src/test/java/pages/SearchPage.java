package pages;

import com.thoughtworks.gauge.datastore.ScenarioDataStore;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Helper;
import utils.driver.Driver;

public class SearchPage extends Helper {

 public SearchPage() {
     super(Driver.driver);
 }

    @FindBy(id = "search_view_dates_edit_text")
    private MobileElement textboxDateChoose;

    @FindBy(id = "calendar_save")
    private MobileElement buttonCalendarContinue;

    @FindBy(id = "search_driver_CTA_search")
    private MobileElement buttonSearchCar;

    @FindBy(xpath = "//android.widget.TextView[@text='Arama sonuçları']")
    private MobileElement textSearchResultTitle;

    @FindBy(id = "resultsFiltersButton")
    private MobileElement buttonFilter;

    @FindBy(xpath = "//androidx.cardview.widget.CardView[@content-desc='carBlock 1']")
    private MobileElement buttonFirstCar;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='txtCarBlockPrice'][1]")
    private MobileElement textFirstCarPrice;

    public void clickChoosesDeliveryDateAndReturnDate(String deliveryDate, String dateOfReturn) {
        System.out.println("Click chooses pickup and return date");
        textboxDateChoose.click();
        Driver.driver.findElement(By.xpath("//android.widget.TextView[@content-desc='day- " + deliveryDate + "']")).click();
        Driver.driver.findElement(By.xpath("//android.widget.TextView[@content-desc='day- " + dateOfReturn + "']")).click();
        buttonCalendarContinue.click();
    }

    public void clickTheSearchCarButton() {
        System.out.println("Click search car button");
        waitUntilElementIsClickable(buttonSearchCar).click();
    }

    public void checkSearchResultPage() {
        System.out.println("Check search result page");
        waitUntilElementIsVisible(textSearchResultTitle);
        Assert.assertEquals(textSearchResultTitle.getText(), "Arama sonuçları");
    }

    public void clickFilterPageButton() {
        System.out.println("Click filter button");
        waitUntilElementIsClickable(buttonFilter).click();
    }

    public void clickFirstCarOnTheSearchResultPage() {
        System.out.println("Click first car on the search result page");
        ScenarioDataStore.put("Price of the first car", textFirstCarPrice.getText());
        waitUntilElementIsClickable(buttonFirstCar).click();
    }
}
