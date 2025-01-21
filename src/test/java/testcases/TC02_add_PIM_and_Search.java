package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_LoginPage;
import pages.P02_Add_PIM_and_SearchPage;

import static drivers.DriverHolder.getDriver;
import static pages.P01_LoginPage.*;
import static pages.P01_LoginPage.expected_Messagefor_Login;
import static pages.P02_Add_PIM_and_SearchPage.*;
import static util.Utlity.*;

public class TC02_add_PIM_and_Search extends BaseTest {


    static String firstname = generateRandomFirstName();
    static String middlename = generateRandomMiddleName();
    static String lastname = generateRandomLastName();
    static long employee_Id = generateUniqueEmployeeId();
    static String username = generateUniqueUsername();
    static String password = generateDynamicPassword();


    @Test(priority = 1, description = "Add Pim data")
    public void add_PIM_and_Search_Valid_data_P() throws InterruptedException {
// TODO: login to app
        new P01_LoginPage(getDriver())
                .enterUsername(usernamelogin)
                .enterPassword(passwordlogin)
                .clickLoginButton().getconfirmationtextforlogin();
        // captureScreenshot(getDriver(), "LoginWithValid Data");

        Assert.assertEquals(actualMessagefor_Login, expected_Messagefor_Login, "Text does not match!");


// TODO: ADD PIM Data

        new P02_Add_PIM_and_SearchPage(getDriver())
                .click_on_PIMButton()
                .add_newPIM()
                .add_first_name(firstname)
                .add_middle_name(middlename)
                .add_last_name(lastname)
                .add_employee_Id(employee_Id)
                .loginDetails()
                .add_user_name(username)
                .add_password(password)
                .confirm_password(password)
                .click_on_save()
                .getconfirmationtextforAdd_PIM()
                .click_on_PIMButton()
                .search_By_Name(firstname)
                .click_on_search_for_PIM().scrollToSearchResults().get_confirmation_text_for_Search_PIM();
        // captureScreenshot(getDriver(), "Add_PIM");
        Assert.assertEquals(actualMessageforAdd_PIM, expected_TextforAdd_PIM, "Text does not match!");
        Assert.assertEquals(actualMessageforSearch_PIM, expected_TextforSearch_PIM, "Text does not match!");

    }

}
