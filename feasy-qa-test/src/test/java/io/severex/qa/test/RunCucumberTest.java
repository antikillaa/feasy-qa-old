package io.severex.qa.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/resources/scenario", tags = {"~@1", "~@2", "~@3"}
)
public class RunCucumberTest {
}
