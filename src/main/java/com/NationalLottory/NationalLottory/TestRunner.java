package com.NationalLottory.NationalLottory;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "Feature"
      , glue =  "stepDefinition"
      //,dryRun = true
      //,plugin = { "pretty", "html:target/htmlreports" }
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
