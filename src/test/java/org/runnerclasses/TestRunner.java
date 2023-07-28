package org.runnerclasses;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile1",
				glue="org.stepdefintion",
				snippets=SnippetType.CAMELCASE,monochrome=true,strict=true,dryRun=false,
				tags= {"@smoke"},plugin= {"pretty",
				"json:src\\test\\resources\\Reports\\json\\json.json",
				"rerun:src\\test\\resources\\Rerunfiles\\failed.txt"})


public class TestRunner {

	@AfterClass
	public static void report() {
		JvmReport.generateReport("src\\test\\resources\\Reports\\json\\json.json");

	}
	
	
}


