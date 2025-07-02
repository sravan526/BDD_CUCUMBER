package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",           // Path to feature files
    glue = {"StepDefinations"},                         // Corrected package name
    monochrome = true,                                  // Clean console output
    dryRun = false,                                     // Set to true to check step definitions without executing
    plugin = {
        "pretty",
        "html:target/HTMLReports/report.html",
        "json:target/JSONReports/report.json",
        "junit:target/JUnitReports/report.xml"
    },
    tags = "@smoketest"                                 // Run scenarios with this tag
)
public class TestRunner {
    // No need to add methods here; JUnit+Cucumber handles everything via annotations
}
