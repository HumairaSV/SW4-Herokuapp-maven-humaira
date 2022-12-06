package com.herokuapp.internet_the.pages;

import com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By usernameField = By.id("username");
    By passwordField = By.id("password");


    public void getPageTitle(){
        System.out.println("Page Title: "+ driver.getTitle());
    }

    public void getTheCurrentUrl(){
        System.out.println("Current Url: "+driver.getCurrentUrl());
    }

    public void printThePageSource(){
        System.out.println("Page Source: " +  driver.getPageSource());
    }

    public void enterUsername(String username){
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
}
