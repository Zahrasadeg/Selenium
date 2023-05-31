package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
//connect
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //initiate
        WebDriver driver=new ChromeDriver();
        //openning google.com
        driver.get("https://google.com");
        Thread.sleep(2000);
        //now navigate facebook.com
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        Thread.sleep(2000);
        // go to face book again
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();
    }
}
