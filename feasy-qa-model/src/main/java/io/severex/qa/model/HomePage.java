package io.severex.qa.model;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how= How.XPATH, using="//button/span[text()='Registration']")
    private SelenideElement registrationButton;

    public void setRegistrationButton(SelenideElement registrationButton) {
        this.registrationButton = registrationButton;
    }

    public SelenideElement getRegistrationButton() {
        return registrationButton;
    }
}
