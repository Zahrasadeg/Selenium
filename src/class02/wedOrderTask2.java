package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wedOrderTask2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        //verify title "Web Orders"
        String title=driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();

        //close browser
        driver.quit();

    }
}
