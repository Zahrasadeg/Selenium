package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement DD=driver.findElement(By.xpath("//Select[@id='multi-select']"));
        //use select class
        Select sel=new Select(DD);
        sel.selectByValue("New Jersey");
        sel.deselectByValue("New Jersey");
        Thread.sleep(2000);
        sel.selectByVisibleText("Ohio");
        sel.deselectByVisibleText("Ohio");
        Thread.sleep(2000);
        sel.selectByIndex(4);
        //when it comes to multi dropdown we can also deselect
        System.out.println("the drop down is multiple " +sel.isMultiple());

    }
}
