package com.osa.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		dryRun=false,
		features={"src/test/java/com/osa/features"},
		glue="com.osa.steps",
		tags= {"@regression"},
		monochrome=true,
		plugin= {"json:target/cucumber.json","pretty", "html:target/cucumber-reports"}
	
		)
public class Regresssion extends AbstractTestNGCucumberTests{

}
