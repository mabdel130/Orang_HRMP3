package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage extends BasePage {

    // TODO: constructor to intailize webdriver.
    public P01_LoginPage(WebDriver driver) {
        super(driver);
    }

    // TODO: define locators using By
    private final By USERNAME_TEXT = By.xpath("//input[@placeholder='Username']");
    private final By PASSWORD_TEXT = By.xpath("//input[@placeholder='Password']");
    private final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");
    private final By actual_assertion_Text = By.xpath("//p[@class=\"oxd-text oxd-text--p\"][1]");
    public static String expected_Messagefor_Login = "Time at Work";
    public static String actualMessagefor_Login;

    // TODO: public action methods
    public P01_LoginPage enterUsername(String username) {
        driver.findElement(this.USERNAME_TEXT).sendKeys(username);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage enterPassword(String password) {
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage clickLoginButton() throws InterruptedException {
        driver.findElement(this.LOGIN_BUTTON).click();
        Thread.sleep(5000);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage getconfirmationtextforlogin() throws InterruptedException {
        actualMessagefor_Login = driver.findElement(this.actual_assertion_Text).getText();
        Thread.sleep(5000);
        return this;
    }
}
