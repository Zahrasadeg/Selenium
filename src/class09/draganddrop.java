package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        //get the element that want to drag
        WebElement draggable = driver.findElement(By.id("draggable"));
        //get the droppable
        WebElement droppable = driver.findElement(By.id("droppable"));
        //action classA
        Actions action=new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();
    }
}
