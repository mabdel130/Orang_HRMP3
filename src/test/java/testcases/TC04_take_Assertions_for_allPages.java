package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P04_take_Assertions_for_allPages;

import static drivers.DriverHolder.getDriver;
import static pages.BasePage.captureScreenshot;
import static pages.P01_LoginPage.actualMessagefor_Login;
import static pages.P01_LoginPage.expected_Messagefor_Login;
import static pages.P04_take_Assertions_for_allPages.*;
import static util.Utlity.generateUniqueUsername;

public class TC04_take_Assertions_for_allPages extends BaseTest {

    @Test(priority = 1, description = "assert for leave Page")
    public void assert_for_leave_Page_P() throws InterruptedException {
// TODO: login to app
        new P01_LoginPage(getDriver())
                .enterUsername(usernamelogin)
                .enterPassword(passwordlogin)
                .clickLoginButton().getconfirmationtextforlogin();
        captureScreenshot(getDriver(), "LoginWithValid Data");
        Assert.assertEquals(actualMessagefor_Login, expected_Messagefor_Login, "Text does not match!");

// TODO: assert for leave Page
        new P04_take_Assertions_for_allPages(getDriver())
                .click_on_Leave_From_Menu()
                .search_Employee_Name("Timothy Lewis Amiano")
                .scrollToSearchResults()
                .click_on_Search_Button()
                .getconfirmationtext_for_Leave()
                .scrollToSearchResults();
        captureScreenshot(getDriver(), "assert for leave Page");
        Assert.assertEquals(actualMessage_for_Leave, expectedMassage_for_Leave, "Text does not match!");

    }

    @Test(priority = 2, description = "assert for Dashboard Page")
    public void assert_for_Dashboard_Page_P() throws InterruptedException {
// TODO: assert for Dashboard Page
        new P04_take_Assertions_for_allPages(getDriver())
                .click_on_Dashboard_From_Menu()
                .scrollToSearchResults()
                .getconfirmationtext_for_Dashboard()
                .scrollToSearchResults();
        captureScreenshot(getDriver(), "Assertion for Dashboard");
        Assert.assertEquals(actualMessage_for_Dashboard, expectedMassage_for_Dashboard, "Text does not match!");


    }

    @Test(priority = 3, description = "assert for Time Page")
    public void assert_for_Time_Page_P() throws InterruptedException {
// TODO: assert for Dashboard Page
        new P04_take_Assertions_for_allPages(getDriver())
                .click_on_Time_From_Menu()
                .Time_Employee_Name("manda akhil user")
                .scrollToSearchResults()
                .getconfirmationtext_for_Time();
        captureScreenshot(getDriver(), "Assertion for Time");
        Assert.assertEquals(actualMessage_for_Time, expectedMassage_for_Time, "Text does not match!");



    }
}