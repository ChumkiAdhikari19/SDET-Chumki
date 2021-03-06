package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
			features=".//Features/Login.feature",   // specify where exactly our feature file is available
			glue= "stepdefinations",				// specify where exactly step are implemented
			dryRun=true,							//with actual execution initially it will cross check every feature file contains corresponding step definition or not
			plugin= {"pretty",						//pretty will give us the output in console window very clearly, each and evry steps we can see very clearly
					"html:test-output"}				// it will generate html report under test output folder//gexsearch
				
		)

		
public class TestRun {
	
	

}
