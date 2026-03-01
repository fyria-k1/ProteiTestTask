package TestTools.Managers;

import TestTools.Helpers.TestProperties;
import TestTools.Pages.AuthorizationPage;
import TestTools.Pages.RegistrationPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ActionManager{

    public void click(SelenideElement sel){
        sel.click();
    }

    public void sendText(SelenideElement sel, String str){
        sel.sendKeys(str);
    }

    public void sleep(int sec) {
        Selenide.sleep(sec * 1000);
    }

    public void sleepUntilVisible(SelenideElement sel){
        sel.shouldBe(visible);
    }

    public void sleepUntilNotVisible(SelenideElement sel){
        sel.shouldNotBe(visible);
    }

    public void selectOption(SelenideElement sel,  String string){
        sel.selectOption(string);
    }


    public void loginWithValidCredentials(AuthorizationPage authPage, RegistrationPage regPage) {

        sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        click(authPage.authBtn);
        sleepUntilVisible(regPage.gender);
    }
}
