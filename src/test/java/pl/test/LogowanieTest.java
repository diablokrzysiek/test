package pl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LogowanieTest extends FuncionalTest
{
//    @Test
//    public void verifyHomepageTitle() {
//        String expectedTitle = "Osadnicy - gra przeglÄdarkowa";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, expectedTitle);
//    }

    @Test
    public void logowanie() {
        Logowanie logowanie = new Logowanie(driver);
        logowanie.logowanie("adam", "qwerty");

        String expectedTitle = "Osadnicy - gra przeglądarkowa";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}