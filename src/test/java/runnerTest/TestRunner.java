package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-html-reports/cucumber.json", "junit:target/cucumber-xml-reports/cucumber.xml"},
        //This create auto method name in camelCase
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        //Path to your feature file
        features = {"src/test/resources/features"},
        // Specify tags to be executed
        tags = {"@messenger"},
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepDefinition"}

)

public class TestRunner {

}
