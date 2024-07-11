package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// glue, exatamente onde estão os steps, nome do pacote, package -> não aceita nada diferente

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "test", plugin = { "pretty" })
public class TestRunner {

}
