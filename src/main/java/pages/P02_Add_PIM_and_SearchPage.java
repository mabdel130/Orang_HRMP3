package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P02_Add_PIM_and_SearchPage extends BasePage {

    public P02_Add_PIM_and_SearchPage(WebDriver driver) {
        super(driver);
    }

    public static String expected_TextforAdd_PIM = "Personal Details";
    public static String actualMessageforAdd_PIM;
    public static String expected_TextforSearch_PIM = "(1) Record Found";
    public static String actualMessageforSearch_PIM;


    // TODO: define locators using By
    private final By pim_Button = By.xpath("//span[normalize-space()='PIM']");
    private final By add_newPIM_Button = By.xpath("//button[normalize-space()='Add']");
    private final By firstName_Text = By.xpath("//input[@placeholder='First Name']");
    private final By middleName_Text = By.xpath("//input[@placeholder='Middle Name']");
    private final By lastName_Text = By.xpath("//input[@placeholder='Last Name']");
    private final By employee_Id_Text = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By loginDetails_Button = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    private final By username_Text = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By password_Text = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    private final By confirmPassword_Text = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
    private final By save_Button = By.xpath("//button[normalize-space()='Save']");
    private final By confirmation_Text = By.xpath("//h6[normalize-space()='Personal Details']");
    private final By employee_Id_in_Search_Text = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    private final By search_for_PIM_Button = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
    private final By employee_Name_in_Search_Text = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    private final By confirmation_TextAfterSearch = By.xpath("//span[@class=\"oxd-text oxd-text--span\"][1]");


    // TODO: public action methods
    public P02_Add_PIM_and_SearchPage click_on_PIMButton() throws InterruptedException {
        driver.findElement(this.pim_Button).click();
        Thread.sleep(5000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_newPIM() {
        driver.findElement(this.add_newPIM_Button).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_first_name(String firstname) {
        driver.findElement(this.firstName_Text).sendKeys(firstname);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_middle_name(String middlename) {
        driver.findElement(this.middleName_Text).sendKeys(middlename);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_last_name(String lastname) {
        driver.findElement(this.lastName_Text).sendKeys(lastname);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_employee_Id(long employee_Id) {
        driver.findElement(this.employee_Id_Text).sendKeys(String.valueOf(employee_Id));
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage loginDetails() throws InterruptedException {
        driver.findElement(this.loginDetails_Button).click();
        Thread.sleep(5000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_user_name(String username) throws InterruptedException {
        driver.findElement(this.username_Text).sendKeys(username);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_password(String password) throws InterruptedException {
        driver.findElement(this.password_Text).sendKeys(password);
        Thread.sleep(5000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage confirm_password(String password) throws InterruptedException {
        driver.findElement(this.confirmPassword_Text).sendKeys(password);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage click_on_save() throws InterruptedException {
        driver.findElement(this.save_Button).click();
        Thread.sleep(7000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage getconfirmationtextforAdd_PIM() throws InterruptedException {

        actualMessageforAdd_PIM = driver.findElement(this.confirmation_Text).getText();
        Thread.sleep(7000);
        return this;
    }

    public P02_Add_PIM_and_SearchPage click_on_search_for_PIM() throws InterruptedException {
        driver.findElement(this.search_for_PIM_Button).click();
        Thread.sleep(7000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage search_By_Name(String firstname) throws InterruptedException {
        driver.findElement(this.employee_Name_in_Search_Text).sendKeys(firstname);
        Thread.sleep(5000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage get_confirmation_text_for_Search_PIM() throws InterruptedException {
        actualMessageforSearch_PIM = driver.findElement(this.confirmation_TextAfterSearch).getText();
        Thread.sleep(5000);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage scrollToSearchResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
        return new P02_Add_PIM_and_SearchPage(driver);
    }
}









