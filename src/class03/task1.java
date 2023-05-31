package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter')]")).sendKeys("This is zahra");
        driver.findElement(By.xpath("//input[contains(@id,'sum1')]")).sendKeys("5");
        driver.findElement(By.xpath("//input[contains(@id,'sum2')]")).sendKeys("5");
        driver.findElement(By.xpath("//button[contains(@onclick,'return total()')]")).click();

    }
}
