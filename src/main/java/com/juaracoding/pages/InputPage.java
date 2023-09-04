package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPage {
    private WebDriver driver;
    public InputPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator Element @FindBy
    @FindBy(xpath = "//button[@id='btnEdit']")
    WebElement btnEdit;
    @FindBy(xpath = "//input[@id='name']")
    WebElement name;
    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement bpjs;
    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement ktp;
    @FindBy(xpath = "//textarea[@id='address']")
    WebElement alamat;
    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement dropDownKotaKTP;
    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;
    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement dropDownFaskesTujuan;
    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasan;
    @FindBy(xpath ="//button[@id='btnUpdate']")
    WebElement btnUpdate;
    @FindBy(xpath ="//button[@id='btnCancelUpdate']")
    WebElement btnCancelUpdate;
    @FindBy(xpath  ="//a[@class='btn btn-primary']")
    WebElement btnSubmit;

    public void clickBtnEdit(){
        btnEdit.click();
    }
    public void enterName(String name){
        this.name.sendKeys(name);
    }
    public void enterBPJS(String bpjs){
        this.bpjs.sendKeys(bpjs);
    }
    public void enterKTP(String ktp){
        this.ktp.sendKeys(ktp);
    }
    public void selectDropDownKotaKTP(String kotaKTP){
        dropDownKotaKTP.click();
        this.dropDownKotaKTP.sendKeys(kotaKTP + Keys.ENTER);
    }
    public void enterFaskesAwal(String faskesAwal){
        this.faskesAwal.sendKeys(faskesAwal);
    }
    public void selectDropDownFaskesTujuan(String faskesTujuan){
        dropDownFaskesTujuan.click();
        this.dropDownFaskesTujuan.sendKeys(faskesTujuan + Keys.ENTER);
    }
    public void enterAlasan(String alasan){
        this.alasan.sendKeys(alasan);
    }
    public void clickBtnUpdate(){
        btnUpdate.click();
    }
    public void clickBtnCancel(){
        btnCancelUpdate.click();
    }








}
