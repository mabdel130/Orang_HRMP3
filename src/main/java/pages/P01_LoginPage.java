package pages;

import actions.CustomeDecorator;
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
        new CustomeDecorator(driver,this.USERNAME_TEXT,0).sendKeys(username);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage enterPassword(String password) {
        new CustomeDecorator(driver,this.PASSWORD_TEXT,0).sendKeys(password);
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage clickLoginButton() throws InterruptedException {
        new CustomeDecorator(driver,this.LOGIN_BUTTON,5000).click();
        return new P01_LoginPage(driver);
    }
    public P01_LoginPage getconfirmationtextforlogin() throws InterruptedException {
        new CustomeDecorator(driver,this.actual_assertion_Text,5000).getText();
        return new P01_LoginPage(driver);
    }
}
