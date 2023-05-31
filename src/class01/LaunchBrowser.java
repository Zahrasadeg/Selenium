package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //creat an instance of webd
        WebDriver driver=new ChromeDriver();
        //open the web google.com
        driver.get("https://www.facebook.com/");
        //get the current url that is there in the browser
        String URL = driver.getCurrentUrl();
        //print the url
        System.out.println(URL);
        //get the title of the browser
        String title =driver.getTitle();
        //print the title of the page
        System.out.println("the title of the page is "+title);
//slow down for 3 sec
        Thread.sleep(3000);
        //close the browser
        driver.quit();
    }
}
