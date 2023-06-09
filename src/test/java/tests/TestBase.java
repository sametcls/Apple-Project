package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.Driver;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {

    protected static ExtentReports extentReport; // manages the report generation
    protected static ExtentSparkReporter htmlReport; // generates the html report
    protected static ExtentTest logger; // manages the individual test steps and logs

    @BeforeSuite
    public void setupReport(){
        extentReport = new ExtentReports();
        String path = System.getProperty("user.dir") + "/target/extentReports/report.html";
        System.out.println(path);
        htmlReport = new ExtentSparkReporter(path);
        extentReport.attachReporter(htmlReport);


    }

    @BeforeMethod(alwaysRun = true)
    public void setUpEachMethod(Method method) throws IOException {


        Driver.getDriver().manage () .window() .maximize ();
        Driver.getDriver().manage () .timeouts() .implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
        logger = extentReport.createTest(method.getName());

    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDownMethod(ITestResult testResult) {
//
//        if (testResult.getStatus() == ITestResult.SUCCESS) {
//
//            logger.pass("TEST PASSED.");
//        }else if (testResult.getStatus() == ITestResult.FAILURE){
//            logger. fail ( "TEST FAILED.");
//            logger.fail(testResult.getThrowable());
//            String path = SeleniumUtils.getScreenshot ( "failed");
//            logger.addScreenCaptureFromPath (path);
//        }else {
//            logger .skip("TEST SKIPPED.");
//        }
//
//        Driver.quitDriver();
//    }

    @AfterSuite
    public void tearDownReport(){

        extentReport.flush();
    }

}
