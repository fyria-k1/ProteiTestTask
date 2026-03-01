package TestTools.Pages;

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

    public SelenideElement genderInput = $x("//select[@id ='dataGender']");



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



    public SelenideElement tableData = $("#dataTable tbody tr td");



    public SelenideElement btnDataSend = $("#dataSend");

    public SelenideElement btnOk = $x("//button[@class = 'uk-button uk-button-primary uk-modal-close']");

    public SelenideElement btnCloseErrorMessage = $x("//a[@class = 'uk-alert-close uk-close']");


    public SelenideElement wrongNameMessage = $("#blankNameError");

    public SelenideElement wrongEmailMessage = $("#emailFormatError");



    public RegistrationPage(String url) {
        Selenide.open(url);
    }
}
