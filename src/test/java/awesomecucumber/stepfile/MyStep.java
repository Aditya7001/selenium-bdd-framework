package awesomecucumber.stepfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MyStep {
    WebDriver driver;

    @Given("User is on login page with browser {string} url {string}")
    public void userIsOnLoginPage(String browser, String url) {
            if(browser.equals("chrome"))
            {
                ChromeOptions options = new ChromeOptions();
                driver = new ChromeDriver(options);
            }else if(browser.equals("firefox"))
            {
            }
            else
            {
                System.out.println("Please provide a proper browser value..");
            }
            driver.manage().window().fullscreen();
            //driver.manage().deleteAllCookies();
            driver.get(url);
    }

    @When("User enter valid email and password")
    public void userEnterValidEmailAndPassword() {

    }

    @And("User click on login button")
    public void userClickOnLoginButton() {

    }

    @Then("User should redirect to home page.")
    public void userShouldRedirectToHomePage() {
    }

    @Then("user is on homepage")
    public void verifyHomepage() {
        WebElement ele=driver.findElement(By.xpath("//img[@title='Your Store']"));
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(ele));
        Assert.assertTrue(ele.isDisplayed(),"Test script failed as element is not displayed on the screen");
    }
}
