package TestTools.Pages;

import TestTools.Managers.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage{

    public SelenideElement eMail = $x("//label[@for= 'dataEmail']");

    public SelenideElement eMailInput = $x("//input[@id= 'dataEmail']");

    public SelenideElement name = $x("//label[@for= 'dataName']");

    public SelenideElement nameInput = $x("//input[@id= 'dataName']");



    public SelenideElement gender = $x("//label[@for= 'dataGender']");

    public SelenideElement genderInput = $("#dataGender");



    public SelenideElement checkBox11 = $("#dataCheck11");

    public SelenideElement variant11 = $x("//input[@id = 'dataCheck11']/..");

    public SelenideElement checkBox12 = $("#dataCheck12");

    public SelenideElement variant12 = $x("//input[@id = 'dataCheck12']/..");



    public SelenideElement checkBox21 = $("#dataSelect21");

    public SelenideElement variant21 = $x("//input[@id = 'dataSelect21']/..");

    public SelenideElement checkBox22 = $("#dataSelect22");

    public SelenideElement variant22 = $x("//input[@id = 'dataSelect22']/..");

    public SelenideElement checkBox23 = $("#dataSelect23");

    public SelenideElement variant23 = $x("//input[@id = 'dataSelect23']/..");



    public SelenideElement dataSend = $("#dataSend");



    public void сheckTable(){
        $$("#dataTable thead th")
                .shouldHave(exactTexts(
                        "E-Mail",
                        "Имя",
                        "Пол",
                        "Выбор 1",
                        "Выбор 2"
                ));
    }

    public RegistrationPage(String url) {
        Selenide.open(url);
    }
}
