package runner_repoository;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\featuress_file\\product_search_through_searchbar.feature",
glue = "Test_repo",
plugin = {"pretty","html:target/report_01.html"}
)


public class Test_repo_01 {

}
