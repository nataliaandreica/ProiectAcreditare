package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.DashboardPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.junit.Assert;

public class LoginSteps {

    private DashboardPage dashboardPage;
    private HomePage homePage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToLogin(){
        homePage.clickAccountLink();
      //  homePage.clickOnLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        myAccountPage.setEmailField(email);
        myAccountPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        myAccountPage.clickLogin();
    }

    @Step
    public void checkLoggedIn(String user){
        Assert.assertTrue(dashboardPage.checkHelloText(user));
    }

    @Step
    public void login(String user, String pass){
        navigateToHomepage();
        goToLogin();
        enterCredentials(user,pass);
        clickLogin();
    }
}


