package TestTools.TestCases.Authorization;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import TestTools.Pages.RegistrationPage;
import org.testng.annotations.Test;

public class SucceededAuthorization extends BaseTest {

    @Test
    public void enterAuthorizationPage(){
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
        ver.ifElementHasText(regPage.variant21, "reg.variant12");
        ver.ifElementIsVisible(regPage.checkBox22);
        ver.ifElementHasText(regPage.variant22, "reg.variant12");
        ver.ifElementIsVisible(regPage.checkBox23);
        ver.ifElementHasText(regPage.variant23, "reg.variant12");

        ver.ifElementIsVisible(regPage.dataSend);

        ver.checkRegTable();
    }

//    @Test
//    public void enterRegistrationPage(){
//
//        act.sendText(authPage.eMailEnter, TestProperties.get("auth.valid.email"));
//
//
//    }

}
