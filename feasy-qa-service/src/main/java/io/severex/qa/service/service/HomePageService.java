package io.severex.qa.service.service;

import io.severex.qa.model.HomePage;

public class HomePageService {

    HomePage homePage = new HomePage();

    public void clickRegistrationButton() {
        homePage.getRegistrationButton().click();
    }
}
