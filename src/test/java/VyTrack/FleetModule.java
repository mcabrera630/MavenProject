package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FleetModule {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open website
        driver.get("http://qa2.vytrack.com/user/login");
        System.out.println(driver.getTitle());

        // enter any email
        WebElement emailInput = driver.findElement(By.id("prependedInput"));

        // sendKeys email address
        emailInput.sendKeys("user30");

        // send Password keys
        driver.findElement(By.name("_password")).sendKeys("UserUser123");

        WebElement retrievePassword = driver.findElement(By.id("_submit"));

        retrievePassword.click();

        // verify

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        //compare code
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");

        //result
            System.out.println("Expected Result:  "+expectedTitle);
            System.out.println("Actual Result: "+ actualTitle);
        }





        Thread.sleep(5000);

        driver.quit();
    }
}