package zantestsuite;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 09.04.2015.
 */
public class searchVacancy {
    @Test
    public void newVacancy(){
        open("http://cabinet.zan.donland.ru/vacancies");
//        $(By.name("profession_title")).val("Водитель");
//        $(byText("Водитель автобуса"));
        $("#district_id").selectOptionByValue("20");
        $("#salary").val("13123");
        $("#order_by").selectOptionByValue("salary");
        $(by("type", "submit")).click();
        $("tbody").shouldHave(Condition.text("123"));
    }
}
