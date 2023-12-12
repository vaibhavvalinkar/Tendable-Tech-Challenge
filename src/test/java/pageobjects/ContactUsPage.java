package pageobjects;

import actions.ActionHelper;
import org.openqa.selenium.By;

public class ContactUsPage {

    private static ContactUsPage _instance;

    private final By contact_Marketing_Btn = By.xpath("//div[contains(text(),'Marketing')]/..//button");
    private final By fullName_Txt = By.name("fullName");
    private final By organisationName_Txt = By.name("organisationName");
    private final By phoneNumber_Txt = By.name("cellPhone");
    private final By email_Txt = By.name("email");
    private final By iAgree_Rd = By.xpath("(//label[text()='I Agree'])[1]");
    private final By submit_Btn = By.name("form_page_submit");
    private final By errorMessage_Lbl = By.cssSelector(".ff-errors");


    private ContactUsPage() {
    }

    public static ContactUsPage getInstance() {
        if (_instance == null)
            _instance = new ContactUsPage();
        return _instance;
    }

    public void click_Contact_Marketing_Btn() {
        ActionHelper.click(contact_Marketing_Btn);
    }

    public void fill_FullName_Txt(String input) {
        ActionHelper.fill(fullName_Txt, input);
    }

    public void fill_OrganisationName_Txt(String input) {
        ActionHelper.fill(organisationName_Txt, input);
    }

    public void fill_PhoneNumber_Txt(String input) {
        ActionHelper.fill(phoneNumber_Txt, input);
    }

    public void fill_Email_Txt(String input) {
        ActionHelper.fill(email_Txt, input);
    }

    public void click_IAgree_Rd() {
        ActionHelper.click(iAgree_Rd);
    }

    public void click_Submit_Btn() {
        ActionHelper.click(submit_Btn);
    }

    public void fillForm_ContactUs_Marketing(String fullName, String organisationName, String phoneNo, String email) {
        fill_FullName_Txt(fullName);
        fill_FullName_Txt(organisationName);
        fill_OrganisationName_Txt(organisationName);
        fill_PhoneNumber_Txt(phoneNo);
        fill_Email_Txt(email);
    }

    public boolean isPresent_ErrorMessage_Lbl() {
        return ActionHelper.isPresentWithWait(errorMessage_Lbl);
    }

    public String getText_ErrorMessage_Lbl() {
        return ActionHelper.getText(errorMessage_Lbl);
    }
}
