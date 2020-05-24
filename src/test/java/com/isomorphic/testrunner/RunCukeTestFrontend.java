package com.isomorphic.testrunner;

/**
 *
 * @author nimit.jain
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin   = { "pretty", 
							  "json:target/cucumber-report.json",
					 		  "html:target/cucumber-report.html" }, 
				
				features = "src/test/resources/features/frontend/",

				 glue = {"com.isomorphic.stepdefs"},
				 
						 tags= {"@sigin"},
						 
						 monochrome=true
                         
)  
				
public class RunCukeTestFrontend {

}

