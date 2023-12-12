package pageobjects;

import actions.ActionHelper;
import org.openqa.selenium.By;

public class MarketWatchPage {

    private static MarketWatchPage _instance;

    private final By instrument_DD = By.id("ddlInstrumentName");
    private final By metalName_DD = By.id("ctl00_cph_InnerContainerRight_C005_ddlSymbols1");

    private final String allValues_MetalName_DD = "//div[@id='ctl00_cph_InnerContainerRight_C005_ddlSymbols1_DropDown']//li[text()='*']";

    private final By show_Btn = By.linkText("Show");
    private final By refresh_Btn = By.id("btnRefresh");

    private final By currentTime_Lbl = By.xpath("//div[@class='hidden-xs']");

    private final By expiryDate_Lbl = By.xpath("(//table[@class='markt marketwatch-table']//tr)[2]/td[3]");
    private final By currentPrice_Lbl = By.xpath("(//table[@class='markt marketwatch-table']//tr)[2]/td[9]");
    private final By loader_We = By.xpath("//table[@class='overlay2']");


    private MarketWatchPage() {
    }

    public static MarketWatchPage getInstance() {
        if (_instance == null)
            _instance = new MarketWatchPage();
        return _instance;
    }

    public void select_Instrument_DD(String value) {
        ActionHelper.selectFromDD(instrument_DD, value);
    }

    public void select_MetalName_DD(String value) {
        ActionHelper.click(metalName_DD);
        By by = By.xpath(allValues_MetalName_DD.replace("*", value));
        ActionHelper.click(by);
    }

    public void click_Show_Btn() {
        ActionHelper.click(show_Btn);
    }

    public void click_Refresh_Btn() {
        ActionHelper.click(refresh_Btn);
        waitForLoaderToHide();
    }

    public String getCurrentTime() {
        return ActionHelper.getText(currentTime_Lbl).replace("Refresh", "");
    }

    public String getExpiryDate() {
        return ActionHelper.getText(expiryDate_Lbl);
    }

    public String getCurrentPrice() {
        return ActionHelper.getText(currentPrice_Lbl);
    }

    public void waitForLoaderToHide() {
        ActionHelper.goToSleep(500);
        while (ActionHelper.isPresent(loader_We))
            ActionHelper.goToSleep(500);
    }
}
