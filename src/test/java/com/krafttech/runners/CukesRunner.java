package com.krafttech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",     // rapor almamızı sağlar. xml ile birlikte
        "html:target/default-html-reports"},           // 2.yol rapor alma, verify yapmaya gerek kalmamış olur.
        features = "src/test/resources/features",
        glue = "com/krafttech/step_definitions",
        dryRun =false,                            // true dersek tanımlanmamış stepleri bize verir.
        tags ="@wip"                              // tags sadece yazdığımız senaryoyu calıştırır.
                                                   // and - or - not yaparak coğaltabiliriz..

)


public class CukesRunner {
}
