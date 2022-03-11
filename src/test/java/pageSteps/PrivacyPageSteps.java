package pageSteps;

import com.thoughtworks.gauge.Step;
import pages.PrivacyPage;

public class PrivacyPageSteps {

    PrivacyPage privacyPage = new PrivacyPage();

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
