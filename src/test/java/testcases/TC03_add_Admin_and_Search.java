package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P03_Add_Admin_and_SearchPage;
import pages.P01_LoginPage;
import static drivers.DriverHolder.getDriver;
import static pages.BasePage.captureScreenshot;
import static pages.P01_LoginPage.actualMessagefor_Login;
import static pages.P01_LoginPage.expected_Messagefor_Login;
import static util.Utlity.*;
import static util.Utlity.generateDynamicPassword;

public class TC03_add_Admin_and_Search extends BaseTest {

    static String username = generateUniqueUsername();
    static String password = generateDynamicPassword();
    @Test(priority = 1, description = "ADD Admin_and_Search")
    public void add_Admin_and_Search_Valid_data_P() throws InterruptedException {
        // TODO: ADD Admin_and_Search
        new P03_Add_Admin_and_SearchPage(getDriver()).
                click_on_Admin_From_Menu()
                .click_to_Add_new_Admin()
                .click_on_Admin_User()
                .clickAdminDropdown_List()
                .setEmployee_Name("a")
                .get_EmployeeName()
                .clickStatusDropDown()
                .clickEnabled()
                .setUserName_Text(username)
                .setPassword_Text(password)
                .setConfirmPassword_Text(password)
                .saveResults();
        captureScreenshot(getDriver(), "Add_Admin");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        new P03_Add_Admin_and_SearchPage(getDriver())
                .searchforAddedUser(username)
                .press_to_SearchButton()
                .scrollToSearchResults()
                .verifySuccessmessage("(1) Record Found");
        captureScreenshot(getDriver(), "Search_Admin");
        Assert.assertTrue(new P03_Add_Admin_and_SearchPage(getDriver()).verifySuccessmessage("(1) Record Found"), "not completed");


    }
}
