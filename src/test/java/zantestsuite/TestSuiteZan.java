package zantestsuite;

/**
 * Created by agorina on 09.04.2015.
 */

import com.yourpackage.tests.emptyField;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({ enterAdmin.class, newEmployer.class, zanNewVacancy.class})

public class TestSuiteZan {
    public static void main(String[] args) {

    }
}
