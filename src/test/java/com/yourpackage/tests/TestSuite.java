package com.yourpackage.tests;

/**
 * Created by agorina on 03.04.2015.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ emptyField.class})
//RecordOnCources.class, addCatalog.class , addPublishes.class, addComments.class, addHotel.class,
public class TestSuite {
    public static void main(String[] args) {

    }
}

