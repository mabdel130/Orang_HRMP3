package pages;

import actions.CustomeDecorator;
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
        new CustomeDecorator(driver, this.pim_Button, 100).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_newPIM() {
        new CustomeDecorator(driver, this.add_newPIM_Button, 100).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_first_name(String firstname) {
        new CustomeDecorator(driver, this.firstName_Text, 100).sendKeys(firstname);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_middle_name(String middlename) {
        new CustomeDecorator(driver, this.middleName_Text, 0).sendKeys(middlename);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_last_name(String lastname) {
        new CustomeDecorator(driver, this.lastName_Text, 0).sendKeys(lastname);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_employee_Id(long employee_Id) {
        new CustomeDecorator(driver, this.employee_Id_Text, 100).sendKeys(String.valueOf(employee_Id));
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage loginDetails() throws InterruptedException {
        new CustomeDecorator(driver, this.loginDetails_Button, 100).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_user_name(String username) throws InterruptedException {
        new CustomeDecorator(driver, this.username_Text, 100).sendKeys(username);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage add_password(String password) throws InterruptedException {
        new CustomeDecorator(driver, this.password_Text, 100).sendKeys(password);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage confirm_password(String password) throws InterruptedException {
        new CustomeDecorator(driver, this.confirmPassword_Text, 100).sendKeys(password);
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage click_on_save() throws InterruptedException {
        new CustomeDecorator(driver, this.save_Button, 3000).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage getconfirmationtextforAdd_PIM() throws InterruptedException {

        actualMessageforAdd_PIM = new CustomeDecorator(driver, this.confirmation_Text, 100).getText();

        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage click_on_search_for_PIM() throws InterruptedException {
        new CustomeDecorator(driver, this.search_for_PIM_Button, 100).click();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage search_By_Name(String firstname) throws InterruptedException {
        new CustomeDecorator(driver, this.employee_Name_in_Search_Text, 100).sendKeys(firstname);

        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage get_confirmation_text_for_Search_PIM() throws InterruptedException {
        actualMessageforSearch_PIM = new CustomeDecorator(driver, this.confirmation_TextAfterSearch, 200).getText();
        return new P02_Add_PIM_and_SearchPage(driver);
    }

    public P02_Add_PIM_and_SearchPage scrollToSearchResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
        return new P02_Add_PIM_and_SearchPage(driver);
    }
}









