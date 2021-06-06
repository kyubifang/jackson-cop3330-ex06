package base;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_age_retire_when_and_year() {
        App myApp = new App();
        String age = "25";
        String retire = "65";
        int intAge = Integer.parseInt(age);
        int intRetire = Integer.parseInt(retire);
        int when = intRetire - intAge;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retirement = year + when;

        String expectedOutput = "You have 40 years left until you can retire.\n" +
                "It's 2021, so you can retire in 2061.";
        String actualOutput = myApp.generateOutputString(when, year, retirement);

        assertEquals(expectedOutput, actualOutput);
    }
}