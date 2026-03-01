package TestTools.TestCases.Registration;

import TestTools.Helpers.TestProperties;
import TestTools.Managers.BaseTest;
import org.testng.annotations.Test;

public class RegistrationTestsPositive extends BaseTest {

    /**
     *  Регистрация с минимальными выбранными параметрами
     */

    @Test (priority = 1)
    public void successRegistrationWithMinimumCredentials(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));

    }

    /**
     *  Регистрация с 1 Выбранным Вариант 1
     */

    @Test (priority = 2)
    public void successRegistrationWithVariat11(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.checkBox11);
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.1"),
                TestProperties.get("reg.variant2.empty"));

    }

    /**
     *  Регистрация с двумя выбранными Вариант 1
     */

    @Test (priority = 3)
    public void successRegistrationWithVariat11Variant12(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.checkBox11);
        act.click(regPage.checkBox12);
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.12"),
                TestProperties.get("reg.variant2.empty"));

    }

    /**
     *  Регистрация с выбранным Вариант 2
     */

    @Test (priority = 4)
    public void successRegistrationWithVariat21(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.checkBox21);
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.1"));

    }

    /**
     *  Регистрация со всеми выбранными полями из каждой категории
     */

    @Test (priority = 5)
    public void successRegistrationWithEveryFieldCahnge(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.selectOption(regPage.genderInput, TestProperties.get("reg.table.gender.female"));
        act.click(regPage.checkBox11);
        act.click(regPage.checkBox21);
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.female"),
                TestProperties.get("reg.variant1.1"),
                TestProperties.get("reg.variant2.1"));

    }

    /**
     *  Регистрация нескольких пользователей
     */

    @Test (priority = 6)
    public void successRegistrationWithFewEmployees(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table2"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));


    }

    /**
     *  Регистрация пользователя с пробелами в имени
     */

    @Test (priority = 7)
    public void successRegistrationWithSpaceInName(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.space.name"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.space.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));

    }

    /**
     *  Регистрация пользователя с отсутствующим именем
     */

    @Test (priority = 8)
    public void failRegistrationWithEmptyName(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.empty.name"));
        act.click(regPage.btnDataSend);
        ver.ifElementIsVisible(regPage.wrongNameMessage);
        ver.ifElementIsNotVisible(regPage.tableData);
        ver.ifElementHasText(regPage.wrongNameMessage,"reg.errorWrongName");

        act.click(regPage.btnCloseErrorMessage);
        act.sleepUntilNotVisible(regPage.wrongNameMessage);
        ver.ifElementIsNotVisible(regPage.wrongNameMessage);

    }

    /**
     *  Регистрация пользователя с отсутствующим E-Mail
     */

    @Test (priority = 9)
    public void failRegistrationWithEmptyEmail(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("empty.value"));
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
     *  Регистрация пользователя с E-Mail без точки
     */

    @Test (priority = 10)
    public void successRegistrationWithoutDotInEmail(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.emailDot"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.emailDot"),
                TestProperties.get("reg.valid.name"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));

    }


    /**
     *  Регистрация пользователя с именем на кириллице
     */

    @Test (priority = 11)
    public void successRegistrationWithRussian(){

        act.loginWithValidCredentials(authPage, regPage);
        act.sendText(regPage.eMailInput,TestProperties.get("reg.valid.email"));
        act.sendText(regPage.nameInput,TestProperties.get("reg.valid.name.rus"));
        act.click(regPage.btnDataSend);
        act.click(regPage.btnOk);
        ver.сheckTableData(
                TestProperties.get("reg.table1"),
                TestProperties.get("reg.valid.email"),
                TestProperties.get("reg.valid.name.rus"),
                TestProperties.get("reg.table.gender.male"),
                TestProperties.get("reg.variant1.empty"),
                TestProperties.get("reg.variant2.empty"));

    }
}
