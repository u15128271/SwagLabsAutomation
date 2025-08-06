import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;

    @Test
    public void StartChromeBrowser() {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();// Maximize the browser window
        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.id("login-button")).click();

        // Verify the title of the page
        String ProductText = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[3]/div")).getText();

        //Validate that the title is correct
        Assert.assertEquals("Products", ProductText);


    }
//    @After
//    //Close the browser after test execution
//    public void CloseBrowser(){
//        driver.quit();
//    }
}