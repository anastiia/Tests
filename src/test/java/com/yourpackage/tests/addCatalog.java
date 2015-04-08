
package com.yourpackage.tests;


import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isHtmlUnit;
import static org.junit.Assert.assertEquals;


public class addCatalog {

    @Test
    public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();
    }

    @Test
    public void saveCatalog() {
        open("http://ripk.rnds.pro/course_catalogs/new");
        $(By.name("course_catalog[title]")).setValue("Семинары");
        $(By.name("course_catalog[authorize]")).setSelected(true);
        $(By.name("course_catalog[authorize]")).shouldBe(visible);
        $(By.name("course_catalog[authorize]")).setSelected(true);
        $(By.name("course_catalog[authorize]")).shouldBe(selected);
    }

    }

