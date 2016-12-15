/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/GoogleSearch.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
		"classpath:com.cucumber.framework.helper" }, plugin = { "pretty",
		"json:target/GoogleSearch.json" })
public class GoogleSearchRunner extends AbstractTestNGCucumberTests {
}
