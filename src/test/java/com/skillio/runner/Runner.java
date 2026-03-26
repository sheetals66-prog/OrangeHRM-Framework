package com.skillio.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Parameterization.feature",
    glue = "com.skillio.stepdefinations.Parameterization"
   
)
public class Runner extends AbstractTestNGCucumberTests {

}