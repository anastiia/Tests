package com.yourpackage.tests;


import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import com.codeborne.selenide.junit.ScreenShooter;

import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;




/**
 * Created by agorina on 06.04.2015.
 */
public class emptyField {


    @Test
    public void login() {
        open("http://ripk.rnds.pro/users/sign_in");
        $(By.name("user[email]")).setValue("admin@admin.ru");
        $(By.name("user[password]")).setValue("123123123").submit();

}
@Test
    public void checkCreateCourse() {

    open("http://ripk.rnds.pro/course_catalogs/2/courses/new");
    $(By.name("course[title]")).pressEnter();

}

    @Rule
     public ScreenShooter makeScreenShotOnFailure = ScreenShooter.failedTests().succeededTests();


}
