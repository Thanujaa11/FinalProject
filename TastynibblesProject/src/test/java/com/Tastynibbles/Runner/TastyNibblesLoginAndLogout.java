package com.Tastynibbles.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.TastyNibbles.Feature\\LoginAndLogout.feature",
glue= {"com.Tastynibbles.StepDefinition"},
plugin={"pretty","html:target/cucumberReport/report2.html"},monochrome=true
)
public class TastyNibblesLoginAndLogout extends AbstractTestNGCucumberTests{
	
}