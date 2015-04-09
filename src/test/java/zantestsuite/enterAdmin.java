package zantestsuite;

import org.junit.Test;


import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 09.04.2015.
 */
public class enterAdmin {
    @Test
    public void loginAdmin() {
        open("http://cabinet.zan.donland.ru/users/sign_in");
        $("#user_email").val("alex@rnds.pro");
        $("#user_password").val("123123123");
        $(by("value", "Войти")).click();
        $(withText("Вход в систему выполнен.")).shouldBe(visible);
        $("h1").shouldHave(text("Заявки работодателей на создание аккаунта"));
        $(by("ng-click","tab=true")).click();
        $(by("type", "submit")).shouldBe(visible);
        $(byText("Вход в систему выполнен.")).waitUntil(disappears,20000);
        $("#q").val("123").submit();
    }



}
