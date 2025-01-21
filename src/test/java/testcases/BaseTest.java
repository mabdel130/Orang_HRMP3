package testcases;
import common.MyScreenRecorder;
import drivers.DriverFactory;
import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.getDriver;
import static drivers.DriverHolder.setDriver;
import static pages.BasePage.quitBrowser;

public class BaseTest {
    String usernamelogin = "Admin";
    String passwordlogin = "admin123";

    @BeforeSuite
    public void bruteforce() throws Exception {
        MyScreenRecorder.startRecording("LOGIN.TEST");
    }

    @Parameters("browsername")
    @BeforeTest
    public void OpenBrower(@Optional String browsername) throws AWTException {
        setDriver(DriverFactory.getNewInstance(""));

        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //openBrowserNetworkTab();

    }

    @AfterTest
    public void TearDown() {
        quitBrowser(getDriver());
    }


    @AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();

    }
}


