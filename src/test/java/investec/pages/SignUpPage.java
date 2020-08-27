package investec.pages;

import investec.ReUsableSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.openqa.selenium.WebElement;

@DefaultUrl("page:home.page/en_za/focus/money/understanding-interest-rates.html")
public class SignUpPage extends PageObject
{
    @Steps
    ReUsableSteps steps;

    @FindBy(xpath = "//*[@id=\"content\"]/div[6]/div/div[2]/div/div[2]/div[1]/h1")
    private WebElement heading;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div[1]/button")
    private WebElement signUpBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/section/fieldset[2]/div[1]/text-input/div/div[1]/input")
    private WebElement nameInputField;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/section/fieldset[2]/div[2]/text-input/div/div[1]/input")
    private WebElement surnameInputField;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/section/fieldset[2]/div[3]/text-input/div/div[1]/input")
    private WebElement emailInputField;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/section/fieldset[2]/div[4]/checkbox-input/div/div/div[1]/button")
    private WebElement myselfTickBox;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[1]/section/fieldset[3]/button")
    private WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[7]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div/div/form/div[2]/div/div/div[1]/h4")
    private WebElement thankYouText;

    @Title("Launch Browser and navigate to interest rates page")
    public void navigate_cash_investment_rates_page()
    {
        open();
        steps.shortWait();
        shouldBeVisible(heading);
    }

    @Title("Sign up to receive insights")
    public void sign_up(String name, String surname, String email)
    {
        steps.clickOn(signUpBtn);
        typeInto(nameInputField, name);
        typeInto(surnameInputField, surname);
        typeInto(emailInputField, email);
        steps.clickOn(myselfTickBox);
        steps.clickOn(submitBtn);
    }

    @Title("Ensure sign up process is succesful")
    public void assert_process_succesful()
    {
        shouldBeVisible(thankYouText);
    }
}
