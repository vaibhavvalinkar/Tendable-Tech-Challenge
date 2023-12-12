package pageobjects;


import actions.ActionHelper;
import org.openqa.selenium.By;

public class HomePage extends Header {
    private static HomePage _instance;

    private HomePage() {
    }

    public static HomePage getInstance() {
        if (_instance == null)
            _instance = new HomePage();
        return _instance;
    }

    public boolean checkAccessibility(String linkName) {
        By by = By.linkText(linkName);
        if (linkName.equalsIgnoreCase("Home")) {
            by = logo_Img;
        }
        return ActionHelper.isPresentWithWait(by) && ActionHelper.isEnabled(by);
    }


}
