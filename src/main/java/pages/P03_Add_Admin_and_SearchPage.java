package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P03_Add_Admin_and_SearchPage extends BasePage {

    public P03_Add_Admin_and_SearchPage(WebDriver driver) {
        super(driver);
    }

    private final By admin_Button = By.linkText("Admin");
    private final By AddAdmin_Button = By.xpath("//button[normalize-space()='Add']");
    private final By AdminDropDown_DWlist = By.xpath("(//i[@data-v-bddebfba='' and @data-v-67d2aedf='' and contains(@class, 'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[1]");
    private final By statusDropDown_Dwlist = By.xpath("(//div[@class='oxd-select-text-input'])[2]");  // (//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]
    private final By employeefirstName_Text = By.xpath("//input[@placeholder='Type for hints...']");
    private final By userName_Text = By.xpath("(//input[contains(@class, 'oxd-input--active')] )[2]"); // (//input[@class='oxd-input oxd-input--active'])[2]
    private final By password_Text = By.xpath("(//input[@class='oxd-input oxd-input--active' and @type='password' and @autocomplete='off'])[1]");
    private final By confirmPassword_Text = By.xpath("(//input[@type='password'])[2]");         // //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input
    private final By saveButton = By.xpath("//button[@type='submit']");
    private final By search_for_Admin_Button = By.xpath("(//input['.oxd-input.oxd-input--focus'])[2]");
    private final By employee_Name_in_Search_Text = By.xpath("//button[@type='submit']");
    private final By confirmation_TextAfterSearch_Text = By.xpath("//span[normalize-space()='(1) Record Found']");

    public P03_Add_Admin_and_SearchPage click_on_Admin_From_Menu() {
        driver.findElement(this.admin_Button).click();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage click_to_Add_new_Admin() {
        driver.findElement(this.AddAdmin_Button).click();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage click_on_Admin_User() {
        driver.findElement(this.AdminDropDown_DWlist).click();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage clickAdminDropdown_List() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    public P03_Add_Admin_and_SearchPage setEmployee_Name(String firstname) {
        driver.findElement(this.employeefirstName_Text).sendKeys(firstname);
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage clickStatusDropDown() {
        wait.until(ExpectedConditions.elementToBeClickable(statusDropDown_Dwlist)).click();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage get_EmployeeName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(this.employeefirstName_Text).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(this.employeefirstName_Text).sendKeys(Keys.ENTER);
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage clickEnabled() throws InterruptedException {
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        Thread.sleep(2000);

        actions.sendKeys(Keys.ENTER).perform();
        return new P03_Add_Admin_and_SearchPage(driver);

    }

    public P03_Add_Admin_and_SearchPage setUserName_Text(String employeeUsername) {
        driver.findElement(this.userName_Text).sendKeys(employeeUsername);
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage setPassword_Text(String addPassword) {
        driver.findElement(this.password_Text).sendKeys(addPassword);
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage setConfirmPassword_Text(String addPassword) {

        driver.findElement(this.confirmPassword_Text).sendKeys(addPassword);
        return new P03_Add_Admin_and_SearchPage(driver);
    }


    public P03_Add_Admin_and_SearchPage searchforAddedUser(String employeeUsername) {

        driver.findElement(search_for_Admin_Button).sendKeys(employeeUsername);
        return this;
    }

    public P03_Add_Admin_and_SearchPage press_to_SearchButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(employee_Name_in_Search_Text).click();
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public P03_Add_Admin_and_SearchPage saveResults() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(saveButton).click();
        Thread.sleep(6000);
        return new P03_Add_Admin_and_SearchPage(driver);
    }

    public boolean verifySuccessmessage(String oneRecord) {
        return driver.findElement(confirmation_TextAfterSearch_Text).getText().contains(oneRecord);
    }
    public P03_Add_Admin_and_SearchPage scrollToSearchResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
        return new P03_Add_Admin_and_SearchPage(driver);
    }
}
