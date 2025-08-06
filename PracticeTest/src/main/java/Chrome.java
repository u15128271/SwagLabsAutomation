import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    WebDriver driver;

    @Test
    public void StartChromeBrowser() {
        driver = new ChromeDriver(); // Initialize ChromeDriver
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();// Maximize the browser window
        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.id("login-button")).click();


    }
//    @After
//    //Close the browser after test execution
//    public void CloseBrowser(){
//        driver.quit();
//    }
}