package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private MyAccountPage myAccountPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToMyAccount() {
        homePage.clickAccountLink();
    }

    @Step
    public void enterRegistrationCredentials(String emailRegistration, String passRegistration) {
        myAccountPage.setEmailFieldRegistration(emailRegistration);
        myAccountPage.setPassFieldRegistration(passRegistration);
    }
    @Step
    public void clickRegister(){
        myAccountPage.clickRegister();
    }

}
