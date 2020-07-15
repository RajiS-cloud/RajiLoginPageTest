package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass {

   // @FindBy(how = How.NAME, using = "uid")
    WebElement username;
    WebElement password;
    WebElement loginButtin;
    WebElement homepageUsername;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public void browseToLoginPage(){
      /*
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String str1 = driver.getPageSource();
        System.out.println(str1);
       */

      driver.get("http://demo.guru99.com/V4");
      String  getLoginPageTitle = driver.getTitle();
      System.out.println("Login page Title " + getLoginPageTitle + "\n");
    }

    public void loginWithUsernameandPassword(){
        username = driver.findElement(By.name("uid"));
        password =driver.findElement(By.name("password"));
        username.sendKeys("mgr123");
        password.sendKeys("mgr!23");
    }

    public void clickLogin(){
        loginButtin =driver.findElement(By.name("btnLogin"));
        loginButtin.click();
    }

    public void loginHomepage(){
        String guru99Username;
        homepageUsername = driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mgr123')]"));
        guru99Username= homepageUsername.getText();
        //Verify home page
        Assert.assertEquals(guru99Username,"Manger Id : mgr123");
        System.out.println("The Guru99 Homepage Username: " + guru99Username + "\n");
    }

}
