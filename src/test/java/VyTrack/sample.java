package VyTrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class sample {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbgfbb"));
        String actualText = btn1.getAttribute("value");
        String expectedText = "Im Feeling Lucky";
        if(actualText.equals(expectedText)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected text: "+expectedText);
            System.out.println("Actual text "+ actualText);
        }
        Thread.sleep(3000);
        driver.quit();
    }

}


