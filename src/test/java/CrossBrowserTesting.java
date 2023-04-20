import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class CrossBrowserTesting {


    WebDriver driver;

    @Test()
    @Parameters({"browserName"})
    public void createCustomer(String browserName){

        if (browserName.equals("Chrome")){
            driver = new ChromeDriver();
        }
        else if (browserName.equals("Firefox")){
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/v4");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
