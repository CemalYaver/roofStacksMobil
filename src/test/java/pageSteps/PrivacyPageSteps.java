package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.PrivacyPage;
import utils.driver.Driver;

public class PrivacyPageSteps {

    PrivacyPage privacyPage = new PrivacyPage(Driver.driver);

    @Step("Click privacy options and accept")
    public void clickPrivacyOptionsAndAccept() {
        privacyPage.clickPrivacyOptionsAndAccept();
    }

    @Step("Click sign in")
    public void clickSignIn() {
        privacyPage.clickSignIn();
    }

    @Step("Click sign in with google")
    public void clickSignInWithGoogle() {
        privacyPage.clickSignInWithGoogle();
    }
}
