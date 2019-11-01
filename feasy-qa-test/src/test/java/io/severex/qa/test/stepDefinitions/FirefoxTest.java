package io.severex.qa.test.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxTest {
    private final WebDriver driver = new FirefoxDriver();

    @Given("I am on the Google search page")
    public void i_am_on_the_Google_search_page() {
        driver.get("https:\\www.google.com");
        throw new cucumber.api.PendingException();
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("test");
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
        throw new cucumber.api.PendingException();
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String string) {
        // Google's search is rendered dynamically with JavaScript
        // Wait for the page to load timeout after ten seconds
        new WebDriverWait(driver, 10L).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("titleStartsWith");
            }
        });
        throw new cucumber.api.PendingException();
    }
}

class FindingSomeCheese {
    public String findingSomeCheese() {
        return null;
    }
}
