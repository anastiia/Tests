package com.yourpackage.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 08.04.2015.
 */
public class zanNewVacancy {
    @Test
    public void loginEmployeer() {
        open("http://cabinet.zan.donland.ru/users/sign_in");
        $(By.name("user[email]")).val("employer@ro.ru");
        $(By.name("user[password]")).val("123123123").submit();
    }
    @Test
    public void createVacanc() {
            open("http://cabinet.zan.donland.ru/vacancies/new");
        $(By.name("vacancy[title]")).val("Водитель автобуса");
        $(By.name("vacancy[profession_title]")).val("Водитель");
        $(byText("Водитель автобуса")).click();
        $(By.name("vacancy[salary]")).val("123456");
            $(By.name("vacancy[salary_to]")).val("654321").submit();


        }




}
