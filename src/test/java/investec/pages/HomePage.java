package investec.pages;



import investec.ReUsableSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.matchers.BeanMatcher;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;


@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

    @Steps
    ReUsableSteps steps;

    @FindBy(xpath = "//*[@id=\"Layer_1\"]")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"search-toggle\"]/a")
    public static WebElement searchLink;

    @FindBy(xpath = "//*[@id=\"searchBarInput\"]")
    public static WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"searchBarButton\"]/a/button")
    public static WebElement searchBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/a")
    public static WebElement cashInvestmentRatesLink;

    @Title("Launch browser and navigate to the ilab homepage")
    public void navigate_to_home(){
        open();
        steps.shortWait();

    }

    @Title("Assert I am on the home page")
    public void i_am_on_homePage()
    {
        shouldBeVisible(logo);
    }

    @Title("Click on the search link")
    public void click_search_link()
    {
        steps.clickOn(searchLink);
        steps.shortWait();
        shouldBeVisible(searchInput);
    }

    @Title("search for text")
    public void searchForText(String text){
        typeInto(searchInput, text);
        steps.clickOn(searchBtn);
    }

    @Step
    public void check_search_result(String linkAddress)
    {
        shouldBeVisible(cashInvestmentRatesLink);
        String href = cashInvestmentRatesLink.getAttribute("href");
        //Assert the link attribute
        Assert.assertEquals(href, linkAddress);
    }

    @Step
    public void navigate_to_interestRates()
    {
        steps.clickOn(cashInvestmentRatesLink);
    }


}

