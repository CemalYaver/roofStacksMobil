package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utils.Helper;

public class PrivacyPage extends Helper {

    private final AndroidDriver driver;

    public PrivacyPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private final By buttonPrivacyOption = By.id("privacyOpen");
    private final By buttonAgree = By.id("button_agree");
    private final By buttonSignIn = By.id("signIn");
    private final By buttonGoogleSignIn = By.id("btnGoogleSignUp");
    private final By radioButtonFirstEmailChoose = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1'][1]");
    private final By buttonPopupOk = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    public void clickPrivacyOptionsAndAccept() {
        System.out.println("Click privacy options and accept");
        waitUntilElementIsClickable(driver.findElement(buttonPrivacyOption)).click();
        waitUntilElementIsClickable(driver.findElement(buttonAgree)).click();
    }

    public void clickSignIn() {
        System.out.println("Click sign in");
        waitUntilElementIsClickable(driver.findElement(buttonSignIn)).click();
    }

    public void clickSignInWithGoogle() {
        System.out.println("Click sign in with google");
        waitUntilElementIsClickable(driver.findElement(buttonGoogleSignIn)).click();
        waitUntilElementIsClickable(driver.findElement(radioButtonFirstEmailChoose)).click();
        driver.findElement(buttonPopupOk).click();
    }
}
