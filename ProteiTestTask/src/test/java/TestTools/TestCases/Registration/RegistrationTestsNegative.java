package TestTools.TestCases.Registration;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import org.testng.annotations.Test;

public class RegistrationTestsNegative extends BaseTest{

    /**
     *  Регистрация пользователя с E-Mail без @
     */

    @Test (priority = 1)
    public void registrationEmailWithoutDog(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.wrong.email.without@"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        ver.ifElementIsVisible(regPage.wrongEmailMessage);
        ver.ifElementIsNotVisible(regPage.tableData);
        ver.ifElementHasText(regPage.wrongEmailMessage,"reg.errorWrongEmail");

        act.click(regPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(regPage.wrongNameMessage);
        ver.ifElementIsNotVisible(regPage.wrongNameMessage);

    }


    /**
     *  Копия Регистрация пользователя с E-Mail без составляющей до @
     */

    @Test (priority = 2)
    public void registrationEmailWithoutWordsBeforeDog(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.wrong.email.without.words.before@"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        ver.ifElementIsVisible(regPage.wrongEmailMessage);
        ver.ifElementIsNotVisible(regPage.tableData);
        ver.ifElementHasText(regPage.wrongEmailMessage,"reg.errorWrongEmail");

        act.click(regPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(regPage.wrongNameMessage);
        ver.ifElementIsNotVisible(regPage.wrongNameMessage);

    }

    /**
     *  Копия Регистрация пользователя с E-Mail без составляющей после @
     */

    @Test (priority = 3)
    public void registrationEmailWithoutWordsAfterDog(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.wrong.email.without.words.after@"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        ver.ifElementIsVisible(regPage.wrongEmailMessage);
        ver.ifElementIsNotVisible(regPage.tableData);
        ver.ifElementHasText(regPage.wrongEmailMessage,"reg.errorWrongEmail");

        act.click(regPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(regPage.wrongNameMessage);
        ver.ifElementIsNotVisible(regPage.wrongNameMessage);

    }
}
