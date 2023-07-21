package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features ="src/test/java/com.feature",
glue = "com.stepdefinition",
monochrome=true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
