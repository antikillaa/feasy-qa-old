package io.severex.qa.model;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
    @FindBy(how=How.XPATH, using="//div[text()='Become an Author']")
    private SelenideElement becomeAutorButton;


    @FindBy(how=How.ID, using="form_email")
    private SelenideElement emailInputField;


    @FindBy(how=How.ID, using="form_firstName")
    private SelenideElement firstNameInputField;


    @FindBy(how=How.ID, using="form_lastName")
    private SelenideElement lastInputField;


    @FindBy(how=How.ID, using="form_password")
    private SelenideElement passwordInputField;


    @FindBy(how=How.ID, using="form_agreement")
    private SelenideElement agreementCheckBox;


    @FindBy(how= How.XPATH, using="//button[@type='submit']")
    private SelenideElement submitButton;

}
