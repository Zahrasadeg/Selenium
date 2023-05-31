package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        ///send in user name
        driver.findElement(By.id("email")).sendKeys("zahra");
        //send the password
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        //click new acount
        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();
    }
}
