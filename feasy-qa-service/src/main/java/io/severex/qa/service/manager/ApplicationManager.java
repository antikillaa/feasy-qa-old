package io.severex.qa.service.manager;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ApplicationManager {
    private static String driverPath = null;
    public WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();
    private String browser;
    private String env;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init(String browser) {
        if (browser.equals(BrowserType.CHROME)) {
//            driverPath = FilenameUtils.separatorsToSystem("webdriver/linux/chromedriver"); //linux
            driverPath = FilenameUtils.separatorsToSystem("webdriver/win/chromedriver.exe"); //win
            System.setProperty("webdriver.chrome.driver", ApplicationManager.driverPath);
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driverPath = FilenameUtils.separatorsToSystem("webdriver/linux/geckodriver");
            System.setProperty("webdriver.gecko.driver", ApplicationManager.driverPath);
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
        driver.manage().timeouts().setScriptTimeout(100, SECONDS);


    }


    public void stop() {
        driver.quit();
    }
}
