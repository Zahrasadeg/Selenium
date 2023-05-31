package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement op3 = driver.findElement(By.cssSelector("input[value='Option-3']"));
        boolean tick=op3.isSelected();
        System.out.println("option 3 is selected "+tick);
        if(!tick){
            op3.click();
        }
        System.out.println(op3.isSelected());
    }
}
