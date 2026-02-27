package TestTools.TestCases.Authorization;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import org.testng.annotations.Test;

public class AuthorizatrionTests extends BaseTest {

    /**
     *  Успешная авторизация
     */

    @Test
    public void successAuthorization(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);
        act.sleepUntilVisible(regPage.gender);
        ver.ifElementIsVisible(regPage.eMail);
        ver.ifElementIsVisible(regPage.eMailInput);
        ver.ifElementIsVisible(regPage.name);
        ver.ifElementIsVisible(regPage.nameInput);
        ver.ifElementIsVisible(regPage.gender);
        ver.ifElementIsVisible(regPage.genderInput);

        ver.ifElementIsVisible(regPage.checkBox11);
        ver.ifElementHasText(regPage.variant11, "reg.variant11");
        ver.ifElementIsVisible(regPage.checkBox12);
        ver.ifElementHasText(regPage.variant12, "reg.variant12");

        ver.ifElementIsVisible(regPage.checkBox21);
        ver.ifElementHasText(regPage.variant21, "reg.variant21");
        ver.ifElementIsVisible(regPage.checkBox22);
        ver.ifElementHasText(regPage.variant22, "reg.variant22");
        ver.ifElementIsVisible(regPage.checkBox23);
        ver.ifElementHasText(regPage.variant23, "reg.variant23");

        ver.ifElementIsVisible(regPage.dataSend);

        ver.checkRegTable();
    }

    /**
     *  Авторизация с незаполненными полями E-Mail и Пароль
     */
    @Test
    public void authorizationWithoutEandP(){

        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailFormat, "worng.email.format.message");


    }

    /**
     *  Авторизация с незаполненным полем Пароль
     */
    @Test
    public void authorizationWithoutP(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, "worng.email.pass.format.message");


    }

    /**
     *  Авторизация с незаполненным полем E-Mail
     */
    @Test
    public void authorizationWithoutE(){

        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailFormat, "worng.email.format.message");


    }

    /**
     *  Авторизация с неверным паролем
     */
    @Test
    public void authorizationWithWrongP(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.wrong.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, "worng.email.pass.format.message");


    }

    /**
     *  Авторизация с некорректным email
     */
    @Test
    public void authorizationWithWrongE(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, "worng.email.pass.format.message");


    }

}
