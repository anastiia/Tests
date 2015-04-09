package zantestsuite;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.type;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 08.04.2015.
 */
public class newEmployer {
    @Test
    public void registration(){
        open("http://cabinet.zan.donland.ru/users/sign_up");
        $(By.name("user[name]")).val("Трофим Зотов");
        $(By.name("user[email]")).val("Gazeelly@rhyta.com");
        $(By.name("user[password]")).val("123123123");
        $(By.name("user[password_confirmation]")).val("123123123");
        $(By.name("user[detail_attributes][title]")).val("I. Magnin");
        $(By.name("user[detail_attributes][address]")).val("Kolodvorska 43 6240 Kozina");
        $(By.name("user[detail_attributes][inn]")).val("44878515539");
        $(By.name("user[detail_attributes][phone]")).val("040-572-011");
        $(By.name("user[detail_attributes][email]")).val("Gazeelly@rhyta.com");
        $(By.name("user[detail_attributes][type_of_activity]")).val("Предпринимательство");
        $(By.name("user[detail_attributes][contact_fio]")).val("Трофим Зотов");
        $(By.name("user[detail_attributes][contact_phone]")).val("040-572-011");
        $(By.name("user[detail_attributes][contact_email]")).val("Gazeelly@rhyta.com");
        $(by("type", "submit")).click();
     $(withText("зарегистр")).shouldBe(visible);

    }


}
