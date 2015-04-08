package com.yourpackage.tests;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by agorina on 06.04.2015.
 */
public class deleteClaims {
    @Test
    public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();
    }
    @Test
    public void userCanDeletedClaims() {
       open("http://ripk.rnds.pro/");

    }
}
