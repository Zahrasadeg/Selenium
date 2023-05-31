package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        //send useer name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //pass
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click login
        driver.findElement(By.className("button")).click();

    }
}
