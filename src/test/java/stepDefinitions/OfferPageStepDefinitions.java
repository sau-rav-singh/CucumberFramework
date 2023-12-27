package stepDefinitions;

import TestUtils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.OffersPage;

public class OfferPageStepDefinitions {

    TestContextSetup testContextSetup;

    public OfferPageStepDefinitions(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

    @Then("^User searches for (.*) shortname in offers page$")
    public void userSearchedForNameShortnameInOffersPage(String productName) {
        OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
        offersPage.clickTopDeals();
        testContextSetup.genericUtils.switchToOffersPage();
        testContextSetup.productsOnDeal = offersPage.searchProduct(productName);
    }

    @And("Validate that product name in offers page matches with Landing Page")
    public void validateProductNameInOffersPageMatchesWithLandingPage() {
        Assert.assertEquals(testContextSetup.productsOnDeal, testContextSetup.searchResults, "Name Assert");
    }
}
