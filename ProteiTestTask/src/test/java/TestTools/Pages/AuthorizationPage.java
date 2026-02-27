package TestTools.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    public SelenideElement eMail = $x("//label[@for = 'loginEmail']");

    public SelenideElement eMailInput = $x("//input[@id= 'loginEmail']");

    public SelenideElement password = $x("//label[@for = 'loginPassword']");

    public SelenideElement passwordInput = $x("//input[@id= 'loginPassword']");

    public SelenideElement authBtn = $x("//button[@id= 'authButton']");


    public SelenideElement errorMessageWrongEmailFormat = $x("//div[@id = 'emailFormatError']");

    public SelenideElement errorMessageWrongEmailOrPasswordFormat = $x("//div[@id = 'invalidEmailPassword']");



    public AuthorizationPage(String url){
        Selenide.open(url);
    }


}
