/**
 * @author Naresh Narmala
 *
 * December 13, 2016
 */
package com.cucumber.framework.stepdefinition;

import com.cucumber.framework.helper.PageObject.googlepage.GooglePage;
import com.cucumber.framework.settings.ObjectRepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.testng.Assert;


public class GoogleSearch {
	
	private GooglePage gPage;

	@Given("^: I am at the google seach page$")
	public void openGooglePage() throws Throwable {
		ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());
		gPage = new GooglePage(ObjectRepo.driver);
		ObjectRepo.data.put("GooglePage", gPage);


	}


	@When("^: I type paxos in search and submit$")
	public void typePaxosInGoogleSearch() throws Throwable {
		gPage.sendKeys("paxos");
		Thread.sleep(2000);
		gPage.clickGoogleSearch();
		Thread.sleep(2000);

	}

	@Then("^: Paxos BankChain appears on search results$")
	public void validateSearchResults() throws Throwable {
		List<WebElement> results = gPage.searchResults;
		// Finally, we'll loop over the list to verify each result link contains our term
		boolean found = false;
		for (int i = 0; i < results.size(); i++) {
			String resultText = results.get(i).getText();
			System.out.println(resultText);

			if (resultText.contains("Paxos | Bankchain")) {
				found = true;
				break;
			}
		}

		// Verify Paxos Bankchain appears on the search results page.
		Assert.assertTrue(found, "Paxos | Bankchain");

		String browserUrl = gPage.getUrl();
		// Verify the browser url includes the searched term (paxos)
		Assert.assertTrue(browserUrl.contains("paxos"), "browserUrl doesnot contain paxos");

	}

	}


