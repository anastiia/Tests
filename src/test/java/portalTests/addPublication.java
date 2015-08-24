package portalTests;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by agorina on 27.04.2015.
 */
public class addPublication {
    @BeforeClass
    public static void setConfiguration(){
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        Configuration.browser = "chrome";
    }
    @Test
    public void newPublication() {
        open("http://hermes.d.rnds.pro/users/sign_in");
        $("#user_email").val("admin@admin.com");
        $("#user_password").val("hermes").submit();
        open("http://hermes.d.rnds.pro/portal/publications");
        $(byText("Новая публикация")).click();
        $(withText("Создание публикации")).shouldBe(visible);
        $("#portal_publication_title").val("Новая публикация");
        $("#portal_publication_subtitle").val("Очень интересная публикация");
        $("#portal_publication_lead").val("Читайте только у нас!");
        $("#s2id_autogen1").val("Ростов").pressEnter().pressEnter();
        sleep(10000);


    }


}
