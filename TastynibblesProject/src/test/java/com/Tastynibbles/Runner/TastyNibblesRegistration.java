package com.Tastynibbles.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.Tastynibbles.Feature\\Registration1.feature",
glue= {"com.Tastynibbles.StepDefinition"},
plugin={"pretty","html:target/cucumberReport/report.html"},monochrome=true
)
public class TastyNibblesRegistration extends AbstractTestNGCucumberTests{
	
}