package actions;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionHelper {

    public static WebElement waitUntilElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static List<WebElement> waitUntilAllElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public static WebElement findElement(By by) {
        return waitUntilElementVisible(by);
    }

    public static List<WebElement> findElements(By by) {
        return waitUntilAllElementVisible(by);
    }


    public static void openUrl(String url) {
        DriverManager.getDriver().get(url);
    }

    public static void fill(By by, String input) {
        findElement(by).sendKeys(input);
    }

    public static void click(By by) {
        try {
            findElement(by).click();
        } catch (Exception e) {
            clickWithJavaScript(by);
        }
    }

    public static void selectFromDD(By by, String value) {
        new Select(findElement(by)).selectByVisibleText(value);
    }

    public static String getText(By by) {
        return findElement(by).getText();
    }

    public static String getAttribute(By by, String attributeName) {
        return findElement(by).getAttribute(attributeName);
    }


    public static void goToSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
        }
    }

    public static boolean isPresent(By by) {
        return !DriverManager.getDriver().findElements(by).isEmpty() && DriverManager.getDriver().findElement(by).isDisplayed();
    }

    public static boolean isPresentWithWait(By by) {
        return !findElements(by).isEmpty() && findElement(by).isDisplayed();
    }

    public static boolean isEnabled(By by) {
        return !DriverManager.getDriver().findElements(by).isEmpty() && DriverManager.getDriver().findElement(by).isEnabled();
    }

    public static void clickWithJavaScript(By by) {
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", findElement(by));
    }
}
