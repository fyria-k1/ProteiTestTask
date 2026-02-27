package TestTools.Managers;

import TestTools.Pages.AuthorizationPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;

public class ActionManager {


    public static AuthorizationPage openAuthorizationPage() {
        AuthorizationPage authorizationPage = new AuthorizationPage(BaseTest.baseUrl);
        return authorizationPage;
    }

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

    public void selectOption(SelenideElement sel,  String string){
        sel.selectOption(string);
    }
}
