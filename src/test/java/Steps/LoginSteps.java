package Steps;

import Pages.BaseClass;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {

    WebDriver driver = new ChromeDriver();

    LoginPage login = new LoginPage(driver);
    LogoutPage logout = new LogoutPage(driver);


    @Given("^I land on the Login page url$")
    public void iLandOnTheLoginPageUrl() {

        login.browseToLoginPage();

    }

    @When("^I enter the username and password$")
    public void iEnterTheUsernameAndPassword() {

        login.loginWithUsernameandPassword();

    }

    @Then("^I can land on homepage$")
    public void iCanLandOnHomepage() {

        login.clickLogin();
        login.loginHomepage();

    }

    @And("^I logout from homepage$")
    public void iLogoutFromHomepage() throws InterruptedException {

       logout.clickLogout();
    }
}
