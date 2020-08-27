package investec;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import java.text.DecimalFormat;
import java.util.Random;

public class ReUsableSteps extends PageObject {
    @Step
    public void waitForPresenceOfElement(String xpath) {
        waitForPresenceOf(xpath);
    }

    @Step
    public void shortWait() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step
    public String genaratePhoneNumber() {

        Random rand = new Random();
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);

        DecimalFormat df3 = new DecimalFormat("000");
        DecimalFormat df4 = new DecimalFormat("0000");

        String phoneNumber = "083" + "-" + df3.format(num2) + "-" + df4.format(num3);

        return phoneNumber;
    }
}
