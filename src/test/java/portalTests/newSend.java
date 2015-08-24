package portalTests;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by agorina on 29.05.2015.
 */
public class newSend {
        @BeforeClass
        public static void setConfiguration(){
            System.setProperty("webdriver.chrome.driver","C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
            Configuration.browser = "chrome";
        }
        @Test
        public void seed() {
            open("http://hermes.d.rnds.pro/#send");
            $("#email").val("petrov@mail.ru").submit();
            sleep(5000);
            $(byText("Получайте рассылку")).shouldBe(disappears);
            $(withText("Письмо с подверждением будет отправлено на почту petrov@mail.ru")).shouldBe(visible);

        }
    }

