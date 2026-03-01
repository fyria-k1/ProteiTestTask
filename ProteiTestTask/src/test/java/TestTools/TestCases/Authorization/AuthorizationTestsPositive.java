package TestTools.TestCases.Authorization;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import org.testng.annotations.Test;

public class AuthorizationTestsPositive extends BaseTest {

    /**
     *  Успешная авторизация
     */

    @Test (priority = 1)
    public void successAuthorization(){

        act.loginWithValidCredentials(authPage, regPage);
        ver.ifElementIsVisible(regPage.eMail);
        ver.ifElementIsVisible(regPage.eMailInput);
        ver.ifElementIsVisible(regPage.name);
        ver.ifElementIsVisible(regPage.nameInput);
        ver.ifElementIsVisible(regPage.gender);
        ver.ifElementIsVisible(regPage.genderInput);

        ver.ifElementIsVisible(regPage.checkBox11);
        ver.ifElementHasText(regPage.variant11, TestProperties.get("reg.variant11"));
        ver.ifElementIsVisible(regPage.checkBox12);
        ver.ifElementHasText(regPage.variant12, TestProperties.get("reg.variant12"));

        ver.ifElementIsVisible(regPage.checkBox21);
        ver.ifElementHasText(regPage.variant21, TestProperties.get("reg.variant21"));
        ver.ifElementIsVisible(regPage.checkBox22);
        ver.ifElementHasText(regPage.variant22, TestProperties.get("reg.variant22"));
        ver.ifElementIsVisible(regPage.checkBox23);
        ver.ifElementHasText(regPage.variant23, TestProperties.get("reg.variant23"));

        ver.ifElementIsVisible(regPage.btnDataSend);

        ver.checkRegTable();
    }

    /**
     *  Авторизация с незаполненными полями E-Mail и Пароль
     */
    @Test (priority = 2)
    public void authorizationWithoutEandP(){

        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailFormat, TestProperties.get("worng.email.format.message"));
        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailFormat);


    }

    /**
     *  Авторизация с незаполненным полем Пароль
     */
    @Test (priority = 3)
    public void authorizationWithoutP(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));
        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с незаполненным полем E-Mail
     */
    @Test (priority = 4)
    public void authorizationWithoutE(){

        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailFormat, TestProperties.get("worng.email.format.message"));
        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailFormat);


    }

    /**
     *  Авторизация с неверным паролем
     */
    @Test (priority = 5)
    public void authorizationWithWrongP(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.wrong.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));
        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с некорректным email
     */
    @Test (priority = 6)
    public void authorizationWithWrongE(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));
        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

}
