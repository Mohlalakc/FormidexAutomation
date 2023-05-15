package StepDefinitions;

import Browser.InitialiseBrowser;
import Utilities.Config;
import Utilities.ScreenShots;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.SneakyThrows;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.*;

import static Browser.InitialiseBrowser.driver;


public class LoginStepDefinition extends ScreenShots {
    InitialiseBrowser initialiseBrowser = new InitialiseBrowser();
    String screenshotPath = "src/test/resources/Screenshots/Login/";
    Config config = new Config();
    FormsPage formsPage = new FormsPage();
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    RyzeLandingPage ryzeLandingPage = new RyzeLandingPage();
    TechStudyPage techStudyPage =  new TechStudyPage();

    @After
    public void tearDown(Scenario scenario) throws Exception{
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        driver.quit();
    }
//    @Given("Ryze website is open and I am on a login page open on {string} {string}")
//    public void ryze_website_is_open_and_i_am_on_a_login_page_open_on(final String browser, final String env) {
//        try {
//            initialiseBrowser.initialize(browser, env);
//            this.takeSnapShot(screenshotPath + "Login.png");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
@Given("Ryze website is open and I am on a login page open on {string} {string}")
public void ryze_website_is_open_and_i_am_on_a_login_page_open_on(String browser, String env) {
    try {
            initialiseBrowser.initialize(browser, env);
            this.takeSnapShot(screenshotPath + "Login.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    @When("I login with {string} and {string} credentials")
    public void i_login_with_and_credentials(String Username, String string2) {
        loginPage.enterUserName(Username);
    }
    @Then("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I login to Ryze medical application")
    public void i_login_to_ryze_medical_application() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();


    }


}
