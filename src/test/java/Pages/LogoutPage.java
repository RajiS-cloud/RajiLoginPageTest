package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.*;

public class LogoutPage extends BaseClass{

    WebElement logoutGuru99;

    public LogoutPage(WebDriver driver){
            this.driver= driver;
    }

    public void clickLogout() throws InterruptedException {

        /*
           Actions act = new Actions(driver);
           act.moveToElement(logoutGuru99).build().perform();  // taking mouse

        */

        // Create instance of Javascript executor
        // JavascriptExecutor je = (JavascriptExecutor) driver;
        // Identify the WebElement which will appear after scrolling down
        // logout= driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", logoutGuru99);

         logoutGuru99= driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
         logoutGuru99.click();
         Thread.sleep(500);
         driver.quit();

    }
}
