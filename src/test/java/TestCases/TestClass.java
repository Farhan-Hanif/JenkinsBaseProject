package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
    public static WebDriver driver;

    @BeforeTest
    public void launchBrowserTestNG() {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/BaseProjectForJenkins/Chrome/chromedriver_2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void googleTest() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        System.out.println("Navigate to google");
    }

    @Test(priority = 2)
    public void facebookTest() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        System.out.println("Navigate to facebook");
        driver.quit();
    }
}
