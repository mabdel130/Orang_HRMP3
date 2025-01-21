package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;

import static drivers.DriverHolder.getDriver;
import static pages.BasePage.captureScreenshot;
import static pages.P01_LoginPage.*;

public class TC01_Login extends BaseTest {
    P01_LoginPage loginPage;

    @Test(priority = 1, description = "Login to Orang_HRM With Valid Data")
    public void login_to_my_account_With_Valid_data_P() throws InterruptedException {
        // TODO: login to app
        loginPage = new P01_LoginPage(getDriver());
        new P01_LoginPage(getDriver())
                .enterUsername(usernamelogin)
                .enterPassword(passwordlogin)
                .clickLoginButton().getconfirmationtextforlogin();
       // captureScreenshot(getDriver(), "LoginWithValid Data");
        Assert.assertEquals( actualMessagefor_Login,expected_Messagefor_Login, "Text does not match!");


    }


}


