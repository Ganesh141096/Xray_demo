package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue ={"classpath:stepDef"},
        plugin = {"pretty", "json:cucumber-report.json"},
        monochrome = true
)

public class TestRunner {
}
