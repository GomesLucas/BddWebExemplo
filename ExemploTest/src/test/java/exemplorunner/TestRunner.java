package exemplorunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(glue = {"exemploglue"}, 
				 features = {"src/test/resources"},
				 plugin = {"html:target/cucumber"},
				 tags = {"@Test"})
public class TestRunner {

}
