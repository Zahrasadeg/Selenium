package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        // click n male
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        //check if radio enable or no
        boolean isenable=maleBtn.isEnabled();
        System.out.println("the radio btn is enabled "+isenable);
        //check the btn is dislpayed
        boolean isdes=maleBtn.isDisplayed();
        System.out.println(isdes);
        //check if male btn selected
        boolean selec=maleBtn.isSelected();
        System.out.println("male btn is selected "+selec);
        //if the radio btn not clicked so click on it
        if(!selec){
            maleBtn.click();
        }
        //checkis seleckted o rno
        selec=maleBtn.isSelected();
        System.out.println("the status of selection is "+selec);

    }
}
