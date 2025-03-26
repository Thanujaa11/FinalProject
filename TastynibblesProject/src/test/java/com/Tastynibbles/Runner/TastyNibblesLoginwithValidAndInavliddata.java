package com.Tastynibbles.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.TastyNibbles.Feature\\LoginwithValidandInvalidScenario.feature",
glue= {"com.Tastynibbles.StepDefinition"},
plugin={"pretty","html:target/cucumberReport/report3.html"},monochrome=true
)
public class TastyNibblesLoginwithValidAndInavliddata extends AbstractTestNGCucumberTests{
	
}