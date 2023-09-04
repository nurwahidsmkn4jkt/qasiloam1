package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class LoginPage {
    // Locator Element @FindBy
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    @FindBy(xpath = "//h1[normalize-space()='Home']")
    WebElement txtHome;
    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    WebElement profileLink;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement logoutLink;
    private final WebDriver driver;
    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Custom Method
    public void enterUsername(String username) {
        this.username.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void logout() {
        profileLink.click();
        logoutLink.click();
    }

    public String getTxtHome() {
        delay(3);
        return txtHome.getText();
    }

    public String getTxtAdministrator() {
        delay(3);
        return profileLink.getText();
    }

    public String getTxtProfileName() {
        delay(3);
        return profileLink.getText();
    }
}
