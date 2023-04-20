
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/v4");
    }

    @Test
    @Parameters({"userId", "password"})
    public void loginAs(String userId, String password){

        WebElement userIDFld = driver.findElement(By.name("uid"));
        WebElement passwordFld = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.name("btnLogin"));

        userIDFld.sendKeys(userId);
        passwordFld.sendKeys(password);
        loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/v4/manager/Managerhomepage.php");
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }
}
