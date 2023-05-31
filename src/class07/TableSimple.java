package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //print the table
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String Table = table.getText();
        System.out.println(Table);
        //row by row
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for(WebElement row:Rows){
//            extract text from each row
            String row_text = row.getText();
            if(row_text.contains("Google")){
                System.out.println(row_text);
            }

        }

        //column level//table[@id='customers']/tbody/tr/td

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            System.out.println(column.getText());
        }

        //print just the 1 column
        List<WebElement> c=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement co:c){
            System.out.println(co.getText());
        }
        List<WebElement>cou=driver.findElements(By.xpath("//Table[@id='customers']/tbody/tr/td[3 ]"));
    }
}
