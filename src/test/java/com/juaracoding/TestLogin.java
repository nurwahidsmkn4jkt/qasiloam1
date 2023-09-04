package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User access Siloam url")
    public void user_access_siloam_url(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User access Siloam url");
    }
    @When("User enter valid admin username")
    public void user_enter_registered_admin_username(){
        loginPage.enterUsername("admindika");
        extentTest.log(LogStatus.PASS, "User enter valid admin username");
   }
    @And("User enter valid admin password")
    public void user_enter_registered_admin_password(){
        loginPage.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter valid admin password");
    }
    @When("User enter valid sales username")
    public void user_enter_registered_sales_username(){
        loginPage.enterUsername("D6200927");
        extentTest.log(LogStatus.PASS, "User enter valid sales username");
   }
    @And("User enter valid sales password")
    public void user_enter_registered_sales_password(){
        loginPage.enterPassword("1997-10-23");
        extentTest.log(LogStatus.PASS, "User enter valid sales password");
    }
    @And("User click button login")
    public void user_click_button_login(){
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }
    @Then("User should see text title page Home")
    public void user_get_text_title_page_home(){
        Assert.assertEquals(loginPage.getTxtHome(), "Home");
        extentTest.log(LogStatus.PASS, "User should see text title page Home");
      }
    @Then("User should see Administrator text")
    public void user_get_text_administrator(){
        Assert.assertEquals(loginPage.getTxtAdministrator(), "Administrator");
        extentTest.log(LogStatus.PASS, "User should see Administrator text");
        loginPage.logout();
    }
    @Then("User should see Profile Name text")
    public void user_get_text_profile_name(){
        Assert.assertEquals(loginPage.getTxtProfileName(), "ELVA YUNDRA RINDYANA");
        extentTest.log(LogStatus.PASS, "User should see Profile Name text");
        loginPage.logout();
    }
}
