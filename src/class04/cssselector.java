package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement createnewbtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createnewbtn.click();
        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("abracdabra");

    }
}
