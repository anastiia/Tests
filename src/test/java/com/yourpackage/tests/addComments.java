package com.yourpackage.tests;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 06.04.2015.
 */
public class addComments {

    @Test
    public void newComments(){
        open("http://ripk.rnds.pro/comments");
        $(By.name("comment[name]")).setValue("Дуся Петрова");
        $(By.name("comment[email]")).setValue("petrova@to.tu");
        $(By.name("comment[text]")).setValue("Простой комментарий по поводу работы вашего сайта .Возникли небольшие прблемы. Чем можете помочь?").submit();
    }


}
