package TestTools.Managers;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class VerificationManager {
    public void ifElementIsVisible(SelenideElement sel) {
        Assert.assertTrue(sel.isDisplayed());
    }

    public void ifElementHasText(SelenideElement sel, String key){
        sel.equals(exactText(key));
    }

    public void checkRegTable(){
        $$("#dataTable thead th")
                .shouldHave(exactTexts(
                        "E-Mail",
                        "Имя",
                        "Пол",
                        "Выбор 1",
                        "Выбор 2"
                ));
    }
}
