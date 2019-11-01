package io.severex.qa.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/src/test/java/io/severex/qa/test/stepDefinitions", //the path of the feature files
        glue = {"stepDefinitions"}, //the path of the step definition files
        plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true, //display the console output in a proper readable format
        strict = true, //it will check if any step is not defined in step definition file
        tags = {"~@SmokeTest", "~@RegressionTest", "~@End2End"})
public class RunCucumberTest {
}
