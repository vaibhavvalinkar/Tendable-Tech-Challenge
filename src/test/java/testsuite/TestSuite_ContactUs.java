package testsuite;

import actions.ActionHelper;
import base.BaseTestClass;
import constants.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ContactUsPage;
import pageobjects.HomePage;

public class TestSuite_ContactUs extends BaseTestClass {

    @Test (groups = {"Smoke","Sanity"})
    public void TC_ContactUs_001_Validate_ErrorMessage_MissingMessageField_FillContactUsForm() {
        ActionHelper.openUrl(Constants.BASE_URL);
        HomePage.getInstance().click_ContactUs_Lnk();
        ContactUsPage contactUsPage = ContactUsPage.getInstance();
        contactUsPage.click_Contact_Marketing_Btn();
        contactUsPage.fillForm_ContactUs_Marketing(Constants.FULL_NAME, Constants.ORGANISATION_NAME,
                Constants.PHONE_NO, Constants.EMAIL);
        contactUsPage.click_IAgree_Rd();
        contactUsPage.click_Submit_Btn();
        Assert.assertTrue(contactUsPage.isPresent_ErrorMessage_Lbl(), "Check Visibility of Error Message");
        Assert.assertEquals(contactUsPage.getText_ErrorMessage_Lbl(), "This field is required", "Compare error message Text");
    }
}
