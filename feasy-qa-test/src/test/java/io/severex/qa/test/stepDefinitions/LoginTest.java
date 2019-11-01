package io.severex.qa.test.stepDefinitions;

import io.severex.qa.service.service.BaseService;
import org.junit.Test;

public class LoginTest {
    BaseService baseService = new BaseService();

    //    @cucumber.api.java.en.Given("open landing page")
    @Test
    public void openLandingPage() {
        baseService.setUp();

    }
}
