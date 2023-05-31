package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement Femalebtn = driver.findElement(By.cssSelector("input[value='Female']"));
       boolean select= Femalebtn.isSelected();
        System.out.println(" the bottun is selected "+select);
        if(!select){
            Femalebtn.click();
        }
        System.out.println(Femalebtn.isSelected());
    }
}
