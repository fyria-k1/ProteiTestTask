package TestTools.Managers;

import TestTools.Pages.AuthorizationPage;
import TestTools.Pages.RegistrationPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;

public abstract class BaseTest{
    protected final static String baseUrl;

    static {
        String resourcePath = "qa-test.html";

        URL url = BaseTest.class.getClassLoader().getResource(resourcePath);
        if (url == null) {
            throw new IllegalStateException("Файл не найден в resources: " + resourcePath);
        }
        baseUrl = url.toString();
    }

    protected final ActionManager act = new ActionManager();
    protected final VerificationManager ver = new VerificationManager();
    protected final AuthorizationPage authPage = new AuthorizationPage(baseUrl);
    protected final RegistrationPage regPage = new RegistrationPage(baseUrl);


    static {
        Configuration.browser = "chrome";
        Configuration.browserSize = "2560x1440";
        Configuration.headless = false;
    }

    @BeforeMethod
    public void setUp(){
        Selenide.open(baseUrl);

        act.sleepUntilVisible(authPage.eMail);

        ver.ifElementIsVisible(authPage.eMail);
        ver.ifElementIsVisible(authPage.eMailInput);
        ver.ifElementIsVisible(authPage.password);
        ver.ifElementIsVisible(authPage.passwordInput);
        ver.ifElementIsVisible(authPage.authBtn);
    }

    @AfterMethod
    public void tearDown(){
        try {
            Selenide.closeWebDriver();
        } catch (Exception e) {
            System.out.println("Не удалось закрыть браузер: " + e.getMessage());
        }
    }

}