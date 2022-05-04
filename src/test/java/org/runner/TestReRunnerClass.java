package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefintion",dryRun=false,snippets=SnippetType.CAMELCASE,tags= {"@smoke"}, plugin= {"html:target\\reports","junit:target\\reports\\obs.xml","json:target\\reports\\output.json"})
 


public class TestReRunnerClass {
	
	@AfterClass
	public static void greens() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\output.json");

	}


}
