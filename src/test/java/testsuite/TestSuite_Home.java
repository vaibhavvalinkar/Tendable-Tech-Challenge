package testsuite;

import actions.ActionHelper;
import base.BaseTestClass;
import com.deque.html.axecore.axeargs.AxeRunOnlyOptions;
import com.deque.html.axecore.axeargs.AxeRunOptions;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;
import constants.Constants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.Header;
import pageobjects.HomePage;

import java.util.Arrays;
import java.util.List;

public class TestSuite_Home extends BaseTestClass {

    @DataProvider
    public Object[][] DataProvider_HeaderLinks() {
        Object[][] data = new Object[4][1];
        data[0][0] = "Home";
        data[1][0] = "Our Story";
        data[2][0] = "Our Solution";
        data[3][0] = "Why Tendable?";
        return data;
    }


    @Test(groups = {"Smoke", "Sanity"}, dataProvider = "DataProvider_HeaderLinks")
    public void TC_Home_001_ValidateAccessibility_HeaderLinks(String linkName) {
        ActionHelper.openUrl(Constants.BASE_URL);
        HomePage homePage = HomePage.getInstance();
        Assert.assertTrue(homePage.checkAccessibility(linkName), "Accessibility of the link is broken = " + linkName);
    }


    @Test(groups = {"Smoke", "Sanity"}, dataProvider = "DataProvider_HeaderLinks")
    public void TC_Home_002_VerifyVisibility_RequestADemoButton(String linkName) {
        ActionHelper.openUrl(Constants.BASE_URL);
        HomePage homePage = HomePage.getInstance();
        homePage.click_Header_Lnk(linkName);
        Assert.assertTrue(homePage.isPresent_RequestDemo_Btn(), "Check Request A Demo Button is Displayed on Page " + linkName);
        Assert.assertTrue(homePage.isEnabled_RequestDemo_Btn(), "Check Request A Demo Button is Enabled on Page " + linkName);

    }

}
