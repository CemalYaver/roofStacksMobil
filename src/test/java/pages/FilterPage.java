package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Helper;
import utils.driver.Driver;

public class FilterPage extends Helper {

    public FilterPage() {
        super(Driver.driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Filtreleme']")
    private WebElement textFilterTitle;

    @AndroidFindBy(id = "ctaBtn")
    private WebElement buttonShowCar;

    public void checkFilterPageTitle() {
        System.out.println("Check filter page title");
        waitUntilElementIsVisible(textFilterTitle);
        Assert.assertEquals(textFilterTitle.getText(), "Filtreleme");
    }

    public void clickShowCarButton() {
        System.out.println("Click show car button");
        buttonShowCar.click();
    }
}
