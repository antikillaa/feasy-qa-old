package io.severex.qa.test.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.severex.qa.service.impl.BaseService;
import io.severex.qa.service.impl.TestrailServiceImpl;
import io.severex.qa.service.service.TestrailService;
import org.junit.Test;

public class Web {

    BaseService baseService = new BaseService();
    TestrailService testrailService = new TestrailServiceImpl();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        baseService.setUp();
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @Test
    public void createtestrailRun() {
        testrailService.createSuite();
    }
}
