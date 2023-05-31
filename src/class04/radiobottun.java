package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radiobottun {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        List<WebElement>radiobtn=driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement radio:radiobtn){
            System.out.println(radio.getAttribute("value"));
           String age=radio.getAttribute("value");
        //if value 5-10 click
            if(age.equalsIgnoreCase("5 - 15")){
                radio.click();
            }
        }

    }
}
