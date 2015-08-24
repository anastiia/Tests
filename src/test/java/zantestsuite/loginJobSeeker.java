package zantestsuite;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


/**
 * Created by agorina on 09.04.2015.
 */
public class loginJobSeeker {
    @BeforeClass
    public static void setConfiguration(){
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        Configuration.browser = "chrome";
    }
    @Test
    public void enteredUser() {
        open("http://77.95.89.219/users/sign_in");
        $("#user_email").val("employer@ro.ru");
        $("#user_password").val("123123123");
        $(by("value", "Войти")).click();
        $(withText("Вход в систему выполнен.")).shouldBe(visible);
//        $(byText("Вход в систему выполнен.")).waitUntil(disappears, 20000);
        open("http://77.95.89.219/users/edit");
        $(by("type","checkbox")).setSelected(false);
        $("#user_current_password").val("123123123");
        $(by("type", "submit")).click();
        sleep(10000);

    }
}
