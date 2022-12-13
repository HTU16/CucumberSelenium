package com.krafttech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-html-reports.html"},        // pom : page object model demek..
        features = "@target/rerun.txt",                        // hatalı features larda bu sekilde yazıyoruz.
        glue = "com/krafttech/step_definitions"

)

public class FailedTestRunner {
}
