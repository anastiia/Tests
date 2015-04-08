package com.yourpackage.tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


/**
 * Created by agorina on 06.04.2015.
 */
public class addHotel {
    @Test
    public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();
    }
    @Test
     public void newHotel() {
        open("http://ripk.rnds.pro/hotels/new");
        $(By.name("hotel[title]")).setValue("Новый отель");
        $(By.name("hotel[link]")).setValue("http://ya.ru");
        $(By.name("hotel[description]")).setValue("Самый замечательный отель в мире!");
        $(By.name("hotel[price]")).setValue("1255");
        $(By.name("hotel[bron]")).setValue("есть");
        $(By.name("hotel[category]")).setValue("2 звезды");
        $(By.name("hotel[additional]")).setValue("Недалеко от места проведения курсов");
        $(By.name("hotel[contact]")).setValue("Звоните круглосуточно").submit();

    }


}
