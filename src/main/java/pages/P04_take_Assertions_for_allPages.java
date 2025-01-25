package pages;
import actions.CustomeDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class P04_take_Assertions_for_allPages extends BasePage {
    public P04_take_Assertions_for_allPages(WebDriver driver) {
        super(driver);
    }
    public static String expectedMassage_for_Leave = "No Records Found";
    public static String actualMessage_for_Leave;

    public static String expectedMassage_for_Dashboard = "Employees on Leave Today";
    public static String actualMessage_for_Dashboard;

    public static String expectedMassage_for_Time = "(3) Records Found";
    public static String actualMessage_for_Time;

     // locators for leave Page:
    private final By leave_page_Button = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Leave']");
    private final By search_for_Employee_Leave_Button=By.xpath("//input[@placeholder='Type for hints...']");
    private final By search_button=By.xpath("//button[normalize-space()='Search']");
    private final By assertion_search_item_Text =By.xpath("//span[@class=\"oxd-text oxd-text--span\"]");

    // locators for Dashboard Page:
    private final By dashboard_page_Button = By.xpath("//span[text()='Dashboard']");
    private final By assertion_dashboard_item_Text=By.xpath("//p[normalize-space()='Employees on Leave Today']");

    // locators for Time Page:
    private final By time_page_Button = By.xpath("//span[text()='Time']");
    private final By search_for_Employee_Time_Button=By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    private final By view_button=By.xpath("//button[starts-with(@class, 'oxd-button')]");
    private final By assertion_time_item_Text=By.xpath("//span[@class='oxd-text oxd-text--span']");


   // public action methods for leave Page :

    public P04_take_Assertions_for_allPages  click_on_Leave_From_Menu() throws InterruptedException {
        new CustomeDecorator(driver,this.leave_page_Button,7000).click();
        return new P04_take_Assertions_for_allPages(driver);
    }

    public P04_take_Assertions_for_allPages search_Employee_Name(String firstname) throws InterruptedException {
        new CustomeDecorator(driver,this.search_for_Employee_Leave_Button,1000).sendKeys(firstname);
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages  click_on_Search_Button() throws InterruptedException {
        new CustomeDecorator(driver,this.search_button,1000).click();
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages getconfirmationtext_for_Leave() throws InterruptedException {
      actualMessage_for_Leave =  new CustomeDecorator(driver,this.assertion_search_item_Text,1000).getText();
        return new P04_take_Assertions_for_allPages(driver);
    }


    // public action methods for leave Page :

    public P04_take_Assertions_for_allPages click_on_Dashboard_From_Menu() throws InterruptedException {
        new CustomeDecorator(driver,this.dashboard_page_Button,7000).click();
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages getconfirmationtext_for_Dashboard() throws InterruptedException {

        actualMessage_for_Dashboard =  new CustomeDecorator(driver,this.assertion_dashboard_item_Text,7000).getText();
        return new P04_take_Assertions_for_allPages(driver);
    }


    // public action methods for Time Page :

    public P04_take_Assertions_for_allPages  click_on_Time_From_Menu() throws InterruptedException {
        new CustomeDecorator(driver,this.time_page_Button,7000).click();
        return new P04_take_Assertions_for_allPages(driver);
    }

    public P04_take_Assertions_for_allPages Time_Employee_Name(String firstname) throws InterruptedException {
        new CustomeDecorator(driver,this.search_for_Employee_Time_Button,7000).sendKeys(firstname);
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages  click_on_view_Button() throws InterruptedException {
        new CustomeDecorator(driver,this.view_button,1000).click();
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages getconfirmationtext_for_Time() throws InterruptedException {
        actualMessage_for_Time = new CustomeDecorator(driver, this.assertion_time_item_Text, 100).getText();
        return new P04_take_Assertions_for_allPages(driver);
    }
    public P04_take_Assertions_for_allPages scrollToSearchResults() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");
        return new P04_take_Assertions_for_allPages(driver);
    }

}
