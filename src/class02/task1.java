package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Zahra");
        driver.findElement(By.id("customer.lastName")).sendKeys("Sadeghi");
        driver.findElement(By.id("customer.address.street")).sendKeys("USA");
        driver.findElement(By.id("customer.address.city")).sendKeys("FairFax");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22033");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2342345543");
        driver.findElement(By.id("customer.ssn")).sendKeys("2342345543");
        driver.findElement(By.id("customer.username")).sendKeys("ZS");
        driver.findElement(By.id("customer.password")).sendKeys("ABC");
        driver.findElement(By.id("repeatedPassword")).sendKeys("ABC");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
