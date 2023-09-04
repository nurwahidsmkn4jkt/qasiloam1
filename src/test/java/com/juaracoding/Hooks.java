package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.TestCases;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before //akan eksekusi setiap test case
    public void setUp(){
        DriverSingleton.getInstance(Constants.BROWSER);
        driver = DriverSingleton.getDriver();
        TestCases[] test = TestCases.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName().replace(" ","_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));
        }
    }

    @After
    public void endTestCase(){
        reports.endTest(extentTest);//hasil eksekusi scenario akan di generate reportnya
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }


}
