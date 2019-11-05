package io.severex.qa.test.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.severex.qa.service.service.BaseService;
import io.severex.qa.service.service.HomePageService;

public class HomePageStepDefinition {

    BaseService baseService = new BaseService();
    HomePageService homePageService = new HomePageService();

    @When("I click registration button")
    public void clickRegistrationButton() {
        homePageService.clickRegistrationButton();
    }


}
