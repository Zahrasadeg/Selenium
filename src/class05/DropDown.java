package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropdown = driver.findElement(By.xpath("//Select[@id='select-demo']"));
       //use select class because it has select
        Select sel=new Select(dropdown);
        Thread.sleep(2000);
        sel.selectByIndex(2);

        //select by value
        Thread.sleep(2000);
        sel.selectByValue("Tuesday");

        //select by visible text
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");




    }
}
