package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
        textbox.sendKeys("adracadabra");
        //parent window
        driver.switchTo().defaultContent();
        //find the text
        WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());
        //get the text enter your name
        driver.switchTo().frame("iframe_a");
        WebElement getlable = driver.findElement(By.xpath("//label"));
        System.out.println("the lable is "+getlable.getText());
        driver.switchTo().defaultContent();
        //clear what ever in the text box
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textbox.clear();
    }
}
