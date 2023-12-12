package pageobjects;

import actions.ActionHelper;
import org.openqa.selenium.By;

public class Header {

    protected final By logo_Img = By.xpath("//a[@class='logo']");
    private final By contactUs_Lnk = By.linkText("Contact Us");
    private final By requestDemo_Btn = By.xpath("(//a[text()='Request a Demo'])[2]");


    public void click_ContactUs_Lnk() {
        ActionHelper.click(contactUs_Lnk);
    }

    public void click_Header_Lnk(String linkName) {
        if (linkName.equalsIgnoreCase("Home"))
            click_Home_Logo_Img();
        else
            ActionHelper.click(By.linkText(linkName));
    }

    public void click_Home_Logo_Img() {
        ActionHelper.click(logo_Img);
    }

    public void click_RequestDemo_Btn() {
        ActionHelper.click(requestDemo_Btn);
    }

    public boolean isPresent_RequestDemo_Btn() {
        return ActionHelper.isPresent(requestDemo_Btn);
    }

    public boolean isEnabled_RequestDemo_Btn() {
        return ActionHelper.isEnabled(requestDemo_Btn);
    }
}
