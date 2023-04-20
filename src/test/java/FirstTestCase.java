import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestCase {
    WebDriver driver;

    @Test()
    public void createCustomer() throws InterruptedException {
        driver = LoginTest.driver;
        WebElement linkToNewCustomer = driver.findElement(By.linkText("New Customer"));

        linkToNewCustomer.click();

        Thread.sleep(5000);
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData(){
        return new Object[][] {
                {"mngr480446", "pAbUvuq", "https://demo.guru.com/v4/manager/Managerhomepage.php"}
        };
    }

}
