package io.severex.qa.test.stepDefinitions;

import com.codeborne.selenide.SelenideDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.severex.qa.service.service.BaseService;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class BaseStepDefinition {

    BaseService baseService = new BaseService();
    protected WebDriver driver;
    private String uri = "https://grinfer.com/";

    @Before
    public void setUp() {
        SelenideDriver driver = new SelenideDriver(CHROME);
        driver = new ChromeDriver();
    }

    @Given("Go to the {string} page")
    public void iAmOnTheHomePage(String string) {
        driver.get(uri + string);
    }

    @Given("Open {string} browser")
    public void openBrowser(String string) {
        String browser;
        switch (string) {
            case "Chrome":
                browser = BrowserType.CHROME;
                break;
            case "Firefox":
                browser = BrowserType.FIREFOX;
            default:
                throw new IllegalArgumentException("Wrong browser");
        }
        baseService.setUp(browser);
    }
}
