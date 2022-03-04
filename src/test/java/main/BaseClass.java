package main;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass extends ExtentReportsDemo {
    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;

    By button2 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
    By button3 = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03");
    By plus = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
    By equal = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
    By resultbtn = By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");



    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Galaxy A30");
        cap.setCapability("udid", "R58M829Q3WD");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
//        cap.setCapability("app","F:\\recharge\\Simpleappiumjava\\apkPath\\app-debug.apk");
        cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, cap);
        wait = new WebDriverWait(driver, 5);
        System.out.println("app started .....");
    }
}
