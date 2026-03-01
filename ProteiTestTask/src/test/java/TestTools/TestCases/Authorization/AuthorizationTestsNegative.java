package TestTools.TestCases.Authorization;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import org.testng.annotations.Test;

public class AuthorizationTestsNegative extends BaseTest{

    /**
     *  Авторизация с email без @
     */
    @Test (priority = 1)
    public void authorizationEmailWithoutDog(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtihout@"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailFormat, TestProperties.get("worng.email.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailFormat);


    }

    /**
     *  Авторизация с email без точки
     */
    @Test (priority = 2)
    public void authorizationEnailWithoutDot(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtihoutDot"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с email с пробелом в начале
     */
    @Test (priority = 3)
    public void authorizationWithEmailSpaceBegin(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtih.space"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с email с пробелом в конце
     */
    @Test (priority = 4)
    public void authorizationWithEmailSpaceEnd(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtih.space.end"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с паролем с пробелом в начале
     */
    @Test (priority = 5)
    public void authorizationWithPasswordSpaceBegin(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.wrong.password.space.begin"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с паролем с пробелом в конце
     */
    @Test (priority = 6)
    public void authorizationWithPasswordSpaceEnd(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.wrong.password.space.end"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с email с пробелом посередине
     */
    @Test (priority = 7)
    public void authorizationWithEmailSpaceMiddle(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtih.space.middle"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с email с верхним регистром
     */
    @Test (priority = 8)
    public void authorizationEmailWithUpRegister(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.wrong.email.wtih.up.register"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.valid.password"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }

    /**
     *  Авторизация с паролем с верхним регистром
     */
    @Test (priority = 9)
    public void authorizationWithPassUpRegister(){

        act.sendText(authPage.eMailInput, TestProperties.get("auth.valid.email"));
        act.sendText(authPage.passwordInput, TestProperties.get("auth.wrong.password.up.register"));
        act.click(authPage.authBtn);

        ver.ifElementIsVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementHasText(authPage.errorMessageWrongEmailOrPasswordFormat, TestProperties.get("worng.email.pass.format.message"));

        act.click(authPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);
        ver.ifElementIsNotVisible(authPage.errorMessageWrongEmailOrPasswordFormat);


    }
}
