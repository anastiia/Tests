package portalTests;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Condition.disabled;
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
public class newSeed {
    @BeforeClass
    public static void setConfiguration(){
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        Configuration.browser = "chrome";
    }
    @Test
    public void seed() {
        open("http://hermes.d.rnds.pro/#seed");
        $("#user_news_fio").val("Петров Петр Петрович");
        $("#user_news_email").val("petrov@mail.ru");
        $("#user_news_body").val("Не следует, однако забывать, что реализация намеченных плановых заданий играет важную роль в формировании существенных финансовых и административных условий. Идейные соображения высшего порядка, " +
                "а также начало повседневной работы по формированию " +
                "позиции влечет за собой процесс внедрения и модернизации дальнейших направлений развития. ").submit();
        sleep(5000);
        $(byText("Расскажите новость")).shouldBe(disappears);
        $(withText("Новость отправлена")).shouldBe(visible);

    }
    }

