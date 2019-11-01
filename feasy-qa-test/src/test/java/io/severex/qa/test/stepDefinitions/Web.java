package io.severex.qa.test.stepDefinitions;

import cucumber.api.java.en.Given;
import io.severex.qa.service.service.BaseService;

public class Web {

    BaseService baseService = new BaseService();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        baseService.setUp();
    }
}
