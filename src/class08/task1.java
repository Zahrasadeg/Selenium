package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        List<WebElement> nameColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[3]"));
        for (int i=0;i<nameColumn.size();i++){
            String names=nameColumn.get(i).getText();
            if(names.startsWith("S")){
                System.out.println(names);
                System.out.println("the row that contains screen saver is "+i);
                WebElement checkbox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]"));
                checkbox.click();
            }
        }
    }
}
