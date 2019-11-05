package io.severex.qa.service.service;

import io.severex.qa.service.manager.ApplicationManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseService {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeClass
    public void setUp(String browser) {
        app.init(browser);
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }
}
