package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploead {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
    choosefile.sendKeys("C:/Users/zhomd/OneDrive/Desktop/New Text Document.txt");
    }
}
