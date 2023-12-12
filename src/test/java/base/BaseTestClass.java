package base;

import driver.DriverManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestClass {

    @BeforeSuite
    public void beforeSuite() {
        DriverManager.startDriver();
    }

    @AfterSuite
    public void afterSuite() {
        DriverManager.quitDriver();
    }


}
