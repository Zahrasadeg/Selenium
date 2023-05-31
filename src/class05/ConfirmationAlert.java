package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
       //click
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switch to because of pop up
        Alert alert =driver.switchTo().alert();
        //click ok
        Thread.sleep(2000);
        alert.accept();
//click on prompt btn
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch
        Thread.sleep(2000);
        alert.sendKeys("alert");
        Thread.sleep(2000);
        //accept it
        alert.accept();


    }
}
