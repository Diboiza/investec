package investec.step_definitons;

import investec.pages.HomePage;
import investec.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;



public class MyStepDefinitions {
    @Steps
    HomePage homePage;
    SignUpPage signUpPage;

    @Given(": User navigates to the investec website")
    public void userNavigatesToTheInvestecWebsite()
    {
        homePage.navigate_to_home();
    }


    @Then(": User must be on the home page")
    public void userMustBeOnTheHomePage()
    {
        homePage.i_am_on_homePage();
    }

    @When(": They click on the search link")
    public void theyClickOnTheSearchLink()
    {
        homePage.click_search_link();
    }

    @And(": Searches for {string}")
    public void searchesFor(String searchText)
    {
        homePage.searchForText(searchText);
    }

    @Then(": We should get a link that has points to {string}")
    public void weShouldGetALinkThatHasPointsTo(String linkAddress)
    {
        homePage.check_search_result(linkAddress);
    }

    @Given(": User navigates to the cash investment rates page")
    public void userNavigatesToTheCashInvestmentRatesPage()
    {
        signUpPage.navigate_cash_investment_rates_page();
    }

    @When(": The click the sign up button")
    public void theClickTheSignUpButton()
    {
        signUpPage.navigate_cash_investment_rates_page();
    }

    @And(": fill in the form with {string} {string} {string}")
    public void fillInTheFormWith(String name, String surname, String email)
    {
        signUpPage.sign_up(name, surname, email);
    }

    @Then(": A Thank you message should be displayed")
    public void aThankYouMessageShouldBeDisplayed() {
        signUpPage.assert_process_succesful();
    }
}
