package com.yourpackage.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 06.04.2015.
 */
public class addNews {

    @Test
    public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();

    }

    @Test
    public void newNews() {
        open("http://ripk.rnds.pro/news");
        $(byText("Создать новость")).click();
        $(By.name("news[created_at]")).setValue("03.04.2015").pressEnter();
        $(By.name("news[title]")).setValue("Первая публикация");
       // $(By.id("mceu_13")).setValue("Российская газета");
        $(byText("Сохранить")).click();
    }
}