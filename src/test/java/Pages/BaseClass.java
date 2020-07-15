package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass()
    {
        System.out.println(System.getProperty("user.dir"));
        String chromePath = System.getProperty("user.dir")+"\\src\\test\\Resources\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

    }
    public WebDriver getDriver()
    {
        return driver;
    }

}
