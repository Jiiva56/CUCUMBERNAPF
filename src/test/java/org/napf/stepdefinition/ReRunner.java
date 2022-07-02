package org.napf.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="@./src/test/resources/failed/failed.txt",
				glue = "org.napf.stepdefinition",
				monochrome = true,dryRun = false,
				plugin ={"html:target/report","json:target/Reportjson",
						"rerun:src/test/resources/failed/failed.txt"} )
				
public class ReRunner {

}
