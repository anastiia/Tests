
package com.yourpackage.tests;



        import com.codeborne.selenide.WebDriverRunner;
        import org.junit.Test;
        import org.openqa.selenium.By;


        import static com.codeborne.selenide.Condition.cssClass;
        import static com.codeborne.selenide.Condition.hasClass;
        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selectors.byText;
        import static com.codeborne.selenide.Selenide.$;
        import static com.codeborne.selenide.Selenide.open;

public class RecordOnCources {
    /* public void setUp() {
        System.setProperty("C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe", "webdriver.chrome.driver");    }
    browser = "chrome"; */

    @Test
    public void courseRegistration (){
        open("http://ripk.rnds.pro/course_registries");
        $(By.name("course_registry[fio]")).setValue("Горина А.А.");
        $(By.name("course_registry[course_id]")).selectOptionByValue("4");
        $(By.name("course_registry[company]")).setValue("Рнд-Софт");
        $(By.name("course_registry[time]")).setValue("13:30");
        $(By.name("course_registry[phone]")).setValue("22-345-56");
        $(By.name("course_registry[email]")).setValue("agorina@rnd-soft.ru");
        $(By.name("course_registry[additional]")).setValue("нет дополнительной инфомации");
     $("button").shouldHave(cssClass("top-search__btn")).submit();

    }
}
