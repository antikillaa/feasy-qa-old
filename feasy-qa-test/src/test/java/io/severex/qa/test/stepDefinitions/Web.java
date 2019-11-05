package io.severex.qa.test.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.severex.qa.service.service.BaseService;
import io.severex.qa.service.service.TestrailService;
import org.junit.Test;

public class Web {

    BaseService baseService = new BaseService();
    TestrailService testrailService = new TestrailService();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        String string = "any";
        baseService.setUp(string);
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @Test
    public void createtestrailRun() {
        testrailService.createSuite();
    }
}
