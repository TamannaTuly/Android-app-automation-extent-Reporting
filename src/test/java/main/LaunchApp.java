package main;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;



public class LaunchApp extends BaseClass {
//    public static void main(String[] args) {
//        try {
//            setUp();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }



    @Test
    public void doTest(Method method) throws InterruptedException{


        ExtentTest test = extent.createTest("TestOne", "What the fuck description");
        test.log(Status.INFO, "log : started");
        wait.until(ExpectedConditions.visibilityOfElementLocated(button2)).click();
        test.log(Status.PASS, "Entering value 2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(plus)).click();
        test.log(Status.PASS, "Pressing plus");
        wait.until(ExpectedConditions.visibilityOfElementLocated(button3)).click();
        test.log(Status.PASS, "Entering value 3");
        wait.until(ExpectedConditions.visibilityOfElementLocated(equal)).click();
        test.log(Status.PASS, "Pressing equals");

        String ans = wait.until(ExpectedConditions.visibilityOfElementLocated(resultbtn)).getText();

        Assert.assertTrue(ans.contains("5"));
        test.log(Status.PASS, "Test DONE");
    }

    @AfterMethod
    public void qTest(){
        driver.quit();
    }


}

