package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//glue source root not content root
//plugin default report info.txt 2 lines
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/nopcommerce/demo/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html" ,
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression and not @smoke"
)

public class RunCukeTest extends AbstractTestNGCucumberTests {

}
// features pack under resources
// steps under test
//default report
//from info.txt, extent report
//for test output folder
