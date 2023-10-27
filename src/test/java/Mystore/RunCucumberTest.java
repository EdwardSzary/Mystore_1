package Mystore;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//glue = {"helpers", "src.test.java.steps"},
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Mystore/Userdata.feature",
        glue = {"Mystore"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
        //format = {"pretty"})

public final class RunCucumberTest {

}
