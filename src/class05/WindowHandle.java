package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

            WebDriver driver=new ChromeDriver();
            driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2063008467%3A1678243289320747&authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
            driver.findElement(By.xpath("//a[text()='Help']")).click();
            driver.findElement(By.xpath("//a[text()='Privacy']")).click();
           //window handle of parent
            String parentwindowhandle=driver.getWindowHandle();
        System.out.println(parentwindowhandle);
        //get windows handle of all the windows that hab=ve been opened
        Set<String> windowhandels = driver.getWindowHandles();
        //print them
        for(String wh:windowhandels) {
       //switch focus
            driver.switchTo().window(wh);
            //check the title of the window to witch our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        }
        //verify my switched to the right window
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentwindowhandle);


    }
}
