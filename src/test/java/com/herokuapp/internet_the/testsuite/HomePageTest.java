package com.herokuapp.internet_the.testsuite;

import com.herokuapp.internet_the.pages.HomePage;
import com.herokuapp.internet_the.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();


    @Test
    public void verifyElementsOnHomePage(){
        homePage.getPageTitle();
        homePage.getTheCurrentUrl();
        homePage.printThePageSource();
        homePage.enterUsername("tomsmith");
        homePage.enterPassword("SuperSecretPassword!");
    }
}
