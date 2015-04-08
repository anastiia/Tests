package com.yourpackage.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 03.04.2015.
 */
public class addPublishes {
    @Test
     public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();
    }
    @Test
    public void saveArticle()
    {
        open("http://ripk.rnds.pro/publishes/new");
        $(By.name("publish[date]")).setValue("03.04.2015").pressEnter();
        $(By.name("publish[title]")).setValue("Первая публикация");
        $(By.name("publish[reference]")).setValue("Российская газета");
        $(By.id("mceu_13")).setValue("Какой-то текст").submit();
    }

}
