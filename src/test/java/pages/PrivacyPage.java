package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Helper;
import utils.driver.Driver;

public class PrivacyPage extends Helper {

    public PrivacyPage() {
        super(Driver.driver);
    }

    @AndroidFindBy(id = "privacyOpen")
    private MobileElement buttonPrivacyOption;

    @AndroidFindBy(id = "button_agree")
    private MobileElement buttonAgree;

    @AndroidFindBy(id = "signIn")
    private MobileElement buttonSignIn;

    @AndroidFindBy(id = "btnGoogleSignUp")
    private MobileElement buttonGoogleSignIn;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id='android:id/text1'][1]")
    private MobileElement radioButtonFirstEmailChoose;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    private MobileElement buttonPopupOk;

    public void clickPrivacyOptionsAndAccept() {
        System.out.println("Click privacy options and accept");
        waitUntilElementIsClickable(buttonPrivacyOption).click();
        waitUntilElementIsClickable(buttonAgree).click();
    }

    public void clickSignIn() {
        System.out.println("Click sign in");
        waitUntilElementIsClickable(buttonSignIn).click();
    }

    public void clickSignInWithGoogle() {
        System.out.println("Click sign in with google");
        waitUntilElementIsClickable(buttonGoogleSignIn).click();
        waitUntilElementIsClickable(radioButtonFirstEmailChoose).click();
        buttonPopupOk.click();
    }
}
